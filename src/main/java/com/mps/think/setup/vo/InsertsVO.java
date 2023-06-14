package com.mps.think.setup.vo;

import com.mps.think.setup.model.ExtractFilter;
import com.mps.think.setup.model.ProcessType;

public class InsertsVO {
	
	private Integer id;
	private Integer bit;
	private String description;
	private ExtractFilter efid;
	private ProcessType pid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBit() {
		return bit;
	}
	public void setBit(Integer bit) {
		this.bit = bit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ExtractFilter getEfid() {
		return efid;
	}
	public void setEfid(ExtractFilter efid) {
		this.efid = efid;
	}
	public ProcessType getPid() {
		return pid;
	}
	public void setPid(ProcessType pid) {
		this.pid = pid;
	}
	
	
	
	
	
	

}
