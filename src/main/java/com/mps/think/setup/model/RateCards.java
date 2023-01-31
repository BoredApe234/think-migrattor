package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "rate_Cards")
@Entity
public class RateCards extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rcId")
	private Integer rcId;
	
	@ManyToOne
	@JoinColumn(name = "parent_id", referencedColumnName = "parent_id")
	private ParentClass parentId;
	
	@ManyToOne
	@JoinColumn(name = "child_id", referencedColumnName = "child_id")
	private ChildClass childId;
	
	@ManyToOne
	@JoinColumn(name = "subchild_id", referencedColumnName = "subchild_id")
	private SubChildClass subChildId;
	
	@Column(name = "rateClassEffectiveSequence")
	private Integer rateClassEffectiveSequence;
	
	@Column(name = "rateClassId")
	private Integer rateClassId;
	
	@Column(name = "rateCard")
	private String rateCard;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "useForPackage")
	private Boolean useForPackage;
	
	@Column(name = "itemtype")
	private String itemtype;
	
	@Column(name = "defaultPricePerItem")
	private Float defaultPricePerItem;

	public Integer getRcId() {
		return rcId;
	}

	public void setRcId(Integer rcId) {
		this.rcId = rcId;
	}

	public ParentClass getParentId() {
		return parentId;
	}

	public void setParentId(ParentClass parentId) {
		this.parentId = parentId;
	}

	public ChildClass getChildId() {
		return childId;
	}

	public void setChildId(ChildClass childId) {
		this.childId = childId;
	}

	public SubChildClass getSubChildId() {
		return subChildId;
	}

	public void setSubChildId(SubChildClass subChildId) {
		this.subChildId = subChildId;
	}

	public Integer getRateClassEffectiveSequence() {
		return rateClassEffectiveSequence;
	}

	public void setRateClassEffectiveSequence(Integer rateClassEffectiveSequence) {
		this.rateClassEffectiveSequence = rateClassEffectiveSequence;
	}

	public Integer getRateClassId() {
		return rateClassId;
	}

	public void setRateClassId(Integer rateClassId) {
		this.rateClassId = rateClassId;
	}

	public String getRateCard() {
		return rateCard;
	}

	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getUseForPackage() {
		return useForPackage;
	}

	public void setUseForPackage(Boolean useForPackage) {
		this.useForPackage = useForPackage;
	}

	public String getItemtype() {
		return itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	public Float getDefaultPricePerItem() {
		return defaultPricePerItem;
	}

	public void setDefaultPricePerItem(Float defaultPricePerItem) {
		this.defaultPricePerItem = defaultPricePerItem;
	}
	
	

	
	

	
	
}
