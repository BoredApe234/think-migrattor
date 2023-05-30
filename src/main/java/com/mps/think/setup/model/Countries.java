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
@Table(name="country_table")
public class Countries extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@Column(name="country")
	private String country;
	
	@Column(name="countrycode")
	private String countrycode;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="taxcomputation")
	private Double taxcomputation;
	
	@Column(name="addressvalidation")
	private String addressvalidation;
	
	@Column(name="basecurrency")
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
		return "Countries [id=" + id + ", pubId=" + pubId + ", country=" + country + ", countrycode=" + countrycode
				+ ", currency=" + currency + ", taxcomputation=" + taxcomputation + ", addressvalidation="
				+ addressvalidation + ", basecurrency=" + basecurrency + "]";
	}
	
	
	

	
	
	

}
