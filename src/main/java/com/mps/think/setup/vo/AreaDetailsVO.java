package com.mps.think.setup.vo;

public class AreaDetailsVO {

	private Integer id;
	
	private String area;
	
	private String areaDescription;
	
	private Boolean areaIsActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaDescription() {
		return areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

	public Boolean getAreaIsActive() {
		return areaIsActive;
	}

	public void setAreaIsActive(Boolean areaIsActive) {
		this.areaIsActive = areaIsActive;
	}
	
}
