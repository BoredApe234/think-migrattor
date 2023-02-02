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
@Table(name = "issue_setting")
public class IssueSettings extends BaseEntity{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

//	Issue Date Generation
	@Column(name = "number_of_issue")
	private Integer numberOfIssue;

	@Column(name = "frequency_of_generation")
	private String frequencyOfGeneration;

	@Column(name = "periodicity")
	private String periodicity;


	@Column(name = "issues_appear_on_every")
	private String issuesAppearonEvery;
	
	@Column(name = "dwm_of_the_wmy")
	private String dwmOfThewmy;
	
//	Enumeration Generation
	
	@Column(name="volume_caption")
	private String volumeCaption;
	
	@Column(name="volume_format")
	private String volumeFormat;
	
	@Column(name="change_date")
	private String changeDate;
	
	@Column(name="issue_caption")
	private String issueCaption;
	
	@Column(name="issue_format")
	private String issueFormat;
	
	@Column(name="issues_or_volume")
	private String issuesOrVolume;

	// order class mapping will be there
	@OneToOne
	@JoinColumn(name = "order_class_id", referencedColumnName = "oc_id")
	private OrderClass orderClassId;
	
	@OneToOne
	@JoinColumn(name = "parent_class_id", referencedColumnName = "parent_id")
	private ParentClass parentClassId;
	
	@OneToOne
	@JoinColumn(name = "child_class_id", referencedColumnName = "child_id")
	private ChildClass childClassId;
	
	@OneToOne
	@JoinColumn(name = "subchild_class_id", referencedColumnName = "subchild_id")
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

	public String getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
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
		return "IssueSettings [id=" + id + ", numberOfIssue=" + numberOfIssue + ", frequencyOfGeneration="
				+ frequencyOfGeneration + ", periodicity=" + periodicity + ", issuesAppearonEvery="
				+ issuesAppearonEvery + ", dwmOfThewmy=" + dwmOfThewmy + ", volumeCaption=" + volumeCaption
				+ ", volumeFormat=" + volumeFormat + ", changeDate=" + changeDate + ", issueCaption=" + issueCaption
				+ ", issueFormat=" + issueFormat + ", issuesOrVolume=" + issuesOrVolume + ", orderClassId="
				+ orderClassId + ", parentClassId=" + parentClassId + ", childClassId=" + childClassId
				+ ", subChildClassId=" + subChildClassId + "]";
	}

	
}	
