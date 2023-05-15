package com.mps.think.setup.vo;
import com.mps.think.setup.model.ExtractFilter;
import com.mps.think.setup.model.ProcessType;

public class SplitsVO {
	
	private Integer id;
	private String value;
	private String description;
	private ExtractFilter extractfilterid;
	private ProcessType pid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ExtractFilter getExtractfilterid() {
		return extractfilterid;
	}
	public void setExtractfilterid(ExtractFilter extractfilterid) {
		this.extractfilterid = extractfilterid;
	}
	public ProcessType getPid() {
		return pid;
	}
	public void setPid(ProcessType pid) {
		this.pid = pid;
	}

	
	
	

}
