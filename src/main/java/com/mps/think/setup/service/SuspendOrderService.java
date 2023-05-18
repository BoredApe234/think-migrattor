package com.mps.think.setup.service;

import java.text.ParseException;

import com.mps.think.setup.exception.OrdersNotSuspended;
import com.mps.think.setup.model.SuspendOrder;
import com.mps.think.setup.vo.SuspendOrderVO;

public interface SuspendOrderService {

	SuspendOrder saveSuspendOrderDetails(SuspendOrderVO suspendOrders);
	
	void checkOrdersToSuspend() throws ParseException, OrdersNotSuspended;
	
	void checkOrdersToContinue() throws ParseException, OrdersNotSuspended;
	
}
