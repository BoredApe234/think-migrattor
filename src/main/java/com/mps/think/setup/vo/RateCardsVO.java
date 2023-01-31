package com.mps.think.setup.vo;



import com.mps.think.setup.model.ChildClass;
import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.model.SubChildClass;


public class RateCardsVO {
	
    private Integer rcId;
    private ParentClass parentId;
    private ChildClass childId;
    private SubChildClass subChildId;
	private Integer rateClassEffectiveSequence;
	private Integer rateClassId;
	private String rateCard;
	private String description;
	private String itemtype;
	private Boolean useForPackage;
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
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public Boolean getUseForPackage() {
		return useForPackage;
	}
	public void setUseForPackage(Boolean useForPackage) {
		this.useForPackage = useForPackage;
	}
	public Float getDefaultPricePerItem() {
		return defaultPricePerItem;
	}
	public void setDefaultPricePerItem(Float defaultPricePerItem) {
		this.defaultPricePerItem = defaultPricePerItem;
	}
	
	
	
}
