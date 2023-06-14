package com.mps.think.setup.vo;

import java.util.Date;

import com.mps.think.setup.model.PaymentBreakdown;
import com.mps.think.setup.vo.EnumModelVO.OrderStatus;

public class OrderCompactView {

	private Integer orderId;
	
	private Integer parentOrderId;
	
	private String currentOrderStatus;
	
	private String orderCode;
	
	private PaymentBreakdown payment;
	
	private Date startDate;
	
	private Date endDate;
	
	private Integer customerId;
	
	private String customerFirstName;
	
	private String customerLastName;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getParentOrderId() {
		return parentOrderId;
	}

	public void setParentOrderId(Integer parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public PaymentBreakdown getPayment() {
		return payment;
	}

	public void setPayment(PaymentBreakdown payment) {
		this.payment = payment;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCurrentOrderStatus() {
		return currentOrderStatus;
	}

	public void setCurrentOrderStatus(String currentOrderStatus) {
		this.currentOrderStatus = currentOrderStatus;
	}
	
}
