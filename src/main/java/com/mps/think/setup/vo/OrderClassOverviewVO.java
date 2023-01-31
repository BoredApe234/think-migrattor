package com.mps.think.setup.vo;

import com.mps.think.setup.model.ChildClass;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.SourceCode;
import com.mps.think.setup.model.SubChildClass;

public class OrderClassOverviewVO {

	private Integer id;

	private ParentClass parent;

	private ChildClass child;

	private SubChildClass subChild;

	// key information

	private String label;

	private String description;

	private OrderClass orderClass;

	private String revenueRecorded;

	private String recordRevenueSubsPartWay;

	private Boolean cancelCredit;

	//

	// Source codes

	private SourceCode sourceCode;

	private String sourceCodeFormat;

	private String renewalSCFormat;

	//

	// payments

	private String profitCenter;

	private String paymentThreshold;

	//

	// Other options

	private String reasonableGap;

	private String activeOrderHandling;

	//

	private Publisher publisher;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ParentClass getParent() {
		return parent;
	}

	public void setParent(ParentClass parent) {
		this.parent = parent;
	}

	public ChildClass getChild() {
		return child;
	}

	public void setChild(ChildClass child) {
		this.child = child;
	}

	public SubChildClass getSubChild() {
		return subChild;
	}

	public void setSubChild(SubChildClass subChild) {
		this.subChild = subChild;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OrderClass getOrderClass() {
		return orderClass;
	}

	public void setOrderClass(OrderClass orderClass) {
		this.orderClass = orderClass;
	}

	public String getRevenueRecorded() {
		return revenueRecorded;
	}

	public void setRevenueRecorded(String revenueRecorded) {
		this.revenueRecorded = revenueRecorded;
	}

	public String getRecordRevenueSubsPartWay() {
		return recordRevenueSubsPartWay;
	}

	public void setRecordRevenueSubsPartWay(String recordRevenueSubsPartWay) {
		this.recordRevenueSubsPartWay = recordRevenueSubsPartWay;
	}

	public Boolean getCancelCredit() {
		return cancelCredit;
	}

	public void setCancelCredit(Boolean cancelCredit) {
		this.cancelCredit = cancelCredit;
	}

	public SourceCode getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(SourceCode sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceCodeFormat() {
		return sourceCodeFormat;
	}

	public void setSourceCodeFormat(String sourceCodeFormat) {
		this.sourceCodeFormat = sourceCodeFormat;
	}

	public String getRenewalSCFormat() {
		return renewalSCFormat;
	}

	public void setRenewalSCFormat(String renewalSCFormat) {
		this.renewalSCFormat = renewalSCFormat;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public String getPaymentThreshold() {
		return paymentThreshold;
	}

	public void setPaymentThreshold(String paymentThreshold) {
		this.paymentThreshold = paymentThreshold;
	}

	public String getReasonableGap() {
		return reasonableGap;
	}

	public void setReasonableGap(String reasonableGap) {
		this.reasonableGap = reasonableGap;
	}

	public String getActiveOrderHandling() {
		return activeOrderHandling;
	}

	public void setActiveOrderHandling(String activeOrderHandling) {
		this.activeOrderHandling = activeOrderHandling;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	
}
