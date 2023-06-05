package com.mps.think.setup.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "send_invoice")
public class SendInvoice extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	 private Integer id;
	
	@Column(name = "email_from")
	private String emailFrom;
	
	@Column(name = "email_to")
	private String emailTo;
	
	@Column(name = "email_cc")
	private String emailCC;
	
	@Column(name = "email_subject")
	private String emailSubject;
	
	@Column(name = "email_content")
	private String emailContent;
	
	@Column(name = "file_name")
	private String fileName;
	
	@Lob
    @Column(name ="file_data")
    private byte[] fileData;
	
	@OneToOne
	@JoinColumn(name="pub_id",referencedColumnName="id")
	private Publisher publisher;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getEmailCC() {
		return emailCC;
	}

	public void setEmailCC(String emailCC) {
		this.emailCC = emailCC;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailContent() {
		return emailContent;
	}

	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "SendInvoice [id=" + id + ", emailFrom=" + emailFrom + ", emailTo=" + emailTo + ", emailCC=" + emailCC
				+ ", emailSubject=" + emailSubject + ", emailContent=" + emailContent + ", fileName=" + fileName
				+ ", fileData=" + Arrays.toString(fileData) + ", publisher=" + publisher + "]";
	}

	
}
