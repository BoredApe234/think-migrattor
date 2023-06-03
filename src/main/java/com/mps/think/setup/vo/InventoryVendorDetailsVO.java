package com.mps.think.setup.vo;

public class InventoryVendorDetailsVO {

	private Integer id;
	
	private String packageCode;
	
	private String packageDescription;
	
	private VendorDetailsVO vendor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getPackageDescription() {
		return packageDescription;
	}

	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}

	public VendorDetailsVO getVendor() {
		return vendor;
	}

	public void setVendor(VendorDetailsVO vendor) {
		this.vendor = vendor;
	}
	
}
