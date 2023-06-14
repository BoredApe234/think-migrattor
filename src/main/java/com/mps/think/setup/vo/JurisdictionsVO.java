package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class JurisdictionsVO {
	
	private Integer id;
	private Publisher pubId;
	private String countrycode;
	private String stateCode;
	private String city;
	private String country;
	private String zipCode;
	private Boolean avatarapplicable;
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
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Boolean getAvatarapplicable() {
		return avatarapplicable;
	}
	public void setAvatarapplicable(Boolean avatarapplicable) {
		this.avatarapplicable = avatarapplicable;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	@Override
	public String toString() {
		return "JurisdictionsVO [id=" + id + ", pubId=" + pubId + ", countrycode=" + countrycode + ", stateCode="
				+ stateCode + ", city=" + city + ", country=" + country + ", zipCode=" + zipCode + ", avatarapplicable="
				+ avatarapplicable + "]";
	}


	
}
