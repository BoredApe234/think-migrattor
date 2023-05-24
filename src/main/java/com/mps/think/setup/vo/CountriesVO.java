package com.mps.think.setup.vo;
import com.mps.think.setup.model.LableFormat;
import com.mps.think.setup.model.Publisher;

public class CountriesVO {
	
	private Integer id;
	private Publisher pubId;
	private String state;
	private String description;
	private String countries;
	private String currencies;
	private String addressprefix;
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
		return "CountriesVO [id=" + id + ", pubId=" + pubId + ", state=" + state + ", description=" + description
				+ ", countries=" + countries + ", currencies=" + currencies + ", addressprefix=" + addressprefix
				+ ", lableFormat=" + lableFormat + "]";
	}
	
	

}
