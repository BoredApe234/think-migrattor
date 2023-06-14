package com.mps.think.setup.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DailyCashReportView {
	
	private BigDecimal netAmount;
	
	private BigDecimal taxAmount;
	
	private BigDecimal shippingCharge;
	
	private BigDecimal commission;
	
	private BigDecimal totalAmount;
	
	private Date paymentDate;
	
	private Integer orderId;
	
	private String currency;
	
	private Integer customerId;
	
	private List<OrderAddressMappingVO> addresses;

	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public BigDecimal getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(BigDecimal shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public List<OrderAddressMappingVO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<OrderAddressMappingVO> addresses) {
		this.addresses = addresses;
	}

	
	
	
	

}
