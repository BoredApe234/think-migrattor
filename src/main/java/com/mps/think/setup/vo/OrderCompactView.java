package com.mps.think.setup.vo;

import java.util.Date;

import com.mps.think.setup.model.PaymentBreakdown;
import com.mps.think.setup.vo.EnumModelVO.OrderStatus;

public class OrderCompactView {

	private Integer orderId;
	
	private Integer parentOrderId;
	
	private OrderStatus currentOrderStatus;
	
	private String orderCode;
	
	private PaymentBreakdown payment;
	
	private Date startDate;
	
	private Date endDate;

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

	public OrderStatus getCurrentOrderStatus() {
		return currentOrderStatus;
	}

	public void setCurrentOrderStatus(OrderStatus currentOrderStatus) {
		this.currentOrderStatus = currentOrderStatus;
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
	
	
	
}
