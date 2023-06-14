package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "source_format_segment")
@Entity
public class SourceFormatSegment extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "Source_attribute_id", referencedColumnName = "id")
	private SourceAttributes sourceAttribute;

//	@Column(name = "source_format")
	@OneToOne
	@JoinColumn(name = "Source_format_id", referencedColumnName = "id")
	private SourceFormat sourceFormat;

//	@Enumerated(EnumType.STRING)
	@Column(name = "generation_method")
	private String generationMethod;
//	private AppConstants.GenerationMethod generationMethod;

	@Column(name = "fixed_value")
	private String fixedValue;

	@Column(name = "gen_func_parm")
	private String genFuncParm;

//	@Enumerated(EnumType.STRING)
	@Column(name = "generation_function")
	private String generationFunction;
//	private AppConstants.GenerationFunction generationFunction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SourceAttributes getSourceAttribute() {
		return sourceAttribute;
	}

	public void setSourceAttribute(SourceAttributes sourceAttribute) {
		this.sourceAttribute = sourceAttribute;
	}

	public SourceFormat getSourceFormat() {
		return sourceFormat;
	}

	public void setSourceFormat(SourceFormat sourceFormat) {
		this.sourceFormat = sourceFormat;
	}

	public String getGenerationMethod() {
		return generationMethod;
	}

	public void setGenerationMethod(String generationMethod) {
		this.generationMethod = generationMethod;
	}

	public String getFixedValue() {
		return fixedValue;
	}

	public void setFixedValue(String fixedValue) {
		this.fixedValue = fixedValue;
	}

	public String getGenFuncParm() {
		return genFuncParm;
	}

	public void setGenFuncParm(String genFuncParm) {
		this.genFuncParm = genFuncParm;
	}

	public String getGenerationFunction() {
		return generationFunction;
	}

	public void setGenerationFunction(String generationFunction) {
		this.generationFunction = generationFunction;
	}

	@Override
	public String toString() {
		return "SourceFormatSegment [id=" + id + ", sourceAttribute=" + sourceAttribute + ", sourceFormat="
				+ sourceFormat + ", generationMethod=" + generationMethod + ", fixedValue=" + fixedValue
				+ ", genFuncParm=" + genFuncParm + ", generationFunction=" + generationFunction + "]";
	}

	
	
}