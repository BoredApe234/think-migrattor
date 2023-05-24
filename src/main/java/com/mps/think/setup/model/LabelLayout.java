package com.mps.think.setup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "label_layout")
public class LabelLayout extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@OneToOne
	@JoinColumn(name = "lableformat_id", referencedColumnName = "lable_format_id" )
	private LableFormat lableformat;
	
	@OneToOne
	@JoinColumn(name = "lablegroup_id", referencedColumnName = "lable_group_id" )
	private LableGroup lablegroup;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "customerdetails")
	private Integer customerdetails;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "creationdate")
	private Date creationdate;
	
	@Column(name = "active")
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

	public Integer getCustomerdetails() {
		return customerdetails;
	}

	public void setCustomerdetails(Integer customerdetails) {
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
		return "LabelLayout [id=" + id + ", pubId=" + pubId + ", lableformat=" + lableformat + ", lablegroup="
				+ lablegroup + ", description=" + description + ", customerdetails=" + customerdetails + ", firstname="
				+ firstname + ", company=" + company + ", address1=" + address1 + ", city=" + city + ", country="
				+ country + ", creationdate=" + creationdate + ", active=" + active + "]";
	}

	
	
	
	
	
	

}
