package com.mps.think.setup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Table(name = "order_key_information")
@Entity
public class OrderKeyInformation extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6518651567508298610L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "order_code_id", referencedColumnName = "id")
	private OrderCodesSuper orderCode;
	
	@ManyToOne
	@JoinColumn(name = "sourc_code_id")
	private SourceCode sourceCode;
	
	@Column(name = "order_category")
	private String orderCategory;
	
	@Column(name = "order_status")
	private String orderStatus;
	
	@Column(name = "order_date")
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date orderDate;

	@Column(name = "purchase_order")
	private String purchaseOrder;
	
	@Column(name = "agent")
	private String agent;
	
	@Column(name = "agent_reference_number")
	private Long agentReferenceNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCategory() {
		return orderCategory;
	}

	public void setOrderCategory(String orderCategory) {
		this.orderCategory = orderCategory;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public Long getAgentReferenceNum() {
		return agentReferenceNum;
	}

	public void setAgentReferenceNum(Long agentReferenceNum) {
		this.agentReferenceNum = agentReferenceNum;
	}

	public SourceCode getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(SourceCode sourceCode) {
		this.sourceCode = sourceCode;
	}

	public OrderCodesSuper getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(OrderCodesSuper orderCode) {
		this.orderCode = orderCode;
	}

	@Override
	public String toString() {
		return "OrderKeyInformation [id=" + id + ", orderCode=" + orderCode + ", sourceCode=" + sourceCode
				+ ", orderCategory=" + orderCategory + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate
				+ ", purchaseOrder=" + purchaseOrder + ", agent=" + agent + ", agentReferenceNum=" + agentReferenceNum
				+ "]";
	}

}
