package com.mps.think.setup.vo;

import java.sql.Date;



import com.mps.think.setup.model.CancelReasons;

public class CancelOrderVO {
	
    private Integer cancelorderId;
    private Integer orderId;
	private Float refundamount;
	private CancelReasons CancelReasonsId;
	private Boolean donotrenew;
	private Boolean cancelactiveorder;
	private Boolean cancelentiresubscription;
	private String refundto;
	private String cardNumber;
	private String cardholdername;
	private Boolean reneworpayanotherorder;
	private String paymentaccount;
	private String paymenttype;
	private String card;
	private Date date;
	private String nameoncard;
	public Integer getCancelorderId() {
		return cancelorderId;
	}
	public void setCancelorderId(Integer cancelorderId) {
		this.cancelorderId = cancelorderId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Float getRefundamount() {
		return refundamount;
	}
	public void setRefundamount(Float refundamount) {
		this.refundamount = refundamount;
	}
	public CancelReasons getCancelReasonsId() {
		return CancelReasonsId;
	}
	public void setCancelReasonsId(CancelReasons cancelReasonsId) {
		CancelReasonsId = cancelReasonsId;
	}
	public Boolean getDonotrenew() {
		return donotrenew;
	}
	public void setDonotrenew(Boolean donotrenew) {
		this.donotrenew = donotrenew;
	}
	public Boolean getCancelactiveorder() {
		return cancelactiveorder;
	}
	public void setCancelactiveorder(Boolean cancelactiveorder) {
		this.cancelactiveorder = cancelactiveorder;
	}
	public Boolean getCancelentiresubscription() {
		return cancelentiresubscription;
	}
	public void setCancelentiresubscription(Boolean cancelentiresubscription) {
		this.cancelentiresubscription = cancelentiresubscription;
	}
	public String getRefundto() {
		return refundto;
	}
	public void setRefundto(String refundto) {
		this.refundto = refundto;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardholdername() {
		return cardholdername;
	}
	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}
	public Boolean getReneworpayanotherorder() {
		return reneworpayanotherorder;
	}
	public void setReneworpayanotherorder(Boolean reneworpayanotherorder) {
		this.reneworpayanotherorder = reneworpayanotherorder;
	}
	public String getPaymentaccount() {
		return paymentaccount;
	}
	public void setPaymentaccount(String paymentaccount) {
		this.paymentaccount = paymentaccount;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNameoncard() {
		return nameoncard;
	}
	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	
	
}
