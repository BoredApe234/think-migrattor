package com.mps.think.setup.vo;

import com.mps.think.setup.model.OutputValue;

public class AddEffortsVO {
	
    private Integer id;
	private String method;
	private String days;
	private String efforttype;
	private String sendto;
	private String pricing;
	private String attachement;
	private String message;
	private Boolean suppressemail;
	private Boolean testingprogress;
	private Boolean allprocesses;
	private String renewaldef;
	private String renewaldeftestseq;
	private OutputValue outputValue;
	private RenewalDefinitionVO rdid;
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
	public RenewalDefinitionVO getRdid() {
		return rdid;
	}
	public void setRdid(RenewalDefinitionVO rdid) {
		this.rdid = rdid;
	}

	
	
	
	

}
