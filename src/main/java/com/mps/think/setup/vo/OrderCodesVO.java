package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class OrderCodesVO {
	
	private Integer id;
	
//	private Integer publisherId;
	
	private String orderCode;
	
	private String description;
	
	/*
	 * @Enumerated(EnumType.STRING)
	 * 
	 * @Column(name = "order_type") private OrderType orderType;
	 */
	
	private String orderType;
	
	private String orderCodeId;
	
	private String orderClassId;

//	private Boolean active;
	
	private String rateCard;
	
	private String discountCard;
	
	private String shipToAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderCodeId() {
		return orderCodeId;
	}

	public void setOrderCodeId(String orderCodeId) {
		this.orderCodeId = orderCodeId;
	}

	public String getOrderClassId() {
		return orderClassId;
	}

	public void setOrderClassId(String orderClassId) {
		this.orderClassId = orderClassId;
	}

	public String getRateCard() {
		return rateCard;
	}

	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}

	public String getDiscountCard() {
		return discountCard;
	}

	public void setDiscountCard(String discountCard) {
		this.discountCard = discountCard;
	}

	public String getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	@Override
	public String toString() {
		return "OrderCodesVO [id=" + id + ", orderCode=" + orderCode + ", description=" + description + ", orderType="
				+ orderType + ", orderCodeId=" + orderCodeId + ", orderClassId=" + orderClassId + ", rateCard="
				+ rateCard + ", discountCard=" + discountCard + ", shipToAddress=" + shipToAddress + "]";
	}
}
