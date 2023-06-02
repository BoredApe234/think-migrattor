package com.mps.think.setup.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.mps.think.setup.model.PaymentBreakdown;

public class CancelSubscirptionReportView {

	private Integer orderId;
	
	private Integer customerId;
	
	private String customerFname;
	
	private String customerLname;
	
	private String orderCode;
	
	private Date cancelDate;
	
	private String cancelReason;
	
	private Integer totalIssues;
	
	private Integer issuesServed;

	private PaymentBreakdown paymentInfo;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFname() {
		return customerFname;
	}

	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}

	public String getCustomerLname() {
		return customerLname;
	}

	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Integer getTotalIssues() {
		return totalIssues;
	}

	public void setTotalIssues(Integer totalIssues) {
		this.totalIssues = totalIssues;
	}

	public Integer getIssuesServed() {
		return issuesServed;
	}

	public void setIssuesServed(Integer issuesServed) {
		this.issuesServed = issuesServed;
	}

	public PaymentBreakdown getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentBreakdown paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	
	
}
