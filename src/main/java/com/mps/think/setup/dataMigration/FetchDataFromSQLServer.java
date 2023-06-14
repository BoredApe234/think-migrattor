package com.mps.think.setup.dataMigration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.Addresses;
import com.mps.think.setup.model.CustomerAddresses;
import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.AddressesRepo;
import com.mps.think.setup.repo.CustomerAddressesRepo;
import com.mps.think.setup.repo.CustomerCategoryRepo;
import com.mps.think.setup.repo.CustomerDetailsRepo;
import com.mps.think.setup.repo.PublisherRepo;
import com.mps.think.setup.vo.EnumModelVO.AddressType;
import com.mps.think.setup.vo.EnumModelVO.Status;
import com.stripe.model.Address;

@Service
public class FetchDataFromSQLServer {

	@Value("${sqlserverconfig}")
	String connection;

	@Value("${user}")
	String username;

	@Value("${pass}")
	String password;

	@Autowired
	PublisherRepo pubRepo;

	@Autowired
	CustomerDetailsRepo cusRepo;
	
	@Autowired
	CustomerCategoryRepo custCatRepo;
	
	@Autowired
	AddressesRepo addressRepo;
	
	@Autowired
	CustomerAddressesRepo customerAddressRepo;

	BasicDataSource ds = new BasicDataSource();

//	String query = "select * from customer_address ca where ca.customer_address_seq = 7;";
	
	String query = "select * from customer";
	
	Map<String, Integer> fillCustCategory() {
		Map<String, Integer> mp = new HashMap<>();
		for (CustomerCategory cc : custCatRepo.findAll()) {
			mp.put(cc.getCustCategory(), cc.getCustomerCategoryId());
		}
		return mp;
	}
	
	String getName(String fname, String lname) {
		if (fname == null && lname == null) return null;
		else if (fname == null) return lname;
		else if (lname == null) return fname;
		else return fname + " " + lname;
	}
	
	public Map<Integer, List<Addresses>> fillAddressTable() throws SQLException {
		ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		ds.setUrl(connection);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMaxTotal(-1); // Maximum number of connections in the pool
		
		// Connect to the database
		Connection conn = ds.getConnection();

		// Execute a prepared statement to retrieve data
		PreparedStatement stmt = conn.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();

		// Set fetch size to retrieve 100 rows at a time
		rs.setFetchSize(1000);
		
		Map<Integer, List<Addresses>> customerAddMp = new HashMap<>();
		
		while (rs.next()) {
			Addresses a = new Addresses();
//			a.setAddressName(connection);
			
			if (rs.getString("address_type").equals("BUSINESS")) a.setAddressType(AddressType.Business);
			else if (rs.getString("address_type").equals("RESIDENCE")) a.setAddressType(AddressType.Residential);
			else a.setAddressType(AddressType.Other);
			
//			a.setAddressCategory(connection);
			a.setStatus(Status.Active);
//			a.setPrimaryAddress(null);
			a.setName(getName(rs.getString("fname"), rs.getString("lname")));
			a.setAddressLine1(rs.getString("address1"));
			a.setAddressLine2(rs.getString("address2"));
			a.setZipCode(rs.getString("zip"));
			a.setCity(rs.getString("city"));
			a.setState(rs.getString("state"));
			a.setCountry(rs.getString("county"));
//			a.setCountryCode(connection);
			a.setPhone(rs.getString("phone"));
//			a.setValidFrom(null);
//			a.setValidTo(null);
//			a.setFrequency(query);
//			a.setSelectionFrom(connection);
//			a.setSelectionTo(connection);
//			a.setAddressAuxJSON(connection);
			
			Addresses newAddress = addressRepo.saveAndFlush(a);
			
			List<Addresses> addressList = customerAddMp.getOrDefault(rs.getInt("customer_id"), new ArrayList<>());
			addressList.add(newAddress);
			customerAddMp.put(rs.getInt("customer_id"), addressList);
			
		}
		conn.close();
		return customerAddMp;
		
	}
	
	public String fillCustomerAddressMapping() throws SQLException {
		Map<Integer, List<Addresses>> caMap = fillAddressTable();
		List<CustomerAddresses> customerAddresses = new ArrayList<>();
		
		for (Entry<Integer, List<Addresses>> m : caMap.entrySet()) {
			Integer customerId = m.getKey();
			CustomerDetails customerDetails = cusRepo.findById(customerId).get();
			m.getValue().forEach(a -> {
				CustomerAddresses ca = new CustomerAddresses();
				ca.setCustomer(customerDetails);
				ca.setAddress(a);
				customerAddresses.add(ca);
			});
		}
		
		customerAddressRepo.saveAllAndFlush(customerAddresses);
		return "done";
	}
	
	public <T> List<T> fetchRows(Class<T> type) {

		try {
			// Set up connection pooling
			ds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			ds.setUrl(connection);
			ds.setUsername(username);
			ds.setPassword(password);
			ds.setMaxTotal(-1); // Maximum number of connections in the pool

			// Connect to the database
			Connection conn = ds.getConnection();

			// Execute a prepared statement to retrieve data
			PreparedStatement stmt = conn.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			// Set fetch size to retrieve 100 rows at a time
			rs.setFetchSize(1000);

			Publisher pub1 = pubRepo.findById(1).get();

			List<T> allRows = new ArrayList<>();
			
			Map<String, Integer> customerCategories = fillCustCategory();
			
			CustomerCategory custCatCash = custCatRepo.findById(1).get();
			CustomerCategory custCatCredit = custCatRepo.findById(2).get();
			int count = 0;
			// Process the retrieved data
			while (rs.next()) {
				System.out.println(++count);
				CustomerDetails cd = new CustomerDetails();
				cd.setCustomerId(rs.getInt("customer_id"));
//				if (rs.getString("customer_category") == null) {
//					cd.setCustomerCategory(null);
//				} else {
//					cd.setCustomerCategory(custCatRepo.findById(customerCategories.get(rs.getString("customer_category"))).get());
//				}
				if (rs.getString("customer_category") == null) {
					cd.setCustomerCategory(null);
				} else if (rs.getString("customer_category").equals("Cash")) {
					cd.setCustomerCategory(custCatCash);
				} else if (rs.getString("customer_category").equals("Credit")) {
					cd.setCustomerCategory(custCatCredit);
				}
				cd.setSalutation(rs.getString("salutation"));
				cd.setFname(rs.getString("fname"));
				cd.setLname(rs.getString("lname"));
				cd.setInitialName(rs.getString("initial_name"));
				cd.setSuffix(rs.getString("suffix"));
				cd.setCompany(rs.getString("company"));
//	        	cd.setDepartment(tableName); could not find
				cd.setEmail(rs.getString("email"));
//	        	cd.setCountryCode(tableName);
//	        	cd.setPrimaryPhone(tableName);
//	        	cd.setMobileNumber(tableName);
//	        	cd.setTaxId(tableName);
//	        	cd.setTaxExempt(null);
//	        	cd.setSecondaryEmail(tableName);
//	        	cd.setSecondaryPhone(tableName);
				cd.setListRental(rs.getString("list_rental_category"));
				cd.setSalesRepresentative("");
//	        	cd.setCreditStatus(tableName);
//	        	cd.setFax(rs.get);
//	        	cd.setInstitutionalId(null);
//	        	cd.setParentInstitutionalId(null);
//	        	cd.setChargeTaxOn(null);
//	        	cd.setPaymentOptions(null);
//	        	cd.setConfigurationOptionsforOrders(null);
//	        	cd.setNewOrderCommission(tableName);
//	        	cd.setRenewalCommission(tableName);
//	        	cd.setPaymentThreshold(tableName);
				cd.setCreatedAt(rs.getDate("creation_date"));
				cd.setPublisher(pub1);
				allRows.add((T) cd);
			}

			// Close the database connection
			conn.close();
//			ds.close();

			return allRows;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
	
	List<CustomerDetails> transfer() {
		List<CustomerDetails> rows = fetchRows(CustomerDetails.class);
		int count = 0;
		System.out.println("----------------------------------------------------------------------------");
		for (CustomerDetails c : rows) {
			System.out.println("saving row: " + ++count);
			cusRepo.save(c);
		}
		cusRepo.flush();
		return rows;
	}
	
	String transfer1() throws SQLException {
		return fillCustomerAddressMapping();
	}

}
