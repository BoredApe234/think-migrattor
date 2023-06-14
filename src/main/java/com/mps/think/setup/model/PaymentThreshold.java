package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Payment_threshold")
public class PaymentThreshold extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentThresholdId;
	
	@Column(name="code")
	private String paymentThresholdCode;
	
	@Column(name="description")
	private String paymentThresholdDescription;

	@Column(name = "partial_threshold")
	private Integer partialThreshold;

	@Column(name = "under_threshold")
	private Integer underThreshold;

	@Column(name = "over_threshold")
	private Integer overThreshold;

	@Column(name = "refund_threshold")
	private Integer refundThreshold;

	@Column(name = "max_under_payment_for_full")
	private Integer maxUnderpaymentForFull;

	@Column(name = "max_under_payment_for_partial")
	private Integer maxUnderpaymentForPartial;

	@Column(name = "max_over_payment_for_full")
	private Integer maxOverpaymentForFull;

	@Column(name = "max_over_payment_for_refund")
	private Integer maxOverpaymentForRefund;

	@Column(name = "over_payment_action")
	private String overpaymentAction;

	@Column(name = "under_payment_action")
	private String underpaymentAction;

	@Column(name = "over_payment_overrides")
	private boolean overpaymentOverrides;

	@Column(name = "under_payment_overrides")
	private boolean underpaymentOverrides;
	
	@Column(name = "default_status")
	private boolean status;

	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher publisher;

	public Integer getPaymentThresholdId() {
		return paymentThresholdId;
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

	public String getOverpaymentAction() {
		return overpaymentAction;
	}

	public void setOverpaymentAction(String overpaymentAction) {
		this.overpaymentAction = overpaymentAction;
	}

	public String getUnderpaymentAction() {
		return underpaymentAction;
	}

	public void setUnderpaymentAction(String underpaymentAction) {
		this.underpaymentAction = underpaymentAction;
	}

	public boolean isOverpaymentOverrides() {
		return overpaymentOverrides;
	}

	public void setOverpaymentOverrides(boolean overpaymentOverrides) {
		this.overpaymentOverrides = overpaymentOverrides;
	}

	public boolean isUnderpaymentOverrides() {
		return underpaymentOverrides;
	}

	public void setUnderpaymentOverrides(boolean underpaymentOverrides) {
		this.underpaymentOverrides = underpaymentOverrides;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void setPaymentThresholdId(Integer paymentThresholdId) {
		this.paymentThresholdId = paymentThresholdId;
	}

	public String getPaymentThresholdCode() {
		return paymentThresholdCode;
	}

	public void setPaymentThresholdCode(String paymentThresholdCode) {
		this.paymentThresholdCode = paymentThresholdCode;
	}

	public String getPaymentThresholdDescription() {
		return paymentThresholdDescription;
	}

	public void setPaymentThresholdDescription(String paymentThresholdDescription) {
		this.paymentThresholdDescription = paymentThresholdDescription;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PaymentThreshold [paymentThresholdId=" + paymentThresholdId + ", paymentThresholdCode="
				+ paymentThresholdCode + ", paymentThresholdDescription=" + paymentThresholdDescription
				+ ", partialThreshold=" + partialThreshold + ", underThreshold=" + underThreshold + ", overThreshold="
				+ overThreshold + ", refundThreshold=" + refundThreshold + ", maxUnderpaymentForFull="
				+ maxUnderpaymentForFull + ", maxUnderpaymentForPartial=" + maxUnderpaymentForPartial
				+ ", maxOverpaymentForFull=" + maxOverpaymentForFull + ", maxOverpaymentForRefund="
				+ maxOverpaymentForRefund + ", overpaymentAction=" + overpaymentAction + ", underpaymentAction="
				+ underpaymentAction + ", overpaymentOverrides=" + overpaymentOverrides + ", underpaymentOverrides="
				+ underpaymentOverrides + ", status=" + status + ", publisher=" + publisher + "]";
	}
	
}
