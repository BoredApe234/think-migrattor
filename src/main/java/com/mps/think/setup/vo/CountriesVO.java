package com.mps.think.setup.vo;
import com.mps.think.setup.model.Publisher;

public class CountriesVO {
	
	private Integer id;
	private Publisher pubId;
	private String country;
	private String countrycode;
	private String currency;
	private Double taxcomputation;
	private String addressvalidation;
	private Boolean basecurrency;
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getTaxcomputation() {
		return taxcomputation;
	}
	public void setTaxcomputation(Double taxcomputation) {
		this.taxcomputation = taxcomputation;
	}
	public String getAddressvalidation() {
		return addressvalidation;
	}
	public void setAddressvalidation(String addressvalidation) {
		this.addressvalidation = addressvalidation;
	}
	public Boolean getBasecurrency() {
		return basecurrency;
	}
	public void setBasecurrency(Boolean basecurrency) {
		this.basecurrency = basecurrency;
	}
	@Override
	public String toString() {
		return "CountriesVO [id=" + id + ", pubId=" + pubId + ", country=" + country + ", countrycode=" + countrycode
				+ ", currency=" + currency + ", taxcomputation=" + taxcomputation + ", addressvalidation="
				+ addressvalidation + ", basecurrency=" + basecurrency + "]";
	}
	
	
	
	

}
