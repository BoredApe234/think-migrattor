package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_codes")
public class OrderCodes extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7139609851214382595L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
//	@Column(name = "publisher_id")
//	private Integer publisherId;
	
	@Column(name = "order_code")
	private String orderCode;
	
	@Column(name = "description")
	private String description;
	
	/*
	 * @Enumerated(EnumType.STRING)
	 * 
	 * @Column(name = "order_type") private OrderType orderType;
	 */
	
	@Column(name = "order_type")
	private String orderType;
	
	@Column(name = "order_code_id")
	private String orderCodeId;
	
	@Column(name = "order_class_id")
	private String orderClassId;

//	@Column(name = "is_active")
//	private Boolean active;
	
	@Column(name = "rate_card")
	private String rateCard;
	
	@Column(name = "discount_card")
	private String discountCard;
	
	@Column(name = "ship_from")
	private String shipFrom;
	
	@Column(name = "ship_to_address")
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

	public String getShipFrom() {
		return shipFrom;
	}

	public void setShipFrom(String shipFrom) {
		this.shipFrom = shipFrom;
	}

	public String getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	@Override
	public String toString() {
		return "OrderCodes [id=" + id + ", orderCode=" + orderCode + ", description=" + description + ", orderType="
				+ orderType + ", orderCodeId=" + orderCodeId + ", orderClassId=" + orderClassId + ", rateCard="
				+ rateCard + ", discountCard=" + discountCard + ", shipFrom=" + shipFrom + ", shipToAddress="
				+ shipToAddress + "]";
	}
}
