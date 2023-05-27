package com.mps.think.setup.vo;

import java.util.Date;

public class DateBasedItemsAndTermVO {

	private Integer id;
	
	private SubscriptionDefKeyInfoVO subsProdPkgDef;
	
	private TermsVO term;
	
	private Integer copiesPerIssue;
	
	private Date validFrom;
	
	private Date validTo;
	
	private Integer extendedByDays;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SubscriptionDefKeyInfoVO getSubsProdPkgDef() {
		return subsProdPkgDef;
	}

	public void setSubsProdPkgDef(SubscriptionDefKeyInfoVO subsProdPkgDef) {
		this.subsProdPkgDef = subsProdPkgDef;
	}

	public TermsVO getTerm() {
		return term;
	}

	public void setTerm(TermsVO term) {
		this.term = term;
	}

	public Integer getCopiesPerIssue() {
		return copiesPerIssue;
	}

	public void setCopiesPerIssue(Integer copiesPerIssue) {
		this.copiesPerIssue = copiesPerIssue;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public Integer getExtendedByDays() {
		return extendedByDays;
	}

	public void setExtendedByDays(Integer extendedByDays) {
		this.extendedByDays = extendedByDays;
	}

	
}
