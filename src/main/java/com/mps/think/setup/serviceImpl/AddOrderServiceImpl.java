package com.mps.think.setup.serviceImpl;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.MultiLineItemOrder;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrderCodesSuper;
import com.mps.think.setup.model.PaymentBreakdown;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.MultiLineItemOrderRepo;
import com.mps.think.setup.service.AddOrderService;
import com.mps.think.setup.vo.EnumModelVO.OrderStatus;
import com.mps.think.setup.vo.OrderVO;

@Service
public class AddOrderServiceImpl implements AddOrderService {

	@Autowired
	private AddOrderRepo addOrderRepo;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Autowired
	private MultiLineItemOrderRepo multiLineOrderRepo;

	@Override
	public Order saveOrder(OrderVO order) throws Exception {
		Order newOrder = mapper.convertValue(order, Order.class);
		if (order.getOtherAddressCustomer().getCustomerId() == 0) newOrder.setOtherAddressCustomer(null);
		Order createdOrder = addOrderRepo.saveAndFlush(newOrder);
		MultiLineItemOrder orderSibling = multiLineOrderRepo.findByOrderOrderId(createdOrder.getOrderId());
		if (order.getParentOrder().getParentOrderId() == 0) {
			orderSibling.setParentOrderId(createdOrder.getOrderId());
			multiLineOrderRepo.saveAndFlush(orderSibling);
		} else {
			MultiLineItemOrder mainParent = multiLineOrderRepo.findByOrderOrderId(order.getParentOrder().getParentOrderId());
			orderSibling.setParentOrderId(mainParent.getParentOrderId());
			multiLineOrderRepo.saveAndFlush(orderSibling);
		}
		return createdOrder;
	}

	@Override
	public Page<Order> getAllOrders(Pageable page) throws Exception {
		return addOrderRepo.findAll(page);
	}

	@Override
	public Order getOrderById(Integer orderId) throws Exception {
		return addOrderRepo.findById(orderId).get();
	}

	@Override
	public Page<Order> getAllOrderByCustomerId(Integer customerId, Pageable page) throws Exception {
//		return addOrderRepo.findAllByCustomerId(customerId);
		return addOrderRepo.findByCustomerIdCustomerId(customerId, page);
	}

	@Override
	public Order updateOrder(Order order) throws Exception {
//		ObjectMapper mapper = new ObjectMapper();
		Order updateOrder = mapper.convertValue(order, Order.class);
		if (order.getOtherAddressCustomer().getCustomerId() == 0) updateOrder.setOtherAddressCustomer(null);	
		Integer parentOrderId = order.getParentOrder().getParentOrderId();
		MultiLineItemOrder currentParent = multiLineOrderRepo.findByOrderOrderId(order.getOrderId());
		if (parentOrderId <= 0 || currentParent.getParentOrderId().equals(currentParent.getOrder().getOrderId())) {
			updateOrder.setParentOrder(currentParent);
		} else {
			currentParent.setParentOrderId(parentOrderId);
			updateOrder.setParentOrder(currentParent);
		}
		updateOrder.setParentOrder(multiLineOrderRepo.findByOrderOrderId(order.getOrderId()));
		return addOrderRepo.saveAndFlush(updateOrder);
	}

	@Override
	public List<Order> getAllOrdersByOrderClassId(Integer ocId) throws Exception {
		return addOrderRepo.findByOrderClassOcId(ocId);
	}

	@Override
	public Page<Order> getSearchedOrders(Integer pubId, Integer customerId, String keyword, Pageable page) {
		return addOrderRepo.findOrdersBySearch(pubId.equals(0) ? null : pubId, customerId, keyword, page);
	}

	@Override
	public List<OrderCodesSuper> getRecentTwoOrderOfCustomer(Integer customerId) throws Exception {		
		return addOrderRepo.fetchRecentTwoOrderByCustomerId(customerId).stream().map(o -> o.getKeyOrderInformation().getOrderCode()).collect(Collectors.toList());
	}

	@Override
	public Page<Order> getAllorderForPublisher(Pageable page,Integer pubId) throws Exception {
		return addOrderRepo.findAllByCustomerIdPublisherId(page,pubId);
	}

	@Override
	public void setAllOrdersOfCustomerInActive(Integer customerId) {
		List<Order> orders = addOrderRepo.findByCustomerIdCustomerId(customerId);
		orders.forEach(o -> {
			o.setOrderStatus(OrderStatus.Cancelled);
		});
		addOrderRepo.saveAllAndFlush(orders);
	}

	public List<Order> getOrdersById(Integer id) {
		MultiLineItemOrder order = multiLineOrderRepo.findByOrderOrderId(id);
		return multiLineOrderRepo.findByParentOrderId(order.getParentOrderId()).stream().map(o -> o.getOrder()).collect(Collectors.toList());
	}

	@Override
	public Order getSubOrderById(Integer id) {
		Optional<Order> order = addOrderRepo.findById(id);
		if (order.isPresent()) return order.get();
		return null;
	}

	@Override
	public List<Order> getAllOrderByCustomerIdAndOrderId(Integer customerId, Integer orderId) throws Exception {
		return addOrderRepo.fetchOrdersForPaymentsByCustomerIdPrioGivenOrderId(customerId, orderId);
	}

	@Override
	public List<Order> updateOrderPaymentStatus(LinkedHashMap<String, String> OrderPaymentStatus) {
	    List<Order> updatedOrders = new ArrayList<>();
	    
	    for (Map.Entry<String, String> entry : OrderPaymentStatus.entrySet()) {
	    	String orderId = entry.getKey();
	        String paymentStatus = entry.getValue();

	        Order order = addOrderRepo.findById(Integer.valueOf(orderId)).orElse(null);
	        
	        if (order != null) {
	            PaymentBreakdown paymentBreakdown = order.getPaymentBreakdown();
	            paymentBreakdown.setPaymentStatus(paymentStatus);
	            
	            Order updatedOrder = addOrderRepo.save(order);
	            updatedOrders.add(updatedOrder);
	        }
	    }
	    
	    return updatedOrders;
	}
//	public List<Order> updateOrderPaymentStatus(LinkedHashMap<String, String> OrderPaymentStatus) {
//	    List<Order> updatedOrders = new ArrayList<>();
//	    
//	    for (Map.Entry<String, String> entry : OrderPaymentStatus.entrySet()) {
//	        String orderId = entry.getKey();
//	        String paymentStatus = entry.getValue();
//
//	        try {
//	            int orderIdInt = Integer.parseInt(orderId);
//	            Order order = addOrderRepo.findById(orderIdInt).orElse(null);
//
//	            if (order != null) {
//	                PaymentBreakdown paymentBreakdown = order.getPaymentBreakdown();
//	                paymentBreakdown.setPaymentStatus(paymentStatus);
//
//	                Order updatedOrder = addOrderRepo.save(order);
//	                updatedOrders.add(updatedOrder);
//	            }
//	        } catch (NumberFormatException e) {
//	            // Handle the case where the orderId cannot be parsed to an integer
//	            // You can log an error, throw an exception, or perform appropriate error handling
//	            // For now, we skip the current iteration of the loop
//	            continue;
//	        }
//	    }
//	    
//	    return updatedOrders;
//	}
}
