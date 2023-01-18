package com.mps.think.setup.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

<<<<<<< HEAD


=======
import com.mps.think.setup.vo.EnumModelVO.source_code_type;
>>>>>>> fe14b165d73746ddc94ff927721423f7523ece6c

@Table(name = "source_Code")
@Entity
public class SourceCode extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1831986296356956427L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sourc_code_id")
	private Integer sourceCodeId;
	
	@ManyToOne
	@JoinColumn(name = "pub_id", referencedColumnName = "id")
	private Publisher pubId;
	
	@ManyToOne
	@JoinColumn(name = "parent_id", referencedColumnName = "parent_id")
	private ParentClass parentID;
	
//	@ManyToOne
//	@JoinColumn(name = "child_id", referencedColumnName = "child_id")
//	private ChildClass childID;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "order_code")
	private String orderCode;
	
	@Column(name = "order_code_type")
	private String order_code_type;
	
	@Column(name = "quantity")
	private Integer quantity;
	
//	=====================================================================================================	
//	need to change integer to order class name and join column with order class id
	@Column(name="oc_id")
	private Integer ocId;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "state_break")
	private Boolean state_Break;
	
	@Column(name = "cost")
	private Integer cost;
	
	@Column(name = "is_generated")
	private Boolean isGenerated;
	
	@Column(name="generic_agency")
	private Integer generic_agency;
	
	@Column(name="is_ddp")
	private Integer is_ddp;
	
	@Column(name="source_code")
	private String sourceCode;
	
	
	@Column(name = "source_code_type")
	private String sourceCodeType;

//	These are dropdown fields ===============
	@Column(name="source_code_format")
	private String sourceCodeFormat;
	
	@Column(name="rate_card")
	private String rateCard;
	
	@Column(name="discount")
	private Integer discount;
	
	@Column(name="shipping_price_list")
	private Integer shippingPriceList;

	public Integer getSourceCodeId() {
		return sourceCodeId;
	}

	public void setSourceCodeId(Integer sourceCodeId) {
		this.sourceCodeId = sourceCodeId;
	}

	public ParentClass getParentID() {
		return parentID;
	}

	public void setParentID(ParentClass parentID) {
		this.parentID = parentID;
	}

//	public ChildClass getChildID() {
//		return childID;
//	}
//
//	public void setChildID(ChildClass childID) {
//		this.childID = childID;
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getOcId() {
		return ocId;
	}

	public void setOcId(Integer ocId) {
		this.ocId = ocId;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getState_Break() {
		return state_Break;
	}

	public void setState_Break(Boolean state_Break) {
		this.state_Break = state_Break;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Boolean getIsGenerated() {
		return isGenerated;
	}

	public void setIsGenerated(Boolean isGenerated) {
		this.isGenerated = isGenerated;
	}

	public Integer getGeneric_agency() {
		return generic_agency;
	}

	public void setGeneric_agency(Integer generic_agency) {
		this.generic_agency = generic_agency;
	}

	public Integer getIs_ddp() {
		return is_ddp;
	}

	public void setIs_ddp(Integer is_ddp) {
		this.is_ddp = is_ddp;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceCodeType() {
		return sourceCodeType;
	}

	public void setSourceCodeType(String sourceCodeType) {
		this.sourceCodeType = sourceCodeType;
	}

	public String getSourceCodeFormat() {
		return sourceCodeFormat;
	}

	public void setSourceCodeFormat(String sourceCodeFormat) {
		this.sourceCodeFormat = sourceCodeFormat;
	}

	public String getRateCard() {
		return rateCard;
	}

	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getShippingPriceList() {
		return shippingPriceList;
	}

	public void setShippingPriceList(Integer shippingPriceList) {
		this.shippingPriceList = shippingPriceList;
	}

	public String getOrder_code_type() {
		return order_code_type;
	}

	public void setOrder_code_type(String order_code_type) {
		this.order_code_type = order_code_type;
	}

	public Publisher getPubId() {
		return pubId;
	}

	public void setPubId(Publisher pubId) {
		this.pubId = pubId;
	}

	@Override
	public String toString() {
		return "SourceCode [sourceCodeId=" + sourceCodeId + ", pubId=" + pubId + ", parentID=" + parentID
				+ ", description=" + description + ", orderCode=" + orderCode + ", order_code_type=" + order_code_type
				+ ", quantity=" + quantity + ", ocId=" + ocId + ", isActive=" + isActive + ", state_Break="
				+ state_Break + ", cost=" + cost + ", isGenerated=" + isGenerated + ", generic_agency=" + generic_agency
				+ ", is_ddp=" + is_ddp + ", sourceCode=" + sourceCode + ", sourceCodeType=" + sourceCodeType
				+ ", sourceCodeFormat=" + sourceCodeFormat + ", rateCard=" + rateCard + ", discount=" + discount
				+ ", shippingPriceList=" + shippingPriceList + "]";
	}

	

	
	
}
