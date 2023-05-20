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
	
	@Column(name="state")
	private String state;
	
	@Column(name="description")
	private String description;
	
	@Column(name="countries")
	private String countries;
	
	@Column(name="currencies")
	private String currencies;
	
	@Column(name="addressprefix")
	private String addressprefix;
	
	@OneToOne
	@JoinColumn(name = "lableFormat_id", referencedColumnName = "lable_format_id")
	private LableFormat lableFormat;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public String getCurrencies() {
		return currencies;
	}

	public void setCurrencies(String currencies) {
		this.currencies = currencies;
	}

	public String getAddressprefix() {
		return addressprefix;
	}

	public void setAddressprefix(String addressprefix) {
		this.addressprefix = addressprefix;
	}

	public LableFormat getLableFormat() {
		return lableFormat;
	}

	public void setLableFormat(LableFormat lableFormat) {
		this.lableFormat = lableFormat;
	}

	@Override
	public String toString() {
		return "Countries [id=" + id + ", pubId=" + pubId + ", state=" + state + ", description=" + description
				+ ", countries=" + countries + ", currencies=" + currencies + ", addressprefix=" + addressprefix
				+ ", lableFormat=" + lableFormat + "]";
	}
	
	

}
