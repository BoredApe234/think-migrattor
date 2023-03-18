package com.mps.think.setup.serviceImpl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrderCodesSuper;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.CustomerDetailsRepo;
import com.mps.think.setup.service.AddOrderService;
import com.mps.think.setup.service.CustomerDetailsService;
import com.mps.think.setup.vo.CustomerDetailsVO;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private CustomerDetailsRepo customerRepo;
	
	@Autowired
	private AddOrderService orderService;
	
	@Autowired
	private AddOrderRepo orderRepo;
	
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
	public CustomerDetails saveCustomerDetails(CustomerDetailsVO customerDetails) {
		ObjectMapper mapper = new ObjectMapper();
		CustomerDetails newCustomer = mapper.convertValue(customerDetails, CustomerDetails.class);
		CustomerDetails cdata=customerRepo.saveAndFlush(newCustomer);
		return cdata;
	}

	@Override
	public CustomerDetails updateCustomerDetails(CustomerDetailsVO customerDetails) {
		ObjectMapper mapper = new ObjectMapper();
		CustomerDetails updatedCustomer = mapper.convertValue(customerDetails, CustomerDetails.class);
		CustomerDetails cdata=customerRepo.saveAndFlush(updatedCustomer);
		return cdata;
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
	public Page<CustomerDetails> getAllCustomerDetailsForSearch(Integer pubId, String search, Pageable page) {
		// TODO Auto-generated method stub
		return customerRepo.getAllCustomerDetailsForSearchSingle(pubId, search, page);
	}

	@Override
	public Page<CustomerDetails> findAllCustomerByPubId(Integer pubId, Pageable page) {
		return customerRepo.findByPublisherId(pubId, page);
	}
	
	public Map<Integer, List<OrderCodesSuper>> fetchRecentTwoOrderCode(Integer customerId) throws Exception {
		Map<Integer, List<OrderCodesSuper>> response = new HashMap<>();
		response.put(customerId, orderService.getRecentTwoOrderOfCustomer(customerId));
		return response;
	}
	
	@Override
	public List<Map<Integer, List<OrderCodesSuper>>> GetAllCustomerRecentOrderCodeForPub(Integer pubId) {
		Integer numCustomers = customerRepo.countCustomersInPublisher(pubId);
		if (numCustomers < 1) {
			return new ArrayList<Map<Integer, List<OrderCodesSuper>>>(0);
		} 
		List<Map<Integer, List<OrderCodesSuper>>> orderCodes = customerRepo.findByPublisherId(pubId, PageRequest.of(0, numCustomers)).stream().map(c -> {
			try {
				return fetchRecentTwoOrderCode(c.getCustomerId());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}).collect(Collectors.toList());
		return orderCodes;
	}

	@Override
	public Order getRecentOrderOfCustomer(Integer customerId) throws Exception {
		List<Order> orders = orderService.getAllOrderByCustomerId(customerId, PageRequest.of(0, 1, Sort.by("orderId").descending())).toList();
		if (!orders.isEmpty()) {
			return orders.get(0);
		}
//		throw new NoSuchElementException("customer does not have any order");
		return null;
	}

	@Override
	public Integer countOfOrdersForGivenCustomerInYear(Integer customerId, String year) {
		return orderRepo.findOrderCountForCustomerInYear(customerId, year).size();
	}
	
}



