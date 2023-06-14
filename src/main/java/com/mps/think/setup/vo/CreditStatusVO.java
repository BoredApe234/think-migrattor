package com.mps.think.setup.vo;

public class CreditStatusVO{

	
	private Integer creditId;
	private PublisherVO pubId;
	private String creditName;
	private String description;
	private Integer badcredit;
	private Boolean defaultcreditstatus;
	
	public Integer getCreditId() {
		return creditId;
	}
	public void setCreditId(Integer creditId) {
		this.creditId = creditId;
	}
	public PublisherVO getPubId() {
		return pubId;
	}
	public void setPubId(PublisherVO pubId) {
		this.pubId = pubId;
	}
	public String getCreditName() {
		return creditName;
	}
	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getBadcredit() {
		return badcredit;
	}
	public void setBadcredit(Integer badcredit) {
		this.badcredit = badcredit;
	}
	public Boolean getDefaultcreditstatus() {
		return defaultcreditstatus;
	}
	public void setDefaultcreditstatus(Boolean defaultcreditstatus) {
		this.defaultcreditstatus = defaultcreditstatus;
	}
	@Override
	public String toString() {
		return "CreditStatusVO [creditId=" + creditId + ", pubId=" + pubId + ", creditName=" + creditName
				+ ", description=" + description + ", badcredit=" + badcredit + ", defaultcreditstatus="
				+ defaultcreditstatus + "]";
	}
	
	
}

	
/*
 * CREATE TABLE `THINK_SETUP`.`sales_representative` ( `id` INT NOT NULL,
 * `pubid` INT NULL, `name` VARCHAR(45) NULL, `isactive` TINYINT NULL,
 * `created_by` VARCHAR(45) NULL, `created_At` VARCHAR(45) NULL, `updated_BY`
 * VARCHAR(45) NULL, `updated_at` VARCHAR(45) NULL, PRIMARY KEY (`id`));
 */