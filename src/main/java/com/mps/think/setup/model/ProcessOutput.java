package com.mps.think.setup.model;
// model changes
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "process_output")
public class ProcessOutput extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "output_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer output_id;
	
	@ManyToOne
	@JoinColumn(name = "addProcess_id", referencedColumnName = "id" )
	private AddProcess addProcessId;
	
//	@ManyToOne
//	@JoinColumn(name = "order_cls_id", referencedColumnName = "oc_id")
//	private OrderClass orderClass;
	
	@ManyToOne
	@JoinColumn(name = "order_cls_overview", referencedColumnName = "id")
	private OrderClassOverview orderClassOverview;
	
	@ManyToOne
	@JoinColumn(name = "output", referencedColumnName = "id")
	private OutputValue outputValue;
	
	@Column(name = "mode")
	private String mode;
	
	@Column(name = "outputfilename")
	private String outputfilename;
	
	@Column(name = "apendjobid")
	private Boolean apendjobId;
	
	@Column(name = "outputfileformat")
	private String outputfileformat;
	
	@Column(name = "installmentplan")
	private String installmentplan;
	
	@Column(name = "def")
	private String def;
	
	@Column(name = "test")
	private String test;
	
	@Column(name = "effort")
	private String effort;
	
	@Column(name = "auditreport")
	private String auditreport;
	
	@Column(name = "parameter_value")
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
//
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

	@Override
	public String toString() {
		return "ProcessOutput [output_id=" + output_id + ", addProcessId=" + addProcessId + ", orderClassOverview="
				+ orderClassOverview + ", outputValue=" + outputValue + ", mode=" + mode + ", outputfilename="
				+ outputfilename + ", apendjobId=" + apendjobId + ", outputfileformat=" + outputfileformat
				+ ", installmentplan=" + installmentplan + ", def=" + def + ", test=" + test + ", effort=" + effort
				+ ", auditreport=" + auditreport + ", parametervalue=" + parametervalue + "]";
	}
	
	

		

}
