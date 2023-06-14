package com.mps.think.setup.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.vo.EnumModelVO.PaymentStatus;

public class PaymentBreakdownVO {

	private Integer id;

	private String currencyType;

	private RateCards rateCard;

	private Date effectiveDate;

	private String paymentStatus;

	private String term;

	private BigDecimal baseAmount;
	
	private String currency;

	private String discount;

	private BigDecimal tax;

	private BigDecimal grossAmount;

	private BigDecimal commission;

	private BigDecimal shippingCharge;
	
	private BigDecimal netAmount;
	
	private Date rCardDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public RateCards getRateCard() {
		return rateCard;
	}

	public void setRateCard(RateCards rateCard) {
		this.rateCard = rateCard;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public BigDecimal getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(BigDecimal baseAmount) {
		this.baseAmount = baseAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(BigDecimal grossAmount) {
		this.grossAmount = grossAmount;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(BigDecimal shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	public Date getrCardDate() {
		return rCardDate;
	}

	public void setrCardDate(Date rCardDate) {
		this.rCardDate = rCardDate;
	}

	@Override
	public String toString() {
		return "PaymentBreakdownVO [id=" + id + ", currencyType=" + currencyType + ", rateCard=" + rateCard
				+ ", effectiveDate=" + effectiveDate + ", paymentStatus=" + paymentStatus + ", term=" + term
				+ ", baseAmount=" + baseAmount + ", currency=" + currency + ", discount=" + discount + ", tax=" + tax
				+ ", grossAmount=" + grossAmount + ", commission=" + commission + ", shippingCharge=" + shippingCharge
				+ ", netAmount=" + netAmount + ", rCardDate=" + rCardDate + "]";
	}

	

}
