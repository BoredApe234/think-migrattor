package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "efforts")
public class AddEfforts extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "method")
	private String method;
	
	@Column(name = "days")
	private String days;
	
	@Column(name = "efforttype")
	private String efforttype;
	
	@Column(name = "sendto")
	private String sendto;
	
	@Column(name = "pricing")
	private String pricing;
	
	@Column(name = "attachement")
	private String attachement;
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "suppressemail")
	private Boolean suppressemail;
	
	@Column(name = "testingprogress")
	private Boolean testingprogress;
	
	@Column(name = "allprocesses")
	private Boolean allprocesses;
	
	@Column(name = "renewal_def")
	private String renewaldef;
	
	@Column(name = "renewaldeftestseq")
	private String renewaldeftestseq;
	
	@OneToOne
	@JoinColumn(name = "output", referencedColumnName = "id")
	private OutputValue outputValue;
	
	@OneToOne
	@JoinColumn(name = "rd_id", referencedColumnName = "id" )
	private RenewalDefinition rdid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getEfforttype() {
		return efforttype;
	}

	public void setEfforttype(String efforttype) {
		this.efforttype = efforttype;
	}

	public String getSendto() {
		return sendto;
	}

	public void setSendto(String sendto) {
		this.sendto = sendto;
	}

	public String getPricing() {
		return pricing;
	}

	public void setPricing(String pricing) {
		this.pricing = pricing;
	}

	public String getAttachement() {
		return attachement;
	}

	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuppressemail() {
		return suppressemail;
	}

	public void setSuppressemail(Boolean suppressemail) {
		this.suppressemail = suppressemail;
	}

	public Boolean getTestingprogress() {
		return testingprogress;
	}

	public void setTestingprogress(Boolean testingprogress) {
		this.testingprogress = testingprogress;
	}

	public Boolean getAllprocesses() {
		return allprocesses;
	}

	public void setAllprocesses(Boolean allprocesses) {
		this.allprocesses = allprocesses;
	}

	public String getRenewaldef() {
		return renewaldef;
	}

	public void setRenewaldef(String renewaldef) {
		this.renewaldef = renewaldef;
	}

	public String getRenewaldeftestseq() {
		return renewaldeftestseq;
	}

	public void setRenewaldeftestseq(String renewaldeftestseq) {
		this.renewaldeftestseq = renewaldeftestseq;
	}

	public OutputValue getOutputValue() {
		return outputValue;
	}

	public void setOutputValue(OutputValue outputValue) {
		this.outputValue = outputValue;
	}

	public RenewalDefinition getRdid() {
		return rdid;
	}

	public void setRdid(RenewalDefinition rdid) {
		this.rdid = rdid;
	}

	
	
	
	

}
