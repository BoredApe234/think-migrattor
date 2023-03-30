package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "process")
public class AddProcess extends BaseEntity  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "process_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer process_id;
	
	@Column(name = "process_types")
	private String process_type;

	public Integer getProcess_id() {
		return process_id;
	}

	public void setProcess_id(Integer process_id) {
		this.process_id = process_id;
	}

	public String getProcess_type() {
		return process_type;
	}

	public void setProcess_type(String process_type) {
		this.process_type = process_type;
	}
	
	
	
	
	
	

}
