<<<<<<< HEAD
package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.OrderThresholdInfo;
import com.mps.think.setup.vo.OrderThresholdInfoVO;

public interface OrderThresholdInfoService {
	
	public List<OrderThresholdInfo> findAllorderThresholdByPubId(Integer pubId);
	
	public List<OrderThresholdInfo> saveorderThresholdInfo(List<OrderThresholdInfoVO> orderThresholdInfoVO);
	
	public OrderThresholdInfo findbyOrderId(Integer orderId);

	public List<OrderThresholdInfo> getAllOrderThresholdInfo();

}
=======
package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.OrderThresholdInfo;
import com.mps.think.setup.vo.OrderThresholdInfoVO;

public interface OrderThresholdInfoService {
	
	public List<OrderThresholdInfo> findAllorderThresholdByPubId(Integer pubId);
	
	public List<OrderThresholdInfo> saveorderThresholdInfo(List<OrderThresholdInfoVO> orderThresholdInfoVO);
	
	public OrderThresholdInfo findbyOrderId(Integer orderId);

	public List<OrderThresholdInfo> getAllOrderThresholdInfo();

}
>>>>>>> 8248e4c1bbded89ffa1324e4e365965e59b22c19
