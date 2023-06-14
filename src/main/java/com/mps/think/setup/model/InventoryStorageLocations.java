package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "inventory_storage_locations")
@Entity
public class InventoryStorageLocations extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5638377424301988655L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "location", referencedColumnName = "id" )
	private LocationAreaDetails location;
	
	@OneToOne
	@JoinColumn(name = "areaLookup", referencedColumnName = "id" )
	private AreaDetails areaLookup;
	
	@Column(name = "alternate_area")
	private String alternateArea;
	
	@Column(name = "bin")
	private String bin;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public LocationAreaDetails getLocation() {
		return location;
	}

	public void setLocation(LocationAreaDetails location) {
		this.location = location;
	}

	public AreaDetails getAreaLookup() {
		return areaLookup;
	}

	public void setAreaLookup(AreaDetails areaLookup) {
		this.areaLookup = areaLookup;
	}

	@Override
	public String toString() {
		return "InventoryStorageLocations [id=" + id + ", location=" + location + ", areaLookup=" + areaLookup
				+ ", alternateArea=" + alternateArea + ", bin=" + bin + "]";
	}

}
