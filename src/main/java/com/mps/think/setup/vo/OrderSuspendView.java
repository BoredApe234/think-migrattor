package com.mps.think.setup.vo;

import com.mps.think.setup.model.SuspendOrder;

public class OrderSuspendView {

	private OrderCompactView order;

	private SuspendOrder suspendDetails;

	public OrderSuspendView(OrderCompactView order, SuspendOrder suspendDetails) {
		super();
		this.order = order;
		this.suspendDetails = suspendDetails;
	}

	public OrderCompactView getOrder() {
		return order;
	}

	public void setOrder(OrderCompactView order) {
		this.order = order;
	}

	public SuspendOrder getSuspendDetails() {
		return suspendDetails;
	}

	public void setSuspendDetails(SuspendOrder suspendDetails) {
		this.suspendDetails = suspendDetails;
	}

}
