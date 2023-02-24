package com.mps.think.setup.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.CustomerDetails;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails, Integer> {

	public CustomerDetails findBycustomerId(Integer customerId);

//	@Query("SELECT c From CustomerDetails c WHERE " 
//			+ "(c.fname LIKE '%'||:firstName||'%' OR :firstName IS NULL)"
//			+ "AND (c.lname LIKE '%'||:lastName||'%' OR :lastName IS NULL)")
//	public Page<CustomerDetails> getAllCustomerDetailsForSearch(@Param("firstName") String firstName,
//			@Param("lastName") String lastName, Pageable page);
	
	@Query("SELECT cd FROM CustomerDetails cd JOIN cd.customerAddresses cda JOIN cda.address cadd WHERE "
			+ "CONCAT(cadd.addressName, ' ', cadd.addressId, ' ', cadd.name, ' ', cadd.city, ' ', cadd.countryCode, ' ' ,cadd.addressType, ' ' ,cadd.addressLine1,' ', cadd.addressLine2, ' '"
			+ ",cadd.state,' ',cadd.addressCategory, ' ',cadd.country, ' ', cadd.frequency, ' ', cadd.phone, ' '"
			+ ", cadd.addressAuxJSON) LIKE '%'||:search||'%' OR "
			+ "cadd.zipCode LIKE '%'||:search||'%' OR "
			+ "cd.customerId LIKE '%'||:search||'%' OR "
			+ "cd.fax LIKE '%'||:search||'%' OR "
			+ "(cd.institutionalId LIKE '%'||:search||'%') OR "
			+ "(cd.parentInstitutionalId LIKE '%'||:search||'%') OR "
			+ "CONCAT(cd.fname, ' ', cd.lname, ' ', cd.company, ' ', cd.department, ' ', cd.email, ' ' ,cd.initialName, ' ',cd.suffix, ' ', cd.countryCode, ' ', cd.primaryPhone, ' ', cd.mobileNumber, ' ', cd.taxId, ' ', COALESCE(cd.secondaryEmail, ''), ' ', COALESCE(cd.secondaryPhone, ''), ' ',cd.listRental, ' ', cd.salesRepresentative, ' ', cd.creditStatus, ' ', cd.fax, ' ', COALESCE(cd.newOrderCommission, ''), ' ', COALESCE(cd.renewalCommission, ''), ' ',COALESCE(cd.paymentThreshold, ''), ' ',COALESCE(cd.custAuxFieldJSON, '')) LIKE '%'||:search||'%'"
			+ "GROUP BY cd.customerId")
	public Page<CustomerDetails> getAllCustomerDetailsForSearchSingle(@Param("search") String search, Pageable page);

}
