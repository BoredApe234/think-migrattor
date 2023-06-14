package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class RentalStatusVO {

	private Integer rentalStatusId;
	private String rentalcategory;

	private String description;

	private Integer rentEmail;

	private Integer rentName;
	
	private Publisher publisher;
	
	private Boolean defaultrentalstatus;

	public Integer getRentalStatusId() {
		return rentalStatusId;
	}

	public void setRentalStatusId(Integer rentalStatusId) {
		this.rentalStatusId = rentalStatusId;
	}

	public String getRentalcategory() {
		return rentalcategory;
	}

	public void setRentalcategory(String rentalcategory) {
		this.rentalcategory = rentalcategory;
	}

	public Integer getRentEmail() {
		return rentEmail;
	}

	public void setRentEmail(Integer rentEmail) {
		this.rentEmail = rentEmail;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRentName() {
		return rentName;
	}

	public void setRentName(Integer rentName) {
		this.rentName = rentName;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Boolean getDefaultrentalstatus() {
		return defaultrentalstatus;
	}

	public void setDefaultrentalstatus(Boolean defaultrentalstatus) {
		this.defaultrentalstatus = defaultrentalstatus;
	}

	@Override
	public String toString() {
		return "RentalStatusVO [rentalStatusId=" + rentalStatusId + ", rentalcategory=" + rentalcategory
				+ ", description=" + description + ", rentEmail=" + rentEmail + ", rentName=" + rentName
				+ ", publisher=" + publisher + ", defaultrentalstatus=" + defaultrentalstatus + "]";
	}



}