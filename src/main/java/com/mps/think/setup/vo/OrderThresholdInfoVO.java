package com.mps.think.setup.vo;

import java.util.Date;

import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.SourceCode;
import com.mps.think.setup.model.Terms;

public class OrderThresholdInfoVO {
	private Integer id;
	private OrderClass orderClass;
	private String customerNbr;
	private Terms terms;
	private String orderNbr;
	private Date startDate;
	private Integer lineItem;
	private SourceCode sourceCode;
	private Date orderDate;
	private Order order;
	private double totalPaid;
	private String paymentStatus;
	private String underPaymentOption;
	private Date expirationOriginal;
	private Date expirationProrated;
	private Integer orderQuantityOriginal;
	private Integer orderQuantityProrated;
	private Integer remainingOriginal;
	private Integer remainingProrated;
	private double orderAmntSubsOriginal;
	private double orderAmntSubsProrated;
	private double orderAmntDeliveryOriginal;
	private double orderAmntDeliveryProrated;
	private double orderAmntTaxOriginal;
	private double orderAmntTaxProrated;
	private Publisher publisher;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OrderClass getOrderClass() {
		return orderClass;
	}
	public void setOrderClass(OrderClass orderClass) {
		this.orderClass = orderClass;
	}
	public String getCustomerNbr() {
		return customerNbr;
	}
	public void setCustomerNbr(String customerNbr) {
		this.customerNbr = customerNbr;
	}
	public Terms getTerms() {
		return terms;
	}
	public void setTerms(Terms terms) {
		this.terms = terms;
	}
	public String getOrderNbr() {
		return orderNbr;
	}
	public void setOrderNbr(String orderNbr) {
		this.orderNbr = orderNbr;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getLineItem() {
		return lineItem;
	}
	public void setLineItem(Integer lineItem) {
		this.lineItem = lineItem;
	}
	public SourceCode getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(SourceCode sourceCode) {
		this.sourceCode = sourceCode;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public double getTotalPaid() {
		return totalPaid;
	}
	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getUnderPaymentOption() {
		return underPaymentOption;
	}
	public void setUnderPaymentOption(String underPaymentOption) {
		this.underPaymentOption = underPaymentOption;
	}
	public Date getExpirationOriginal() {
		return expirationOriginal;
	}
	public void setExpirationOriginal(Date expirationOriginal) {
		this.expirationOriginal = expirationOriginal;
	}
	public Date getExpirationProrated() {
		return expirationProrated;
	}
	public void setExpirationProrated(Date expirationProrated) {
		this.expirationProrated = expirationProrated;
	}
	public Integer getOrderQuantityOriginal() {
		return orderQuantityOriginal;
	}
	public void setOrderQuantityOriginal(Integer orderQuantityOriginal) {
		this.orderQuantityOriginal = orderQuantityOriginal;
	}
	public Integer getOrderQuantityProrated() {
		return orderQuantityProrated;
	}
	public void setOrderQuantityProrated(Integer orderQuantityProrated) {
		this.orderQuantityProrated = orderQuantityProrated;
	}
	public Integer getRemainingOriginal() {
		return remainingOriginal;
	}
	public void setRemainingOriginal(Integer remainingOriginal) {
		this.remainingOriginal = remainingOriginal;
	}
	public Integer getRemainingProrated() {
		return remainingProrated;
	}
	public void setRemainingProrated(Integer remainingProrated) {
		this.remainingProrated = remainingProrated;
	}
	public double getOrderAmntSubsOriginal() {
		return orderAmntSubsOriginal;
	}
	public void setOrderAmntSubsOriginal(double orderAmntSubsOriginal) {
		this.orderAmntSubsOriginal = orderAmntSubsOriginal;
	}
	public double getOrderAmntSubsProrated() {
		return orderAmntSubsProrated;
	}
	public void setOrderAmntSubsProrated(double orderAmntSubsProrated) {
		this.orderAmntSubsProrated = orderAmntSubsProrated;
	}
	public double getOrderAmntDeliveryOriginal() {
		return orderAmntDeliveryOriginal;
	}
	public void setOrderAmntDeliveryOriginal(double orderAmntDeliveryOriginal) {
		this.orderAmntDeliveryOriginal = orderAmntDeliveryOriginal;
	}
	public double getOrderAmntDeliveryProrated() {
		return orderAmntDeliveryProrated;
	}
	public void setOrderAmntDeliveryProrated(double orderAmntDeliveryProrated) {
		this.orderAmntDeliveryProrated = orderAmntDeliveryProrated;
	}
	public double getOrderAmntTaxOriginal() {
		return orderAmntTaxOriginal;
	}
	public void setOrderAmntTaxOriginal(double orderAmntTaxOriginal) {
		this.orderAmntTaxOriginal = orderAmntTaxOriginal;
	}
	public double getOrderAmntTaxProrated() {
		return orderAmntTaxProrated;
	}
	public void setOrderAmntTaxProrated(double orderAmntTaxProrated) {
		this.orderAmntTaxProrated = orderAmntTaxProrated;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	
}
