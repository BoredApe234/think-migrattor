package com.mps.think.setup.vo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrderPaymentMapping;
import com.mps.think.setup.model.Publisher;

public class MakePaymentVO {
	private Integer id;
	private String nameOfCustomer;
	private String payerCustomer;
	private double baseAmount;
	private long paymentAccount;
	private String paymentType;
	private String card;
	private double amountToBePaid;
	private String expiryDate;
	private String transactionStatus;
	private String chargeId;
	private String status;
	private Publisher publisher;
//	private Order order;
	private LinkedHashMap<Integer, Double> listOfOrder;
//	private List<OrderPaymentMapping> orderPaymentMapping;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameOfCustomer() {
		return nameOfCustomer;
	}
	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}
	public String getPayerCustomer() {
		return payerCustomer;
	}
	public void setPayerCustomer(String payerCustomer) {
		this.payerCustomer = payerCustomer;
	}
	public double getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	public long getPaymentAccount() {
		return paymentAccount;
	}
	public void setPaymentAccount(long paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public double getAmountToBePaid() {
		return amountToBePaid;
	}
	public void setAmountToBePaid(double amountToBePaid) {
		this.amountToBePaid = amountToBePaid;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getChargeId() {
		return chargeId;
	}
	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
//	public Order getOrder() {
//		return order;
//	}
//	public void setOrder(Order order) {
//		this.order = order;
//	}
	public LinkedHashMap<Integer, Double> getListOfOrder() {
		return listOfOrder;
	}
	public void setListOfOrder(LinkedHashMap<Integer, Double> listOfOrder) {
		this.listOfOrder = listOfOrder;
	}

	
//	public List<OrderPaymentMapping> getOrderPaymentMapping() {
//		return orderPaymentMapping;
//	}
//	public void setOrderPaymentMapping(List<OrderPaymentMapping> orderPaymentMapping) {
//		this.orderPaymentMapping = orderPaymentMapping;
//	}
//	@Override
//	public String toString() {
//		return "MakePaymentVO [id=" + id + ", nameOfCustomer=" + nameOfCustomer + ", payerCustomer=" + payerCustomer
//				+ ", baseAmount=" + baseAmount + ", paymentAccount=" + paymentAccount + ", paymentType=" + paymentType
//				+ ", card=" + card + ", amountToBePaid=" + amountToBePaid + ", expiryDate=" + expiryDate
//				+ ", transactionStatus=" + transactionStatus + ", chargeId=" + chargeId + ", status=" + status
//				+ ", publisher=" + publisher + ", orderPaymentMapping=" + orderPaymentMapping + "]";
//	}
}
