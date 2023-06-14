package com.mps.think.setup.vo;

import java.util.Date;
import java.util.List;

import com.mps.think.setup.vo.EnumModelVO.OrderStatus;

public class ReinstateOrderVO {

	private Integer id;

	private String currentOrderStatus;

	private Date suspendedFrom;

	private Date suspendedTo;

	private String notes;

	private List<OrdersReinstatedVO> ordersToReinstate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getSuspendedFrom() {
		return suspendedFrom;
	}

	public void setSuspendedFrom(Date suspendedFrom) {
		this.suspendedFrom = suspendedFrom;
	}

	public Date getSuspendedTo() {
		return suspendedTo;
	}

	public void setSuspendedTo(Date suspendedTo) {
		this.suspendedTo = suspendedTo;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public List<OrdersReinstatedVO> getOrdersToReinstate() {
		return ordersToReinstate;
	}

	public void setOrdersToReinstate(List<OrdersReinstatedVO> ordersToReinstate) {
		this.ordersToReinstate = ordersToReinstate;
	}

	public String getCurrentOrderStatus() {
		return currentOrderStatus;
	}

	public void setCurrentOrderStatus(String currentOrderStatus) {
		this.currentOrderStatus = currentOrderStatus;
	}

	
}
