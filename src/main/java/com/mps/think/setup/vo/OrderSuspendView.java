package com.mps.think.setup.vo;

import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.SuspendOrder;

public class OrderSuspendView {

	private Order order;
	
	private SuspendOrder suspendDetails;
	
	public OrderSuspendView(Order order, SuspendOrder suspendDetails) {
		super();
		this.order = order;
		this.suspendDetails = suspendDetails;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public SuspendOrder getSuspendDetails() {
		return suspendDetails;
	}

	public void setSuspendDetails(SuspendOrder suspendDetails) {
		this.suspendDetails = suspendDetails;
	}
	
}
