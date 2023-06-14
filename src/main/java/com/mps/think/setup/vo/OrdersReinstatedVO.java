package com.mps.think.setup.vo;

public class OrdersReinstatedVO {

	private OrderVO order;
	
	private ReinstateSuspendVO suspendOrder;

	public OrderVO getOrder() {
		return order;
	}

	public void setOrder(OrderVO order) {
		this.order = order;
	}

	public ReinstateSuspendVO getSuspendOrder() {
		return suspendOrder;
	}

	public void setSuspendOrder(ReinstateSuspendVO suspendOrder) {
		this.suspendOrder = suspendOrder;
	}
	
	
	
}
