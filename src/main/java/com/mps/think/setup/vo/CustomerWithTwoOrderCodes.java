package com.mps.think.setup.vo;

import java.util.List;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.OrderCodes;

public class CustomerWithTwoOrderCodes {

	private CustomerDetails customer;
	
	private List<OrderCodes> orderCodes;

	public CustomerDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	public List<OrderCodes> getOrderCodes() {
		return orderCodes;
	}

	public void setOrderCodes(List<OrderCodes> orderCodes) {
		this.orderCodes = orderCodes;
	}
	
	
	
}
