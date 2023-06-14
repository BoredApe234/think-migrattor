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
@Table(name = "payment_info")
public class PaymentInformation extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	
	@Column(name = "payment_mode")
	private String paymentMode;
	
	@Column(name = "card_number")
	String cardNumber;
	
	@Column(name = "name_of_card_holder")
	String nameOfCardHolder;
	
	@Column(name = "amount")
	double amount;
	
//	charge api
	@Column(name = "transaction_id")
	String transactionId;
	
	@Column(name = "charge_id")
	String chargeId;
	
	@Column(name = "status")
	String status;
	
	@Column(name = "other_info")
	String otherinfo;
	
	@Column(name = "payment_for_other_order")
	String paymentForOtherOrder;
	
	@OneToOne
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	Order order;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
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
		return "PaymentInformation [id=" + id + ", paymentMode=" + paymentMode + ", cardNumber=" + cardNumber
				+ ", nameOfCardHolder=" + nameOfCardHolder + ", amount=" + amount + ", transactionId=" + transactionId
				+ ", chargeId=" + chargeId + ", status=" + status + ", otherinfo=" + otherinfo
				+ ", paymentForOtherOrder=" + paymentForOtherOrder + ", order=" + order + ", publisher=" + publisher
				+ "]";
	}

	
}
