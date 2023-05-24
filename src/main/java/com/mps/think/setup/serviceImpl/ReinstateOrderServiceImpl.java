package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.exception.OrdersNotReinsatedException;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrdersReinstated;
import com.mps.think.setup.model.OrdersToBeSuspended;
import com.mps.think.setup.model.ReinstateOrder;
import com.mps.think.setup.model.SuspendOrder;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.OrdersToBeSuspendedRepo;
import com.mps.think.setup.repo.ReinstateOrderRepo;
import com.mps.think.setup.repo.SuspendOrderRepo;
import com.mps.think.setup.service.ReinstateOrderService;
import com.mps.think.setup.vo.EnumModelVO.OrderStatus;
import com.mps.think.setup.vo.OrderSuspendView;
import com.mps.think.setup.vo.ReinstateOrderVO;

@Service
public class ReinstateOrderServiceImpl implements ReinstateOrderService {

	@Autowired
	ObjectMapper mapper;
	
	@Autowired
	OrdersToBeSuspendedRepo suspendedOrdersRepo;
	
	@Autowired
	ReinstateOrderRepo reinstateOrderRepo;
	
	@Autowired
	AddOrderRepo orderRepo;
	
	@Autowired
	SuspendOrderRepo suspendDetRepo;

	@Override
	public ReinstateOrder saveReinstateOrderDetailsAndReinstateOrders(ReinstateOrderVO reinstateOrder) {
		ReinstateOrder ordersToReinstate = mapper.convertValue(reinstateOrder, ReinstateOrder.class);
		boolean gotReinstated = reinstate(ordersToReinstate);
		if (!gotReinstated) {
			throw new OrdersNotReinsatedException("orders with ids: " + ordersToReinstate.getOrdersToReinstate().stream()
					.map(o -> o.getOrder().getOrderId()).collect(Collectors.toList()) + " didn't get reinstated...");
		}
		return reinstateOrderRepo.saveAndFlush(ordersToReinstate);
	}

	private boolean reinstate(ReinstateOrder ordersToReinstate) {
		try {
			List<OrdersReinstated> reinstateOrders = ordersToReinstate.getOrdersToReinstate();
			for (OrdersReinstated o : reinstateOrders) {
				Order order = o.getOrder();
				SuspendOrder suspendOrder = o.getSuspendOrder();
				OrdersToBeSuspended ordersToBeSuspendedForGivenOrderAndSuspendDetails = suspendedOrdersRepo.getOrdersToBeSuspendedForGivenOrderAndSuspendDetails(order.getOrderId(), suspendOrder.getId());
				ordersToBeSuspendedForGivenOrderAndSuspendDetails.setIsReinstated(true);
				suspendedOrdersRepo.saveAndFlush(ordersToBeSuspendedForGivenOrderAndSuspendDetails);
				List<OrdersToBeSuspended> previousSuspensionDetailsOfOrder = suspendedOrdersRepo.findPreviousSuspensionDetailsOfOrder(order.getOrderId());
				if (!previousSuspensionDetailsOfOrder.isEmpty()) {
					order.setOrderStatus(previousSuspensionDetailsOfOrder.get(0).getSuspendOrder().getSetOrderStatus());
				} else {
					order.setOrderStatus(OrderStatus.Active);
				}
				orderRepo.saveAndFlush(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Page<OrderSuspendView> getAllOrdersToReinstateByOrderId(Integer orderId, Pageable page) {
		Integer parentOrderId = orderRepo.findById(orderId).get().getParentOrder().getParentOrderId();
		Page<Object[]> ordersToReinstateForOrderId = suspendedOrdersRepo.findOrdersToReinstateForOrderId(parentOrderId, page);
		List<OrderSuspendView> output = new ArrayList<>();
		for (Object[] o : ordersToReinstateForOrderId) {
			Order order = orderRepo.findById((int)o[0]).get();
			SuspendOrder so = suspendDetRepo.findById((int)o[1]).get();
			order.setParentOrder(null);
			order.setOrderAddresses(null);
			so.setOrdersToSuspend(null);
			output.add(new OrderSuspendView(order, so));
		}
		return new PageImpl<>(output, ordersToReinstateForOrderId.getPageable(), ordersToReinstateForOrderId.getTotalElements());
	}

}
