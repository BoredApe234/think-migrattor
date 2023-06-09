package com.mps.think.setup.vo;

import java.util.Date;
import java.util.List;

import com.mps.think.setup.vo.EnumModelVO.OrderStatus;

public class SuspendOrderVO {

	private Integer id;
	
	private String currentOrderStatus;

	private String setOrderStatus;

	private String reasonForSuspension;

	private Date suspendedfrom;

	private Date suspendedTo;

	private String notes;
	
	private List<OrdersToBeSuspendedVO> ordersToSuspend;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReasonForSuspension() {
		return reasonForSuspension;
	}

	public void setReasonForSuspension(String reasonForSuspension) {
		this.reasonForSuspension = reasonForSuspension;
	}

	public Date getSuspendedfrom() {
		return suspendedfrom;
	}

	public void setSuspendedfrom(Date suspendedfrom) {
		this.suspendedfrom = suspendedfrom;
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

	public List<OrdersToBeSuspendedVO> getOrdersToSuspend() {
		return ordersToSuspend;
	}

	public void setOrdersToSuspend(List<OrdersToBeSuspendedVO> ordersToSuspend) {
		this.ordersToSuspend = ordersToSuspend;
	}

	public String getCurrentOrderStatus() {
		return currentOrderStatus;
	}

	public void setCurrentOrderStatus(String currentOrderStatus) {
		this.currentOrderStatus = currentOrderStatus;
	}

	public String getSetOrderStatus() {
		return setOrderStatus;
	}

	public void setSetOrderStatus(String setOrderStatus) {
		this.setOrderStatus = setOrderStatus;
	}

}
