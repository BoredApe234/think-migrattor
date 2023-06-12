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
    private List<String> row1;
	private List<String> row2;
	private List<String> row3;
	private List<String> row4;
	private List<String> row5;
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
	public List<String> getRow1() {
		return row1;
	}
	public void setRow1(List<String> row1) {
		this.row1 = row1;
	}
	public List<String> getRow2() {
		return row2;
	}
	public void setRow2(List<String> row2) {
		this.row2 = row2;
	}
	public List<String> getRow3() {
		return row3;
	}
	public void setRow3(List<String> row3) {
		this.row3 = row3;
	}
	public List<String> getRow4() {
		return row4;
	}
	public void setRow4(List<String> row4) {
		this.row4 = row4;
	}
	public List<String> getRow5() {
		return row5;
	}
	public void setRow5(List<String> row5) {
		this.row5 = row5;
	}
	@Override
	public String toString() {
		return "LabelLayoutVO [id=" + id + ", pubId=" + pubId + ", lableformat=" + lableformat + ", lablegroup="
				+ lablegroup + ", description=" + description + ", suppressed=" + suppressed + ", truncated="
				+ truncated + ", display=" + display + ", row1=" + row1 + ", row2=" + row2 + ", row3=" + row3
				+ ", row4=" + row4 + ", row5=" + row5 + "]";
	}
	
	
	

}
