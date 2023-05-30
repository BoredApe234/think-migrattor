package com.mps.think.setup.vo;

import java.util.List;
import com.mps.think.setup.model.Publisher;


public class RegionListVO {
	
	private Integer id;
	private Publisher pubId;
	private List<RegionListMappingVO> regionListMapping;
	private String state;
	private Integer taxcomputation;
	private Integer addressvalidation;
	
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
	public List<RegionListMappingVO> getRegionListMapping() {
		return regionListMapping;
	}
	public void setRegionListMapping(List<RegionListMappingVO> regionListMapping) {
		this.regionListMapping = regionListMapping;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getTaxcomputation() {
		return taxcomputation;
	}
	public void setTaxcomputation(Integer taxcomputation) {
		this.taxcomputation = taxcomputation;
	}
	public Integer getAddressvalidation() {
		return addressvalidation;
	}
	public void setAddressvalidation(Integer addressvalidation) {
		this.addressvalidation = addressvalidation;
	}
	@Override
	public String toString() {
		return "RegionListVO [id=" + id + ", pubId=" + pubId + ", regionListMapping=" + regionListMapping + ", state="
				+ state + ", taxcomputation=" + taxcomputation + ", addressvalidation=" + addressvalidation + "]";
	}
	
	
	
	
	
	

}
