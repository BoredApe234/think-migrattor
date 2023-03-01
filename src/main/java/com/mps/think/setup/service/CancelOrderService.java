package com.mps.think.setup.service;

import org.springframework.stereotype.Service;
import com.mps.think.setup.vo.CancelOrderVO;

@Service
public interface CancelOrderService {
	
	public CancelOrderVO saveCancelOrder(CancelOrderVO cancelOrder);

}
