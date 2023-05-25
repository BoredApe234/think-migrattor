package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "location_area_details")
@Entity
public class LocationAreaDetails extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1832594165995988332L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "location_description")
	private String locationDescription;
	
	@Column(name = "location_is_active")
	private Boolean locationIsActive;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "area_description")
	private String areaDescription;
	
	@Column(name = "area_is_active")
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
