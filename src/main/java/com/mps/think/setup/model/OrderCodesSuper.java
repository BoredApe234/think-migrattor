package com.mps.think.setup.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "order_codes_parent")
public class OrderCodesSuper extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7472944664908630935L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")
	private Publisher publisher;
	
//	@Column(name = "order_class_id")
//	private Integer orderClassId;
	
	@ManyToOne
	@JoinColumn(name = "order_code_parent_id", referencedColumnName = "parent_id")
	private ParentClass parent;
	
	@ManyToOne
	@JoinColumn(name = "order_code_child_id", referencedColumnName = "child_id")
	private ChildClass child;
	
	@ManyToOne
	@JoinColumn(name = "sub_child_id", referencedColumnName = "subchild_id")
	private SubChildClass subChild;
	
	@ManyToOne
	@JoinColumn(name = "order_class_id", referencedColumnName = "oc_id")
	private OrderClass orderClass;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_codes_id", referencedColumnName = "id")
	private OrderCodes orderCodes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_item_details_id", referencedColumnName = "id")
	private OrderItemDetails orderItemDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_payment_options_id", referencedColumnName = "id")
	private OrderPaymentOptions orderPaymentOptions;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_options_id", referencedColumnName = "id")
	private OrderOptions orderOptions;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_pkg_options_id", referencedColumnName = "id")
	private OrderPackageOptions orderPackageOptions;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

//	public Integer getOrderClassId() {
//		return orderClassId;
//	}
//
//	public void setOrderClassId(Integer orderClassId) {
//		this.orderClassId = orderClassId;
//	}

	public OrderCodes getOrderCodes() {
		return orderCodes;
	}

	public void setOrderCodes(OrderCodes orderCodes) {
		this.orderCodes = orderCodes;
	}

	public OrderItemDetails getOrderItemDetails() {
		return orderItemDetails;
	}

	public void setOrderItemDetails(OrderItemDetails orderItemDetails) {
		this.orderItemDetails = orderItemDetails;
	}

	public OrderPaymentOptions getOrderPaymentOptions() {
		return orderPaymentOptions;
	}

	public void setOrderPaymentOptions(OrderPaymentOptions orderPaymentOptions) {
		this.orderPaymentOptions = orderPaymentOptions;
	}

	public OrderOptions getOrderOptions() {
		return orderOptions;
	}

	public void setOrderOptions(OrderOptions orderOptions) {
		this.orderOptions = orderOptions;
	}

	public OrderPackageOptions getOrderPackageOptions() {
		return orderPackageOptions;
	}

	public void setOrderPackageOptions(OrderPackageOptions orderPackageOptions) {
		this.orderPackageOptions = orderPackageOptions;
	}

	public ParentClass getParent() {
		return parent;
	}

	public void setParent(ParentClass parent) {
		this.parent = parent;
	}

	public ChildClass getChild() {
		return child;
	}

	public void setChild(ChildClass child) {
		this.child = child;
	}

	public OrderClass getOrderClass() {
		return orderClass;
	}

	public void setOrderClass(OrderClass orderClass) {
		this.orderClass = orderClass;
	}

	public SubChildClass getSubChild() {
		return subChild;
	}

	public void setSubChild(SubChildClass subChild) {
		this.subChild = subChild;
	}

	
}
