package com.mps.think.setup.vo;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.RenewalDefinition;

public class RenewalDefinitionMappingVO {
	
	private Integer rdid;
	private OrderClass orderClass;

	

	public OrderClass getOrderClass() {
		return orderClass;
	}
	public void setOrderClass(OrderClass orderClass) {
		this.orderClass = orderClass;
	}
	public Integer getRdid() {
		return rdid;
	}
	public void setRdid(Integer rdid) {
		this.rdid = rdid;
	}
	
	

}
