package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class SourceAttributeValuesVO {

	private Integer id;

	private Publisher publisher;

	private String chosenAttributeValue;

	private String description;

	private Integer maxCharacterLen;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public String getChosenAttributeValue() {
		return chosenAttributeValue;
	}

	public void setChosenAttributeValue(String chosenAttributeValue) {
		this.chosenAttributeValue = chosenAttributeValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMaxCharacterLen() {
		return maxCharacterLen;
	}

	public void setMaxCharacterLen(Integer maxCharacterLen) {
		this.maxCharacterLen = maxCharacterLen;
	}
	
	
}