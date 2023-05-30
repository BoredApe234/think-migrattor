package com.mps.think.setup.vo;

public class LocationAreaDetailsVO {

	private Integer id;
	
	private String location;
	
	private String locationDescription;
	
	private Boolean locationIsActive;
	
	private String area;
	
	private String areaDescription;
	
	private Boolean areaIsActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public Boolean getLocationIsActive() {
		return locationIsActive;
	}

	public void setLocationIsActive(Boolean locationIsActive) {
		this.locationIsActive = locationIsActive;
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
