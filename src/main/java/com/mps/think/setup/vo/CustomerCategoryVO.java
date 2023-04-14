package com.mps.think.setup.vo;

public class CustomerCategoryVO {

	/**
	 * 
	 */
	
	private Integer CustomerCategoryId;
	private PublisherVO pubId;
	private String custCategory;
	private String thinkCategory;
	private Integer status;
	private Boolean defaultcc;
	
	
	
	public Integer getCustomerCategoryId() {
		return CustomerCategoryId;
	}
	public void setCustomerCategoryId(Integer customerCategoryId) {
		CustomerCategoryId = customerCategoryId;
	}
	public PublisherVO getPubId() {
		return pubId;
	}
	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}
	public String getCustCategory() {
		return custCategory;
	}
	public void setCustCategory(String custCategory) {
		this.custCategory = custCategory;
	}
	public String getThinkCategory() {
		return thinkCategory;
	}
	public void setThinkCategory(String thinkCategory) {
		this.thinkCategory = thinkCategory;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getDefaultcc() {
		return defaultcc;
	}
	public void setDefaultcc(Boolean defaultcc) {
		this.defaultcc = defaultcc;
	}
	
	

	
	

}