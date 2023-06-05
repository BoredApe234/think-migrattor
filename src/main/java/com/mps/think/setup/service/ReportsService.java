package com.mps.think.setup.service;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mps.think.setup.model.CancelOrder;
import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.PaymentInformation;
import com.mps.think.setup.vo.CancelSubscirptionReportView;
import com.mps.think.setup.vo.DailyCashReportView;
import com.mps.think.setup.vo.EnumModelVO.Currency;

public interface ReportsService {

	Page<Order> getAllOrderReports(String orderStatus, Date ordersFrom, Date ordersTill, Integer customerId,
			String customerName, Pageable page);
	
	Page<CustomerDetails>getAllCustomerSearchReport(Integer pubId, Integer customerId, String fname, String lname, String initialName,
			String email, String company, String department, String country, String state, String city, Integer zipCode, Pageable page);
	
    Page<CancelSubscirptionReportView> getAllCancelledSubscriptions(Date orderFrom, Date orderTill, String currencyType, Pageable page);
    
	Page<Order> getAllCustomerSalesList(Date oredrStart, Date orderEnd, String orderType, Pageable page);
	
	Page<DailyCashReportView> getAllDailyCashReport(Date paymentStart, Date paymentEnd, Pageable page);

	

	

}
