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
    private String initialName;
	private String department;
	private String email;
	private String primaryPhone;
	private String mobileNumber;
	private String custAuxFieldJSON;
	private String newOrderCommission;
	private String renewalCommission;
	private String agencyname;
	private String agencycode;
	private String fax;
	private Integer institutionalId;
	private Integer parentInstitutionalId;
	private String taxId;
	private Boolean taxExempt;
	private String secondaryEmail;
	private String secondaryPhone;
	private String listRental;
	private String salesRepresentative;
	private String creditStatus;
	private String countryCode;
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
	public String getInitialName() {
		return initialName;
	}
	public void setInitialName(String initialName) {
		this.initialName = initialName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCustAuxFieldJSON() {
		return custAuxFieldJSON;
	}
	public void setCustAuxFieldJSON(String custAuxFieldJSON) {
		this.custAuxFieldJSON = custAuxFieldJSON;
	}
	public String getNewOrderCommission() {
		return newOrderCommission;
	}
	public void setNewOrderCommission(String newOrderCommission) {
		this.newOrderCommission = newOrderCommission;
	}
	public String getRenewalCommission() {
		return renewalCommission;
	}
	public void setRenewalCommission(String renewalCommission) {
		this.renewalCommission = renewalCommission;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public String getAgencycode() {
		return agencycode;
	}
	public void setAgencycode(String agencycode) {
		this.agencycode = agencycode;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Integer getInstitutionalId() {
		return institutionalId;
	}
	public void setInstitutionalId(Integer institutionalId) {
		this.institutionalId = institutionalId;
	}
	public Integer getParentInstitutionalId() {
		return parentInstitutionalId;
	}
	public void setParentInstitutionalId(Integer parentInstitutionalId) {
		this.parentInstitutionalId = parentInstitutionalId;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public Boolean getTaxExempt() {
		return taxExempt;
	}
	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public String getSecondaryPhone() {
		return secondaryPhone;
	}
	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}
	public String getListRental() {
		return listRental;
	}
	public void setListRental(String listRental) {
		this.listRental = listRental;
	}
	public String getSalesRepresentative() {
		return salesRepresentative;
	}
	public void setSalesRepresentative(String salesRepresentative) {
		this.salesRepresentative = salesRepresentative;
	}
	public String getCreditStatus() {
		return creditStatus;
	}
	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	@Override
	public String toString() {
		return "LabelLayoutVO [id=" + id + ", pubId=" + pubId + ", lableformat=" + lableformat + ", lablegroup="
				+ lablegroup + ", description=" + description + ", suppressed=" + suppressed + ", truncated="
				+ truncated + ", customerdetails=" + customerdetails + ", firstname=" + firstname + ", company="
				+ company + ", address1=" + address1 + ", city=" + city + ", country=" + country + ", creationdate="
				+ creationdate + ", active=" + active + ", initialName=" + initialName + ", department=" + department
				+ ", email=" + email + ", primaryPhone=" + primaryPhone + ", mobileNumber=" + mobileNumber
				+ ", custAuxFieldJSON=" + custAuxFieldJSON + ", newOrderCommission=" + newOrderCommission
				+ ", renewalCommission=" + renewalCommission + ", agencyname=" + agencyname + ", agencycode="
				+ agencycode + ", fax=" + fax + ", institutionalId=" + institutionalId + ", parentInstitutionalId="
				+ parentInstitutionalId + ", taxId=" + taxId + ", taxExempt=" + taxExempt + ", secondaryEmail="
				+ secondaryEmail + ", secondaryPhone=" + secondaryPhone + ", listRental=" + listRental
				+ ", salesRepresentative=" + salesRepresentative + ", creditStatus=" + creditStatus + ", countryCode="
				+ countryCode + "]";
	}

	
	
	
	

}
