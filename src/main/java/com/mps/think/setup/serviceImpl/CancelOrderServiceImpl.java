package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.CancelOrder;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.CancelOrderRepo;
import com.mps.think.setup.service.CancelOrderService;
import com.mps.think.setup.vo.CancelOrderVO;
import com.mps.think.setup.vo.EnumModelVO.OrderStatus;

@Service
public class CancelOrderServiceImpl implements CancelOrderService {
	
	@Autowired
	private CancelOrderRepo cancelOrderRepo;
	
	@Autowired
	private AddOrderRepo orderRepo;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Override
	public List<CancelOrder> getAllCancelOrder() {
		return cancelOrderRepo.findAll();
	}

	@Override
	public CancelOrder saveCancelOrder(CancelOrderVO cancelOrder) {
		CancelOrder cod = cancelOrderRepo.saveAndFlush(mapper.convertValue(cancelOrder, CancelOrder.class));
		Order order = cod.getOrderid();
//		if (cancelOrder.getCancelReasonsId().getCancelReason())
		order.setOrderStatus(OrderStatus.cancel_customer_request.getDisplayName());
		orderRepo.saveAndFlush(order);
		return cod;
	}
	
	@Override
	public CancelOrder updateCancelOrder(CancelOrderVO cancelOrder) {
		return cancelOrderRepo.saveAndFlush(mapper.convertValue(cancelOrder, CancelOrder.class));
	}
	
	@Override
	public CancelOrder findbyCancelOrderId(Integer cancelOrder) {
		 Optional<CancelOrder> cr = cancelOrderRepo.findById(cancelOrder);
			return cr.get();
	}
	
	@Override
	public List<CancelOrder> getAllCancelOrderByCancelorderId(Integer cancelOrder) {
		return cancelOrderRepo.findByOrderidOrderId(cancelOrder);
	}

}
