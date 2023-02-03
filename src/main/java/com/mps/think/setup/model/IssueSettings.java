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
	
	@Column(name = "nth_day")
	private String nthDay;
	
	@Column(name = "day_of_the_month")
	private String dayOfTheMonth;
	
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

	@Override
	public String toString() {
		return "IssueSettings [id=" + id + ", numberOfIssue=" + numberOfIssue + ", frequencyOfGeneration="
				+ frequencyOfGeneration + ", periodicity=" + periodicity + ", issuesAppearonEvery="
				+ issuesAppearonEvery + ", dwmOfThewmy=" + dwmOfThewmy + ", nthDay=" + nthDay + ", dayOfTheMonth="
				+ dayOfTheMonth + ", volumeCaption=" + volumeCaption + ", volumeFormat=" + volumeFormat
				+ ", changeDate=" + changeDate + ", issueCaption=" + issueCaption + ", issueFormat=" + issueFormat
				+ ", issuesOrVolume=" + issuesOrVolume + ", orderClassId=" + orderClassId + "]";
	}
	
}	
