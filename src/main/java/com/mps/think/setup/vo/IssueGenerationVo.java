package com.mps.think.setup.vo;

import java.util.Arrays;

import javax.persistence.Column;

public class IssueGenerationVo {

	private Integer id;

	private Integer numberOfIssue;

	private String frequencyOfGeneration;

//	private String periodicity;

	private String orderType;

	private Integer[] IssuesAppearonEvery;

	private OrderCodesVO oderCodeVo;

	private OrderClassVO orderClassId;

	private Boolean active;

	private String rateCard;

	private String discountCard;

	private String volumeCaption;

	private String volumeFormat;

	private String changeDate;

	private String issueCaption;

	private String issueFormat;

	private String issueDate;

	private String issue_volume;

	private String dateoftheMonthYear;

	private Integer seqOfIssue;

	private String issueURL;

	private boolean analysed;

	private boolean frozen;

	private String inventoryID;

	private String closed;

	private String revenueGenerating;

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

//	public String getPeriodicity() {
//		return periodicity;
//	}
//
//	public void setPeriodicity(String periodicity) {
//		this.periodicity = periodicity;
//	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

//	public Integer[] getIssuesAppearonEvery() {
//		return IssuesAppearonEvery;
//	}
//
//	public void setIssuesAppearonEvery(Integer[] issuesAppearonEvery) {
//		IssuesAppearonEvery = issuesAppearonEvery;
//	}

	public OrderCodesVO getOderCodeVo() {
		return oderCodeVo;
	}

	public void setOderCodeVo(OrderCodesVO oderCodeVo) {
		this.oderCodeVo = oderCodeVo;
	}

	public OrderClassVO getOrderClassId() {
		return orderClassId;
	}

	public void setOrderClassId(OrderClassVO orderClassId) {
		this.orderClassId = orderClassId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getRateCard() {
		return rateCard;
	}

	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}

	public String getDiscountCard() {
		return discountCard;
	}

	public void setDiscountCard(String discountCard) {
		this.discountCard = discountCard;
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

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getIssue_volume() {
		return issue_volume;
	}

	public void setIssue_volume(String issue_volume) {
		this.issue_volume = issue_volume;
	}

	public String getDateoftheMonthYear() {
		return dateoftheMonthYear;
	}

	public void setDateoftheMonthYear(String dateoftheMonthYear) {
		this.dateoftheMonthYear = dateoftheMonthYear;
	}

	public Integer getSeqOfIssue() {
		return seqOfIssue;
	}

	public void setSeqOfIssue(Integer seqOfIssue) {
		this.seqOfIssue = seqOfIssue;
	}

	public String getIssueURL() {
		return issueURL;
	}

	public void setIssueURL(String issueURL) {
		this.issueURL = issueURL;
	}

	public boolean getAnalysed() {
		return analysed;
	}

	public void setAnalysed(boolean analysed) {
		this.analysed = analysed;
	}

	public boolean getFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

	public String getInventoryID() {
		return inventoryID;
	}

	public void setInventoryID(String inventoryID) {
		this.inventoryID = inventoryID;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getRevenueGenerating() {
		return revenueGenerating;
	}

	public void setRevenueGenerating(String revenueGenerating) {
		this.revenueGenerating = revenueGenerating;
	}

	public Integer[] getIssuesAppearonEvery() {
		return IssuesAppearonEvery;
	}

	public void setIssuesAppearonEvery(Integer[] issuesAppearonEvery) {
		IssuesAppearonEvery = issuesAppearonEvery;
	}

	@Override
	public String toString() {
		return "IssueGenerationVo [id=" + id + ", numberOfIssue=" + numberOfIssue + ", frequencyOfGeneration="
				+ frequencyOfGeneration + ", orderType=" + orderType + ", IssuesAppearonEvery="
				+ Arrays.toString(IssuesAppearonEvery) + ", oderCodeVo=" + oderCodeVo + ", orderClassId=" + orderClassId
				+ ", active=" + active + ", rateCard=" + rateCard + ", discountCard=" + discountCard
				+ ", volumeCaption=" + volumeCaption + ", volumeFormat=" + volumeFormat + ", changeDate=" + changeDate
				+ ", issueCaption=" + issueCaption + ", issueFormat=" + issueFormat + ", issueDate=" + issueDate
				+ ", issue_volume=" + issue_volume + ", dateoftheMonthYear=" + dateoftheMonthYear + ", seqOfIssue="
				+ seqOfIssue + ", issueURL=" + issueURL + ", analysed=" + analysed + ", frozen=" + frozen
				+ ", inventoryID=" + inventoryID + ", closed=" + closed + ", revenueGenerating=" + revenueGenerating
				+ "]";
	}

//	@Override
//	public String toString() {
//		return "IssueGenerationVo [id=" + id + ", numberOfIssue=" + numberOfIssue + ", frequencyOfGeneration="
//				+ frequencyOfGeneration + ", periodicity=" + periodicity + ", orderType=" + orderType
//				+ ", IssuesAppearonEvery=" + IssuesAppearonEvery + ", oderCodeVo=" + oderCodeVo + ", orderClassId="
//				+ orderClassId + ", active=" + active + ", rateCard=" + rateCard + ", discountCard=" + discountCard
//				+ ", volumeCaption=" + volumeCaption + ", volumeFormat=" + volumeFormat + ", changeDate=" + changeDate
//				+ ", issueCaption=" + issueCaption + ", issueFormat=" + issueFormat + ", issueDate=" + issueDate
//				+ ", issue_volume=" + issue_volume + ", dateoftheMonthYear=" + dateoftheMonthYear + ", seqOfIssue="
//				+ seqOfIssue + ", issueURL=" + issueURL + ", analysed=" + analysed + ", frozen=" + frozen
//				+ ", inventoryID=" + inventoryID + ", closed=" + closed + ", revenueGenerating=" + revenueGenerating
//				+ "]";
//	}

	
}
