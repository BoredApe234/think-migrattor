package com.mps.think.setup.vo;

import com.mps.think.setup.model.OrderClass;

public class SourceCodeVO {

	private Integer sourceCodeId;
	private OrderClass ocId;
	private String description;
	private String orderCode;
	private String order_code_type;
	private Integer quantity;
	private Boolean isActive;
	private Boolean state_Break;
	private Integer cost;
	private Boolean isGenerated;
	private Integer generic_agency;
	private Integer is_ddp;
	private String sourceCodeType;
	private String sourceCode;
	private String sourceCodeFormat;
	private String rateCard;
	private Integer discount;
	private Integer shippingPriceList;

	public Integer getSourceCodeId() {
		return sourceCodeId;
	}

	public void setSourceCodeId(Integer sourceCodeId) {
		this.sourceCodeId = sourceCodeId;
	}

	public OrderClass getOcId() {
		return ocId;
	}

	public void setOcId(OrderClass ocId) {
		this.ocId = ocId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrder_code_type() {
		return order_code_type;
	}

	public void setOrder_code_type(String order_code_type) {
		this.order_code_type = order_code_type;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getState_Break() {
		return state_Break;
	}

	public void setState_Break(Boolean state_Break) {
		this.state_Break = state_Break;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Boolean getIsGenerated() {
		return isGenerated;
	}

	public void setIsGenerated(Boolean isGenerated) {
		this.isGenerated = isGenerated;
	}

	public Integer getGeneric_agency() {
		return generic_agency;
	}

	public void setGeneric_agency(Integer generic_agency) {
		this.generic_agency = generic_agency;
	}

	public Integer getIs_ddp() {
		return is_ddp;
	}

	public void setIs_ddp(Integer is_ddp) {
		this.is_ddp = is_ddp;
	}

	public String getSourceCodeType() {
		return sourceCodeType;
	}

	public void setSourceCodeType(String sourceCodeType) {
		this.sourceCodeType = sourceCodeType;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceCodeFormat() {
		return sourceCodeFormat;
	}

	public void setSourceCodeFormat(String sourceCodeFormat) {
		this.sourceCodeFormat = sourceCodeFormat;
	}

	public String getRateCard() {
		return rateCard;
	}

	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getShippingPriceList() {
		return shippingPriceList;
	}

	public void setShippingPriceList(Integer shippingPriceList) {
		this.shippingPriceList = shippingPriceList;
	}

	@Override
	public String toString() {
		return "SourceCodeVO [sourceCodeId=" + sourceCodeId + ", ocId=" + ocId + ", description=" + description
				+ ", orderCode=" + orderCode + ", order_code_type=" + order_code_type + ", quantity=" + quantity
				+ ", isActive=" + isActive + ", state_Break=" + state_Break + ", cost=" + cost + ", isGenerated="
				+ isGenerated + ", generic_agency=" + generic_agency + ", is_ddp=" + is_ddp + ", sourceCodeType="
				+ sourceCodeType + ", sourceCode=" + sourceCode + ", sourceCodeFormat=" + sourceCodeFormat
				+ ", rateCard=" + rateCard + ", discount=" + discount + ", shippingPriceList=" + shippingPriceList
				+ "]";
	}

}
