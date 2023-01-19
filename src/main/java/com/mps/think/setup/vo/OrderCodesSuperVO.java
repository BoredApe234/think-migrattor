package com.mps.think.setup.vo;

import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.model.Publisher;

public class OrderCodesSuperVO {

	private Integer id;

	private Publisher publisher;

//	private Integer orderClassId;
	
	private ParentClass parent;

	private OrderCodesVO orderCodes;

	private OrderItemDetailsVO orderItemDetails;

	private OrderPaymentOptionsVO orderPaymentOptions;

	private OrderOptionsVO orderOptions;

	private OrderPackageOptionsVO orderPackageOptions;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Integer getOrderClassId() {
//		return orderClassId;
//	}
//
//	public void setOrderClassId(Integer orderClassId) {
//		this.orderClassId = orderClassId;
//	}

	public OrderCodesVO getOrderCodes() {
		return orderCodes;
	}

	public void setOrderCodes(OrderCodesVO orderCodes) {
		this.orderCodes = orderCodes;
	}

	public OrderItemDetailsVO getOrderItemDetails() {
		return orderItemDetails;
	}

	public void setOrderItemDetails(OrderItemDetailsVO orderItemDetails) {
		this.orderItemDetails = orderItemDetails;
	}

	public OrderPaymentOptionsVO getOrderPaymentOptions() {
		return orderPaymentOptions;
	}

	public void setOrderPaymentOptions(OrderPaymentOptionsVO orderPaymentOptions) {
		this.orderPaymentOptions = orderPaymentOptions;
	}

	public OrderOptionsVO getOrderOptions() {
		return orderOptions;
	}

	public void setOrderOptions(OrderOptionsVO orderOptions) {
		this.orderOptions = orderOptions;
	}

	public OrderPackageOptionsVO getOrderPackageOptions() {
		return orderPackageOptions;
	}

	public void setOrderPackageOptions(OrderPackageOptionsVO orderPackageOptions) {
		this.orderPackageOptions = orderPackageOptions;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public ParentClass getParent() {
		return parent;
	}

	public void setParent(ParentClass parent) {
		this.parent = parent;
	}
	
}
