package com.mps.think.setup.vo;

import com.mps.think.setup.model.Publisher;

public class InvoiceEmailsTampletVO {
	
	private Integer id;
	private String emailTamplateName;
	private String textFormate;
	private String templateType;
	private boolean defaultStatus;
	private Publisher publisher;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmailTamplateName() {
		return emailTamplateName;
	}
	public void setEmailTamplateName(String emailTamplateName) {
		this.emailTamplateName = emailTamplateName;
	}
	public String getTextFormate() {
		return textFormate;
	}
	public void setTextFormate(String textFormate) {
		this.textFormate = textFormate;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public boolean isDefaultStatus() {
		return defaultStatus;
	}
	public void setDefaultStatus(boolean defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "InvoiceEmailsTampletVO [id=" + id + ", emailTamplateName=" + emailTamplateName + ", textFormate="
				+ textFormate + ", templateType=" + templateType + ", defaultStatus=" + defaultStatus + ", publisher="
				+ publisher + "]";
	}
	
}
