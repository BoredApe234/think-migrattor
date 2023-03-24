package com.mps.think.setup.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mps.think.setup.model.Addresses;
import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrderCodesSuper;
import com.mps.think.setup.vo.CustomerDetailsVO;

public interface CustomerDetailsService {
	
	public List<CustomerDetails> getAllCustomerDetails();
	
//	public Page<CustomerDetails> getAllCustomerDetailsForSearch(String firstName, String lastName, Pageable page);
	public Page<CustomerDetails> getAllCustomerDetailsForSearch(Integer pubId, String search,  Pageable page);

	public CustomerDetails saveCustomerDetails(CustomerDetailsVO customerDetails);

	public CustomerDetails updateCustomerDetails(CustomerDetailsVO customerDetails);

	public CustomerDetails findbyCustomerDetailsId(Integer customerId);
	
	public Page<CustomerDetails> findAllCustomerByPubId(Integer pubId, Pageable page);
	
	public CustomerDetails deleteCustomer(Integer pubId);
	
	List<Map<Integer, List<OrderCodesSuper>>> GetAllCustomerRecentOrderCodeForPub(Integer pubId);

	Order getRecentOrderOfCustomer(Integer customerId) throws Exception;
	
	Integer countOfOrdersForGivenCustomerInYear(Integer customerId, String year);
	
	CustomerDetails updateCustomerStatus(CustomerDetailsVO customer);
	
	Page<Addresses> getAllRecentAddressFromCustomerOrders(Integer customerId, Pageable page);
	
	Page<CustomerDetails> getOtherCustomerAddresses(Integer customerId, Pageable page);
	
}
