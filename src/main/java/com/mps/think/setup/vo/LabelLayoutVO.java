package com.mps.think.setup.vo;
import java.util.List;

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
//	private CustomerDetailsVO customerdetails;
	private String display;
	private List<String> column_name;
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
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public List<String> getColumn_name() {
		return column_name;
	}
	public void setColumn_name(List<String> column_name) {
		this.column_name = column_name;
	}
	@Override
	public String toString() {
		return "LabelLayoutVO [id=" + id + ", pubId=" + pubId + ", lableformat=" + lableformat + ", lablegroup="
				+ lablegroup + ", description=" + description + ", suppressed=" + suppressed + ", truncated="
				+ truncated + ", display=" + display + ", column_name=" + column_name + "]";
	}
	
	
	
	

}
