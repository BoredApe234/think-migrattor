package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class PaymentThresholdVO {

	private Integer paymentThresholdId;

	private Integer partialThreshold;

	private Integer underThreshold;

	private Integer overThreshold;

	private Integer refundThreshold;

	private Integer maxUnderpaymentForFull;

	private Integer maxUnderpaymentForPartial;

	private Integer maxOverpaymentForFull;

	private Integer maxOverpaymentForRefund;
	
	private Publisher publisher;

	public Integer getPaymentThresholdId() {
		return paymentThresholdId;
	}

	public void setPaymentThresholdId(Integer paymentThresholdId) {
		this.paymentThresholdId = paymentThresholdId;
	}

	public Integer getPartialThreshold() {
		return partialThreshold;
	}

	public void setPartialThreshold(Integer partialThreshold) {
		this.partialThreshold = partialThreshold;
	}

	public Integer getUnderThreshold() {
		return underThreshold;
	}

	public void setUnderThreshold(Integer underThreshold) {
		this.underThreshold = underThreshold;
	}

	public Integer getOverThreshold() {
		return overThreshold;
	}

	public void setOverThreshold(Integer overThreshold) {
		this.overThreshold = overThreshold;
	}

	public Integer getRefundThreshold() {
		return refundThreshold;
	}

	public void setRefundThreshold(Integer refundThreshold) {
		this.refundThreshold = refundThreshold;
	}

	public Integer getMaxUnderpaymentForFull() {
		return maxUnderpaymentForFull;
	}

	public void setMaxUnderpaymentForFull(Integer maxUnderpaymentForFull) {
		this.maxUnderpaymentForFull = maxUnderpaymentForFull;
	}

	public Integer getMaxUnderpaymentForPartial() {
		return maxUnderpaymentForPartial;
	}

	public void setMaxUnderpaymentForPartial(Integer maxUnderpaymentForPartial) {
		this.maxUnderpaymentForPartial = maxUnderpaymentForPartial;
	}

	public Integer getMaxOverpaymentForFull() {
		return maxOverpaymentForFull;
	}

	public void setMaxOverpaymentForFull(Integer maxOverpaymentForFull) {
		this.maxOverpaymentForFull = maxOverpaymentForFull;
	}

	public Integer getMaxOverpaymentForRefund() {
		return maxOverpaymentForRefund;
	}

	public void setMaxOverpaymentForRefund(Integer maxOverpaymentForRefund) {
		this.maxOverpaymentForRefund = maxOverpaymentForRefund;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
}
