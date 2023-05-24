package com.mps.think.setup.serviceImpl;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrdersToBeSuspended;
import com.mps.think.setup.model.SuspendOrder;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.OrdersToBeSuspendedRepo;
import com.mps.think.setup.repo.SuspendOrderRepo;
import com.mps.think.setup.service.SuspendOrderService;
import com.mps.think.setup.vo.EnumModelVO.OrderStatus;
import com.mps.think.setup.vo.OrderCompactView;
import com.mps.think.setup.vo.OrderSuspendView;
import com.mps.think.setup.vo.SuspendOrderVO;

@Service
public class SuspendOrderServiceImpl implements SuspendOrderService {

	@Autowired
	private SuspendOrderRepo suspendOrderRepo;

	@Autowired
	private ObjectMapper mapper;

	@Autowired
	private OrdersToBeSuspendedRepo ordersToBeSuspendedRepo;

	@Autowired
	private AddOrderRepo orderRepo;

	@Override
	public SuspendOrder saveSuspendOrdersDetail(SuspendOrderVO suspendOrdersDetail) {
		SuspendOrder suspendOrders = mapper.convertValue(suspendOrdersDetail, SuspendOrder.class);
		suspendOrders.getOrdersToSuspend().forEach(o -> {
			o.setIsReinstated(false);
			o.setIsSuspended(false);
		});
		SuspendOrder susDet = suspendOrderRepo.saveAndFlush(suspendOrders);
		susDet.getOrdersToSuspend().forEach(o -> checkOrdersToSuspend(o.getOrder().getOrderId(), o.getSuspendOrder().getId()));
		return susDet;
	}

	// will have to put this in scheduler
	void checkOrdersToSuspend(Integer orderId, Integer suspensionId) {
		LocalDate currentDate = LocalDate.now(Clock.systemDefaultZone());
		List<Object[]> nonSuspendedOrders = ordersToBeSuspendedRepo.findAllNonSuspendedAndNonReinstatedOrders(orderId, suspensionId);
		for (Object[] o : nonSuspendedOrders) {
			Order order = (Order)o[0];
			SuspendOrder suspendDetails = (SuspendOrder)o[1];
			LocalDate suspensionStartFrom = suspendDetails.getSuspendedfrom().toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
			if (currentDate.isBefore(suspensionStartFrom))
				continue;
			suspendOrContinueOrder(order, suspendDetails.getSetOrderStatus());
			OrdersToBeSuspended ordersToBeSuspendedForGivenOrderAndSuspendDetails = ordersToBeSuspendedRepo
					.getOrdersToBeSuspendedForGivenOrderAndSuspendDetails(order.getOrderId(), suspendDetails.getId());
			ordersToBeSuspendedForGivenOrderAndSuspendDetails.setIsSuspended(true);
			ordersToBeSuspendedRepo.saveAndFlush(ordersToBeSuspendedForGivenOrderAndSuspendDetails);
		}
	}

	private void suspendOrContinueOrder(Order order, OrderStatus setOrderStatus) {
		order.setOrderStatus(setOrderStatus);
		orderRepo.saveAndFlush(order);
	}

	// goes into scheduler
	void checkOrdersToContinue() {
		LocalDate currentDate = LocalDate.now(Clock.systemDefaultZone());
		List<Object[]> allSuspendedOrders = ordersToBeSuspendedRepo.findAllSuspendedAndNonReinstatedOrders();
		for (Object[] o : allSuspendedOrders) {
			Order order = (Order)o[0];
			SuspendOrder suspendDetails = (SuspendOrder)o[1];
			LocalDate suspendedTill = suspendDetails.getSuspendedTo().toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
			if (currentDate.isBefore(suspendedTill)
					|| order.getOrderStatus().equals(OrderStatus.SUSPEND_NON_PAY))
				continue;
			suspendOrContinueOrder(order, OrderStatus.Active);
			OrdersToBeSuspended ordersToBeSuspendedForGivenOrderAndSuspendDetails = ordersToBeSuspendedRepo
					.getOrdersToBeSuspendedForGivenOrderAndSuspendDetails(order.getOrderId(), suspendDetails.getId());
			ordersToBeSuspendedForGivenOrderAndSuspendDetails.setIsReinstated(true);
			ordersToBeSuspendedRepo.saveAndFlush(ordersToBeSuspendedForGivenOrderAndSuspendDetails);
		}
	}

	@Override
	public Page<OrderSuspendView> findOrdersByIdWithSuspensionDetails(Integer orderId, Pageable page) {
		Integer parentOrderId = orderRepo.findById(orderId).get().getParentOrder().getParentOrderId();
		Page<Object[]> orderIdAndSuspendDetId = suspendOrderRepo.findAllOrdersByIdWithSuspensionDet(parentOrderId, page);
		List<OrderSuspendView> output = new ArrayList<>();
		for (Object[] o : orderIdAndSuspendDetId) {
			Order order = orderRepo.findById((int)o[0]).get();
			OrderCompactView ocv = new OrderCompactView();
			ocv.setOrderId(order.getOrderId());
			ocv.setParentOrderId(order.getParentOrder().getParentOrderId());
			ocv.setCurrentOrderStatus(order.getOrderStatus());
			ocv.setOrderCode(order.getKeyOrderInformation().getOrderCode().getOrderCodes().getOrderCode());
			ocv.setPayment(order.getPaymentBreakdown());
			ocv.setStartDate(order.getOrderItemsAndTerms().getValidFrom());
			ocv.setEndDate(order.getOrderItemsAndTerms().getValidTo());
			SuspendOrder suspendOrder = o[1] == null ? null : suspendOrderRepo.findById((int)o[1]).get();
			if(suspendOrder != null) suspendOrder.setOrdersToSuspend(null);
			output.add(new OrderSuspendView(ocv, suspendOrder));
		}
		return new PageImpl<>(output, orderIdAndSuspendDetId.getPageable(), orderIdAndSuspendDetId.getTotalElements());
	}


}
