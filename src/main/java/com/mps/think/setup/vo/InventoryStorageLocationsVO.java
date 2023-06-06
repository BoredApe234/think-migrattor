package com.mps.think.setup.vo;

public class InventoryStorageLocationsVO {
	
	private Integer id;
	
	private LocationAreaDetailsVO location;
	
	private AreaDetailsVO areaLookup;
	
	private String alternateArea;
	
	private String bin;

	public LocationAreaDetailsVO getLocation() {
		return location;
	}

	public void setLocation(LocationAreaDetailsVO location) {
		this.location = location;
	}

	public AreaDetailsVO getAreaLookup() {
		return areaLookup;
	}

	public void setAreaLookup(AreaDetailsVO areaLookup) {
		this.areaLookup = areaLookup;
	}

	public String getAlternateArea() {
		return alternateArea;
	}

	public void setAlternateArea(String alternateArea) {
		this.alternateArea = alternateArea;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
