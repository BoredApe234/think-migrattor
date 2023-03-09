package com.mps.think.setup.serviceImpl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.mps.think.setup.model.CustomerDetails;

import com.mps.think.setup.repo.CustomerDetailsRepo;
import com.mps.think.setup.service.CustomerDetailsService;
import com.mps.think.setup.vo.CustomerDetailsVO;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private CustomerDetailsRepo customerRepo;
	
	@Override
	public List<CustomerDetails> getAllCustomerDetails() {
		return customerRepo.findAll();
	}

//	@Override
//	public Page<CustomerDetails> getAllCustomerDetailsForSearch(String firstName, String lastName, Pageable page) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public CustomerDetailsVO saveCustomerDetails(CustomerDetailsVO customerDetails) {
		ObjectMapper mapper = new ObjectMapper();
		CustomerDetails newCustomer = mapper.convertValue(customerDetails, CustomerDetails.class);
		customerRepo.saveAndFlush(newCustomer);
		return customerDetails;
	}

	@Override
	public CustomerDetailsVO updateCustomerDetails(CustomerDetailsVO customerDetails) {
		ObjectMapper mapper = new ObjectMapper();
		CustomerDetails updatedCustomer = mapper.convertValue(customerDetails, CustomerDetails.class);
		customerRepo.saveAndFlush(updatedCustomer);
		return customerDetails;
	}

	@Override
	public CustomerDetails findbyCustomerDetailsId(Integer customerId) {
		return customerRepo.findById(customerId).get();
	}

	@Override
	public CustomerDetails deleteCustomer(Integer customerId) {
		CustomerDetails customerToDelete = findbyCustomerDetailsId(customerId);
		customerRepo.delete(customerToDelete);
		return customerToDelete;
	}

	@Override
	public Page<CustomerDetails> getAllCustomerDetailsForSearch(String search, Pageable page) {
		// TODO Auto-generated method stub
		return customerRepo.getAllCustomerDetailsForSearchSingle(search, page);
	}

	@Override
	public List<CustomerDetails> findAllCustomerByPubId(Integer pubId) {

		return customerRepo.findAllCustomerByPubId(pubId);
	}
	
}
