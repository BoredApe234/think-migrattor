package com.mps.think.setup.vo;

import com.mps.think.setup.model.OrderCodesSuper;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.model.RenewalCard;
import com.mps.think.setup.model.Terms;
import com.mps.think.setup.vo.EnumModelVO.SubDefStatus;

public class SubscriptionDefKeyInfoVO {

	private Integer id;
	
	private Publisher publisherId;

	private String subscriptionDefCode;

	private String description;

	private OrderCodesSuper orderCode;

	private Terms term;

	private SubDefStatus subDefStatus;

	private String subDefId;

	private RateCards rateCard;

	private RenewalCard renewalCard;

	private String orderCodeType;

	private String media;

	private String edition;

	private String category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Publisher getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Publisher publisherId) {
		this.publisherId = publisherId;
	}

	public String getSubscriptionDefCode() {
		return subscriptionDefCode;
	}

	public void setSubscriptionDefCode(String subscriptionDefCode) {
		this.subscriptionDefCode = subscriptionDefCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OrderCodesSuper getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(OrderCodesSuper orderCode) {
		this.orderCode = orderCode;
	}

	public Terms getTerm() {
		return term;
	}

	public void setTerm(Terms term) {
		this.term = term;
	}

	public SubDefStatus getSubDefStatus() {
		return subDefStatus;
	}

	public void setSubDefStatus(SubDefStatus subDefStatus) {
		this.subDefStatus = subDefStatus;
	}

	public String getSubDefId() {
		return subDefId;
	}

	public void setSubDefId(String subDefId) {
		this.subDefId = subDefId;
	}

	public RateCards getRateCard() {
		return rateCard;
	}

	public void setRateCard(RateCards rateCard) {
		this.rateCard = rateCard;
	}

	public RenewalCard getRenewalCard() {
		return renewalCard;
	}

	public void setRenewalCard(RenewalCard renewalCard) {
		this.renewalCard = renewalCard;
	}

	public String getOrderCodeType() {
		return orderCodeType;
	}

	public void setOrderCodeType(String orderCodeType) {
		this.orderCodeType = orderCodeType;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "SubscriptionDefKeyInfoVO [id=" + id + ", publisherId=" + publisherId + ", subscriptionDefCode="
				+ subscriptionDefCode + ", description=" + description + ", orderCode=" + orderCode + ", term=" + term
				+ ", subDefStatus=" + subDefStatus + ", subDefId=" + subDefId + ", rateCard=" + rateCard
				+ ", renewalCard=" + renewalCard + ", orderCodeType=" + orderCodeType + ", media=" + media
				+ ", edition=" + edition + ", category=" + category + "]";
	}



}
