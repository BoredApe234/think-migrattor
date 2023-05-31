package com.mps.think.setup.vo;

import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.Publisher;

public class PaymentInformationVO {

	Integer id;
	private String paymentMode;

	String cardNumber;

	String nameOfCardHolder;

	double amount;

//	charge api
	String transactionId;

	String chargeId;

	String status;
	
	String otherinfo;
	
	String paymentForOtherOrder;
	
	Order order;

	Publisher publisher;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOfCardHolder() {
		return nameOfCardHolder;
	}

	public void setNameOfCardHolder(String nameOfCardHolder) {
		this.nameOfCardHolder = nameOfCardHolder;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public String getPaymentForOtherOrder() {
		return paymentForOtherOrder;
	}

	public void setPaymentForOtherOrder(String paymentForOtherOrder) {
		this.paymentForOtherOrder = paymentForOtherOrder;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "PaymentInformationVO [id=" + id + ", paymentMode=" + paymentMode + ", cardNumber=" + cardNumber
				+ ", nameOfCardHolder=" + nameOfCardHolder + ", amount=" + amount + ", transactionId=" + transactionId
				+ ", chargeId=" + chargeId + ", status=" + status + ", otherinfo=" + otherinfo
				+ ", paymentForOtherOrder=" + paymentForOtherOrder + ", order=" + order + ", publisher=" + publisher
				+ "]";
	}
}
