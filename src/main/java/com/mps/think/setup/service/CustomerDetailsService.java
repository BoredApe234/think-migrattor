package com.mps.think.setup.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.vo.CustomerDetailsVO;

public interface CustomerDetailsService {
	
	public List<CustomerDetails> getAllCustomerDetails();
	
	public Page<CustomerDetails> getAllCustomerDetailsForSearch(String firstName, String lastName, Pageable page);

	public CustomerDetailsVO saveCustomerDetails(CustomerDetailsVO customerDetails);

	public CustomerDetailsVO updateCustomerDetails(CustomerDetailsVO customerDetails);

	public CustomerDetails findbyCustomerDetailsId(Integer customerId);
	
	public List<CustomerDetails> findAllCustomersWithAddresses();

}
