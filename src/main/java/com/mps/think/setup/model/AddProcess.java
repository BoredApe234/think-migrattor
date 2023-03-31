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
	
	@OneToOne
	@JoinColumn(name = "processtype_id", referencedColumnName = "p_Id" )
	private ProcessType process_typeid;

	public Integer getProcess_id() {
		return process_id;
	}

	public void setProcess_id(Integer process_id) {
		this.process_id = process_id;
	}

	public ProcessType getProcess_typeid() {
		return process_typeid;
	}

	public void setProcess_typeid(ProcessType process_typeid) {
		this.process_typeid = process_typeid;
	}

	
	
	
	
	
	
	

}
