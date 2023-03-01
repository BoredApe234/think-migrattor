package com.mps.think.setup.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.CancelOrder;
import com.mps.think.setup.repo.CancelOrderRepo;
import com.mps.think.setup.service.CancelOrderService;
import com.mps.think.setup.vo.CancelOrderVO;

@Service
public class CancelOrderServiceImpl implements CancelOrderService {
	
	@Autowired
	private CancelOrderRepo cancelOrderRepo;

	@Override
	public CancelOrderVO saveCancelOrder(CancelOrderVO cancelOrder) {
		ObjectMapper mapper = new ObjectMapper();
		CancelOrder newCancelOrder = mapper.convertValue(cancelOrder, CancelOrder.class);
		CancelOrder data=cancelOrderRepo.saveAndFlush(newCancelOrder);
		newCancelOrder.setCancelorderId(data.getCancelorderId());
		return cancelOrder;
	}

}
