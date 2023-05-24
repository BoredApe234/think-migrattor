package com.mps.think.setup.serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.exception.OrdersNotSuspended;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrdersToBeSuspended;
import com.mps.think.setup.model.SuspendOrder;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.SuspendOrderRepo;
import com.mps.think.setup.service.SuspendOrderService;
import com.mps.think.setup.vo.EnumModelVO.OrderStatus;
import com.mps.think.setup.vo.SuspendOrderVO;

@Service
public class SuspendOrderServiceImpl implements SuspendOrderService {

	@Autowired
	ObjectMapper mapper;

	@Autowired
	SuspendOrderRepo suspendOrderRepo;

	@Autowired
	AddOrderRepo orderRepo;

	@Autowired
	Date date;

	@Autowired
	SimpleDateFormat sdf;

	@Override
	public SuspendOrder saveSuspendOrderDetails(SuspendOrderVO suspendOrders) throws OrdersNotSuspended, ParseException {
		SuspendOrder suspendOrdersDet = mapper.convertValue(suspendOrders, SuspendOrder.class);
		suspendOrdersDet.setIsSuspended(false);
		SuspendOrder savedSuspension = suspendOrderRepo.saveAndFlush(suspendOrdersDet);
		checkOrdersToSuspend();
		return savedSuspension;
	}

	boolean suspendOrders(List<OrdersToBeSuspended> ordersToSuspend, OrderStatus statusToSet) {
		try {
			List<Order> orders = ordersToSuspend.stream().map(o -> o.getOrder()).collect(Collectors.toList());
			orders.forEach(o -> o.setOrderStatus(statusToSet));
			orderRepo.saveAllAndFlush(orders);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	boolean continueOrders(List<OrdersToBeSuspended> ordersToContinue) {
		try {
			List<Order> orders = ordersToContinue.stream().map(o -> o.getOrder()).collect(Collectors.toList());
			orders.forEach(o -> o.setOrderStatus(OrderStatus.Active));
			orderRepo.saveAllAndFlush(orders);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void checkOrdersToSuspend() throws ParseException, OrdersNotSuspended {
		Date currentDate = sdf.parse(sdf.format(date));
		List<SuspendOrder> allNonSuspendedOrders = suspendOrderRepo.getAllNonSuspendedOrders(currentDate);
		for (SuspendOrder nonSuspendedOrderDet : allNonSuspendedOrders) {
			boolean gotSuspended = suspendOrders(nonSuspendedOrderDet.getOrdersToSuspend(), nonSuspendedOrderDet.getSetOrderStatus());
			if (gotSuspended) {
				nonSuspendedOrderDet.setIsSuspended(true);
				suspendOrderRepo.saveAndFlush(nonSuspendedOrderDet);
			} else {
				throw new OrdersNotSuspended("orders with ids: " + nonSuspendedOrderDet.getOrdersToSuspend().stream().map(o -> 
				o.getOrder().getOrderId()).collect(Collectors.toList()) + " did not get suspended");
			}
		}
	}

	@Override
	public void checkOrdersToContinue() throws ParseException, OrdersNotSuspended {
		Date currentDate = sdf.parse(sdf.format(date));
		List<SuspendOrder> ordersToContinue = suspendOrderRepo.getAllOrdersToContinue(currentDate);
		for (SuspendOrder suspendedOrdersDet : ordersToContinue) {
			boolean continued = continueOrders(suspendedOrdersDet.getOrdersToSuspend());
			if (continued) {
				suspendedOrdersDet.setIsSuspended(false);
				suspendOrderRepo.saveAndFlush(suspendedOrdersDet);
			} else {
				throw new OrdersNotSuspended("orders with ids: " + suspendedOrdersDet.getOrdersToSuspend().stream().map(o -> 
				o.getOrder().getOrderId()).collect(Collectors.toList()) + " did not get activated");
			}
		}
	}

	@Override
	public List<OrdersToBeSuspended> getAllOrdersToBeSuspended() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SuspendOrder> getAllSuspendOrder() {
		return suspendOrderRepo.findAll();
	}

}
