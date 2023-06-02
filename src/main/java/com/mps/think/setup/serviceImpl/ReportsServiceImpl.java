package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.CancelOrder;
import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.CancelOrderRepo;
import com.mps.think.setup.repo.CustomerDetailsRepo;
import com.mps.think.setup.service.ReportsService;
import com.mps.think.setup.vo.CancelSubscirptionReportView;

@Service
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private AddOrderRepo orderRepo;
	
	@Autowired
	private CustomerDetailsRepo customerDetailsRepo;
	
	@Autowired
	private CancelOrderRepo cancelOrderRepo;
	
	@Autowired
	private AddOrderRepo addOrderRepo;

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

	@Override
	public Page<CancelSubscirptionReportView> getAllCancelledSubscriptions(Date orderFrom, Date orderTill, String currencyType,
			Pageable page) {
		Page<CancelOrder> allCancelledSubscriptions = cancelOrderRepo.findAllCancelledSubscriptions(orderFrom, orderTill, currencyType, "subscription" , page);
		List<CancelSubscirptionReportView> output = new ArrayList<>();
		
		allCancelledSubscriptions.toList().forEach(c -> {
			CancelSubscirptionReportView obj = new CancelSubscirptionReportView();
			obj.setOrderId(c.getOrderid().getOrderId());
			obj.setOrderCode(c.getOrderid().getKeyOrderInformation().getOrderCode().getOrderCodes().getOrderCode());
			obj.setCancelDate(c.getDate());
			obj.setCustomerFname(c.getOrderid().getCustomerId().getFname());
			obj.setCustomerLname(c.getOrderid().getCustomerId().getLname());
			obj.setPaymentInfo(c.getOrderid().getPaymentBreakdown());
			obj.setCancelReason(c.getCancelReasonsId().getCancelReason());
			obj.setTotalIssues(c.getOrderid().getOrderItemsAndTerms().getNumOfIssues());
			obj.setIssuesServed(c.getOrderid().getOrderItemsAndTerms().getIssue());
			obj.setCustomerId(c.getOrderid().getCustomerId().getCustomerId());
			output.add(obj);
		});
		
		return new PageImpl<>(output, allCancelledSubscriptions.getPageable(), allCancelledSubscriptions.getTotalElements());
		
	}

	@Override
	public Page<Order> getAllCustomerSalesList(Date oredrStart, Date orderEnd, String orderType,
			Pageable page) {
		if (oredrStart == null) oredrStart = new Date(0);
		if (orderEnd == null) orderEnd = new Date();
		return addOrderRepo.findAllCustomerSalesList(oredrStart, orderEnd, orderType, page);
	}

	

	
	
}
