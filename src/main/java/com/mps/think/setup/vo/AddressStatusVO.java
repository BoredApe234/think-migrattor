package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class AddressStatusVO {
	
	private Integer id;
	private Publisher pubId;
	private Boolean defaultstatus;
	private String addressstatus;
	private String status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getDefaultstatus() {
		return defaultstatus;
	}
	public void setDefaultstatus(Boolean defaultstatus) {
		this.defaultstatus = defaultstatus;
	}
	public String getAddressstatus() {
		return addressstatus;
	}
	public void setAddressstatus(String addressstatus) {
		this.addressstatus = addressstatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Publisher getPubId() {
		return pubId;
	}
	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}
	
	
	

}
