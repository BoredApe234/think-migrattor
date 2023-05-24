package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class AddressVO {
	
	private Integer id;
	private Publisher pubId;
	private String street1;
	private String street2;
	private String country;
	private String zipcode;
	private String city;
	private String state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	
	@Override
	public String toString() {
		return "AddressVO [id=" + id + ", pubId=" + pubId + ", street1=" + street1 + ", street2=" + street2
				+ ", country=" + country + ", zipcode=" + zipcode + ", city=" + city + ", state=" + state + "]";
	}
	
	
	


}
