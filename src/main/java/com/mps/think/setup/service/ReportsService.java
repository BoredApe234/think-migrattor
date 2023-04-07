package com.mps.think.setup.service;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Order;

public interface ReportsService {

	Page<Order> getAllOrderReports(String orderStatus, Date ordersFrom, Date ordersTill, Integer customerId,
			String customerName, Pageable page);
	
	Page<CustomerDetails>getAllCustomerSearchReport(Integer customerId, String fname, String lname, String initialName,
			String email, String company, String department, String country, String state, String city, Integer zipCode, Pageable page);
	

}
