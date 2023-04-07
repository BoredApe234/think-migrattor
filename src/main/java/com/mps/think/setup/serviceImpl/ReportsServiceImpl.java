package com.mps.think.setup.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.CustomerDetailsRepo;
import com.mps.think.setup.service.ReportsService;

@Service
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private AddOrderRepo orderRepo;
	
	@Autowired
	private CustomerDetailsRepo customerDetailsRepo;

	@Override
	public Page<Order> getAllOrderReports(String orderStatus, Date ordersFrom, Date ordersTill, Integer customerId,
			String customerName, Pageable page) {
		if (ordersFrom == null) ordersFrom = new Date(0);
		if (ordersTill == null) ordersTill = new Date();
		return orderRepo.findAllOrdersForReport(orderStatus, ordersFrom, ordersTill, customerId, customerName, page);
	}

	@Override
	public Page<CustomerDetails> getAllCustomerSearchReport(Integer customerId, String fname, String lname,
			String initialName, String email, String company, String department, String country, String state,
			String city, Integer zipCode, Pageable page) {
	
		return customerDetailsRepo.findCustomerSearchReport(customerId, fname, lname, initialName, email,
				                                             company, department, country, state, city, zipCode, page);
	}
	
}
