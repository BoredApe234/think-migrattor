package com.mps.think.setup.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "label_layout")
public class LabelLayout extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@OneToOne
	@JoinColumn(name = "lableformat_id", referencedColumnName = "lable_format_id" )
	private LableFormat lableformat;
	
	@OneToOne
	@JoinColumn(name = "lablegroup_id", referencedColumnName = "lable_group_id" )
	private LableGroup lablegroup;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "suppressed")
	private Boolean suppressed;
	
	@Column(name = "truncated")
	private Boolean truncated;
	
//	@OneToOne
//	@JoinColumn(name = "customerdetails", referencedColumnName = "id" )
//	private CustomerDetails customerdetails;
	
	@Column(name = "display")
	private String display;
	
	@ElementCollection
	@Column(name = "row1")
	private List<String> row1;
	
	@ElementCollection
	@Column(name = "row2")
	private List<String> row2;
	
	@ElementCollection
	@Column(name = "row3")
	private List<String> row3;
	
	@ElementCollection
	@Column(name = "row4")
	private List<String> row4;
	
	@ElementCollection
	@Column(name = "row5")
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
		return "LabelLayout [id=" + id + ", pubId=" + pubId + ", lableformat=" + lableformat + ", lablegroup="
				+ lablegroup + ", description=" + description + ", suppressed=" + suppressed + ", truncated="
				+ truncated + ", display=" + display + ", row1=" + row1 + ", row2=" + row2 + ", row3=" + row3
				+ ", row4=" + row4 + ", row5=" + row5 + "]";
	}

	
	
	

}
