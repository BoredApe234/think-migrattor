package com.mps.think.setup.vo;

import com.mps.think.setup.model.OutputValue;
import com.mps.think.setup.model.RenewalDefinition;

public class AddEffortVO {
	
    private Integer id;
	private String effort;
	private String method;
	private String noofdays;
	private String efforttype;
	private String sendto;
	private String pricing;
	private OutputValue ovId;
	private String attachments;
	private String message;
	private RenewalDefinitionVO rdid;
	private String renewaldefinition;
	private String renewaldefinitiontestseq;
	private Boolean suppressemail;
	private Boolean testinginprogress;
	private String description;
	private Integer nth;
	private Boolean showallprocesses;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEffort() {
		return effort;
	}
	public void setEffort(String effort) {
		this.effort = effort;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(String noofdays) {
		this.noofdays = noofdays;
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
	public OutputValue getOvId() {
		return ovId;
	}
	public void setOvId(OutputValue ovId) {
		this.ovId = ovId;
	}
	public String getAttachments() {
		return attachments;
	}
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public RenewalDefinitionVO getRdid() {
		return rdid;
	}
	public void setRdid(RenewalDefinitionVO rdid) {
		this.rdid = rdid;
	}
	public String getRenewaldefinition() {
		return renewaldefinition;
	}
	public void setRenewaldefinition(String renewaldefinition) {
		this.renewaldefinition = renewaldefinition;
	}
	public String getRenewaldefinitiontestseq() {
		return renewaldefinitiontestseq;
	}
	public void setRenewaldefinitiontestseq(String renewaldefinitiontestseq) {
		this.renewaldefinitiontestseq = renewaldefinitiontestseq;
	}
	public Boolean getSuppressemail() {
		return suppressemail;
	}
	public void setSuppressemail(Boolean suppressemail) {
		this.suppressemail = suppressemail;
	}
	public Boolean getTestinginprogress() {
		return testinginprogress;
	}
	public void setTestinginprogress(Boolean testinginprogress) {
		this.testinginprogress = testinginprogress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getNth() {
		return nth;
	}
	public void setNth(Integer nth) {
		this.nth = nth;
	}
	public Boolean getShowallprocesses() {
		return showallprocesses;
	}
	public void setShowallprocesses(Boolean showallprocesses) {
		this.showallprocesses = showallprocesses;
	}
	
	

}
