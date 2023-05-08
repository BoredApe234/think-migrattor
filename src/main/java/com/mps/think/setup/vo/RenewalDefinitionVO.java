package com.mps.think.setup.vo;

import java.util.List;

import com.mps.think.setup.model.ExtractFilter;


public class RenewalDefinitionVO {
	
	private Integer id;
	private String renewal;
	private String description;
	private Boolean issues;
	private Boolean volumegroup;
	private Boolean requal;
	private Boolean allorderclass;
	private Boolean generatesourcecode;
	private Integer renewalcard;
	private ExtractFilter efid;
	private List<RenewalDefinitionMappingVO> renewalDefinitionMapping;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRenewal() {
		return renewal;
	}
	public void setRenewal(String renewal) {
		this.renewal = renewal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIssues() {
		return issues;
	}
	public void setIssues(Boolean issues) {
		this.issues = issues;
	}
	public Boolean getVolumegroup() {
		return volumegroup;
	}
	public void setVolumegroup(Boolean volumegroup) {
		this.volumegroup = volumegroup;
	}
	public Boolean getRequal() {
		return requal;
	}
	public void setRequal(Boolean requal) {
		this.requal = requal;
	}
	public Boolean getAllorderclass() {
		return allorderclass;
	}
	public void setAllorderclass(Boolean allorderclass) {
		this.allorderclass = allorderclass;
	}
	public Boolean getGeneratesourcecode() {
		return generatesourcecode;
	}
	public void setGeneratesourcecode(Boolean generatesourcecode) {
		this.generatesourcecode = generatesourcecode;
	}
	public Integer getRenewalcard() {
		return renewalcard;
	}
	public void setRenewalcard(Integer renewalcard) {
		this.renewalcard = renewalcard;
	}
	public ExtractFilter getEfid() {
		return efid;
	}
	public void setEfid(ExtractFilter efid) {
		this.efid = efid;
	}
	public List<RenewalDefinitionMappingVO> getRenewalDefinitionMapping() {
		return renewalDefinitionMapping;
	}
	public void setRenewalDefinitionMapping(List<RenewalDefinitionMappingVO> renewalDefinitionMapping) {
		this.renewalDefinitionMapping = renewalDefinitionMapping;
	}

	
	
	

}
