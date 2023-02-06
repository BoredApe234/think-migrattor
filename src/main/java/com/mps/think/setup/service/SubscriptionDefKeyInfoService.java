package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SubscriptionDefKeyInfo;
import com.mps.think.setup.vo.SubscriptionDefKeyInfoVO;

public interface SubscriptionDefKeyInfoService {

	public SubscriptionDefKeyInfo saveSubscriptionDef(SubscriptionDefKeyInfoVO subsDef);
	
	public SubscriptionDefKeyInfo updateSubscriptionDef(SubscriptionDefKeyInfoVO subsDef);

	public SubscriptionDefKeyInfo deleteSubscriptionDef(Integer id);
	
	public List<SubscriptionDefKeyInfo> getSubscriptionDefByPublisherId(Integer id);
	
	public List<SubscriptionDefKeyInfo> getSubscriptionDefByParentId(Integer id);
	
	public List<SubscriptionDefKeyInfo> getSubscriptionDefByChildId(Integer id);
	
	public List<SubscriptionDefKeyInfo> getSubscriptionDefBySubChildId(Integer id);
	
}
