package com.mps.think.setup.vo;

import java.util.Date;

import com.mps.think.setup.model.LableFormat;
import com.mps.think.setup.model.LableGroup;
import com.mps.think.setup.model.Publisher;

public class LabelLayoutVO {
	
	private Integer id;
	private Publisher pubId;
	private LableFormat lableformat;
	private LableGroup lablegroup;
	private String description;
	private Boolean suppressed;
	private Boolean truncated;
	private CustomerDetailsVO customerdetails;
	private String firstname;
	private String company;
	private String address1;
	private String city;
	private String country;
	private Date creationdate;
	private Boolean active;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	public LableFormat getLableformat() {
		return lableformat;
	}
	public void setLableformat(LableFormat lableformat) {
		this.lableformat = lableformat;
	}
	public LableGroup getLablegroup() {
		return lablegroup;
	}
	public void setLablegroup(LableGroup lablegroup) {
		this.lablegroup = lablegroup;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getSuppressed() {
		return suppressed;
	}
	public void setSuppressed(Boolean suppressed) {
		this.suppressed = suppressed;
	}
	public Boolean getTruncated() {
		return truncated;
	}
	public void setTruncated(Boolean truncated) {
		this.truncated = truncated;
	}
	public CustomerDetailsVO getCustomerdetails() {
		return customerdetails;
	}
	public void setCustomerdetails(CustomerDetailsVO customerdetails) {
		this.customerdetails = customerdetails;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "LabelLayoutVO [id=" + id + ", pubId=" + pubId + ", lableformat=" + lableformat + ", lablegroup="
				+ lablegroup + ", description=" + description + ", suppressed=" + suppressed + ", truncated="
				+ truncated + ", customerdetails=" + customerdetails + ", firstname=" + firstname + ", company="
				+ company + ", address1=" + address1 + ", city=" + city + ", country=" + country + ", creationdate="
				+ creationdate + ", active=" + active + "]";
	}
	
	
	
	
	

}
