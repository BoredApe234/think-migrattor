package com.mps.think.setup.vo;

import com.mps.think.setup.model.AddProcess;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.OrderClassOverview;
import com.mps.think.setup.model.OutputValue;

public class ProcessOutputVO {
	
	private Integer output_id;
	private AddProcess addProcessId;
//	private OrderClass orderClass;
	private OrderClassOverview orderClassOverview;
	private OutputValue outputValue;
	private String mode;
	private String outputfilename;
	private Boolean apendjobId;
	private String outputfileformat;
	private String installmentplan;
	private String def;
	private String test;
	private String effort;
	private String auditreport;
	private String parametervalue;
	public Integer getOutput_id() {
		return output_id;
	}
	public void setOutput_id(Integer output_id) {
		this.output_id = output_id;
	}
	public AddProcess getAddProcessId() {
		return addProcessId;
	}
	public void setAddProcessId(AddProcess addProcessId) {
		this.addProcessId = addProcessId;
	}
//	public OrderClass getOrderClass() {
//		return orderClass;
//	}
//	public void setOrderClass(OrderClass orderClass) {
//		this.orderClass = orderClass;
//	}
	public OutputValue getOutputValue() {
		return outputValue;
	}
	public void setOutputValue(OutputValue outputValue) {
		this.outputValue = outputValue;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getOutputfilename() {
		return outputfilename;
	}
	public void setOutputfilename(String outputfilename) {
		this.outputfilename = outputfilename;
	}
	public Boolean getApendjobId() {
		return apendjobId;
	}
	public void setApendjobId(Boolean apendjobId) {
		this.apendjobId = apendjobId;
	}
	public String getOutputfileformat() {
		return outputfileformat;
	}
	public void setOutputfileformat(String outputfileformat) {
		this.outputfileformat = outputfileformat;
	}
	public String getInstallmentplan() {
		return installmentplan;
	}
	public void setInstallmentplan(String installmentplan) {
		this.installmentplan = installmentplan;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getEffort() {
		return effort;
	}
	public void setEffort(String effort) {
		this.effort = effort;
	}
	public String getAuditreport() {
		return auditreport;
	}
	public void setAuditreport(String auditreport) {
		this.auditreport = auditreport;
	}
	public String getParametervalue() {
		return parametervalue;
	}
	public void setParametervalue(String parametervalue) {
		this.parametervalue = parametervalue;
	}
	public OrderClassOverview getOrderClassOverview() {
		return orderClassOverview;
	}
	public void setOrderClassOverview(OrderClassOverview orderClassOverview) {
		this.orderClassOverview = orderClassOverview;
	}
	
	
	
	
	

}
