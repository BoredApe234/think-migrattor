package com.mps.think.setup.vo;
import javax.persistence.Column;

import com.mps.think.setup.model.ChildClass;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.model.SubChildClass;

public class IssueSettingsVO {
	
	private Integer id;

//	Issue Date Generation
	private Integer numberOfIssue;

	private String frequencyOfGeneration;

	private String periodicity;

	private String issuesAppearonEvery;
	
	private String dwmOfThewmy;
	
	private String nthDay;
	
	private String dayOfTheMonth;
	
//	Enumeration Generation
	
	private String volumeCaption;
	
	private String volumeFormat;
	
	private String changDate;
	
	private String issueCaption;
	
	private String issueFormat;
	
	private String issuesOrVolume;

	// order class mapping will be there
	private OrderClass orderClassId;
	
	private ParentClass parentClassId;
	
	private ChildClass childClassId;
	
	private SubChildClass subChildClassId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberOfIssue() {
		return numberOfIssue;
	}

	public void setNumberOfIssue(Integer numberOfIssue) {
		this.numberOfIssue = numberOfIssue;
	}

	public String getFrequencyOfGeneration() {
		return frequencyOfGeneration;
	}

	public void setFrequencyOfGeneration(String frequencyOfGeneration) {
		this.frequencyOfGeneration = frequencyOfGeneration;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String getIssuesAppearonEvery() {
		return issuesAppearonEvery;
	}

	public void setIssuesAppearonEvery(String issuesAppearonEvery) {
		this.issuesAppearonEvery = issuesAppearonEvery;
	}

	public String getDwmOfThewmy() {
		return dwmOfThewmy;
	}

	public void setDwmOfThewmy(String dwmOfThewmy) {
		this.dwmOfThewmy = dwmOfThewmy;
	}

	public String getNthDay() {
		return nthDay;
	}

	public void setNthDay(String nthDay) {
		this.nthDay = nthDay;
	}

	public String getDayOfTheMonth() {
		return dayOfTheMonth;
	}

	public void setDayOfTheMonth(String dayOfTheMonth) {
		this.dayOfTheMonth = dayOfTheMonth;
	}

	public String getVolumeCaption() {
		return volumeCaption;
	}

	public void setVolumeCaption(String volumeCaption) {
		this.volumeCaption = volumeCaption;
	}

	public String getVolumeFormat() {
		return volumeFormat;
	}

	public void setVolumeFormat(String volumeFormat) {
		this.volumeFormat = volumeFormat;
	}

	public String getChangDate() {
		return changDate;
	}

	public void setChangDate(String changDate) {
		this.changDate = changDate;
	}

	public String getIssueCaption() {
		return issueCaption;
	}

	public void setIssueCaption(String issueCaption) {
		this.issueCaption = issueCaption;
	}

	public String getIssueFormat() {
		return issueFormat;
	}

	public void setIssueFormat(String issueFormat) {
		this.issueFormat = issueFormat;
	}

	public String getIssuesOrVolume() {
		return issuesOrVolume;
	}

	public void setIssuesOrVolume(String issuesOrVolume) {
		this.issuesOrVolume = issuesOrVolume;
	}

	public OrderClass getOrderClassId() {
		return orderClassId;
	}

	public void setOrderClassId(OrderClass orderClassId) {
		this.orderClassId = orderClassId;
	}

	public ParentClass getParentClassId() {
		return parentClassId;
	}

	public void setParentClassId(ParentClass parentClassId) {
		this.parentClassId = parentClassId;
	}

	public ChildClass getChildClassId() {
		return childClassId;
	}

	public void setChildClassId(ChildClass childClassId) {
		this.childClassId = childClassId;
	}

	public SubChildClass getSubChildClassId() {
		return subChildClassId;
	}

	public void setSubChildClassId(SubChildClass subChildClassId) {
		this.subChildClassId = subChildClassId;
	}

	@Override
	public String toString() {
		return "IssueSettingsVO [id=" + id + ", numberOfIssue=" + numberOfIssue + ", frequencyOfGeneration="
				+ frequencyOfGeneration + ", periodicity=" + periodicity + ", issuesAppearonEvery="
				+ issuesAppearonEvery + ", dwmOfThewmy=" + dwmOfThewmy + ", nthDay=" + nthDay + ", dayOfTheMonth="
				+ dayOfTheMonth + ", volumeCaption=" + volumeCaption + ", volumeFormat=" + volumeFormat + ", changDate="
				+ changDate + ", issueCaption=" + issueCaption + ", issueFormat=" + issueFormat + ", issuesOrVolume="
				+ issuesOrVolume + ", orderClassId=" + orderClassId + ", parentClassId=" + parentClassId
				+ ", childClassId=" + childClassId + ", subChildClassId=" + subChildClassId + "]";
	}

}
