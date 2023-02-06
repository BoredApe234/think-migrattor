package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.SubscriptionDefKeyInfo;
import com.mps.think.setup.repo.SubscriptionDefKeyInfoRepo;
import com.mps.think.setup.service.SubscriptionDefKeyInfoService;
import com.mps.think.setup.vo.SubscriptionDefKeyInfoVO;

@Service
public class SubscriptionDefKeyInfoServiceImpl implements SubscriptionDefKeyInfoService {

	@Autowired
	private SubscriptionDefKeyInfoRepo subsRepo;
	
	@Override
	public SubscriptionDefKeyInfo saveSubscriptionDef(SubscriptionDefKeyInfoVO subsDef) {
		ObjectMapper mapper = new ObjectMapper();
		SubscriptionDefKeyInfo subscriptionDef = mapper.convertValue(subsDef, SubscriptionDefKeyInfo.class);
		subsRepo.saveAndFlush(subscriptionDef);
		return subscriptionDef;
	}

	@Override
	public SubscriptionDefKeyInfo updateSubscriptionDef(SubscriptionDefKeyInfoVO subsDef) {
		ObjectMapper mapper = new ObjectMapper();
		SubscriptionDefKeyInfo subscriptionDef = mapper.convertValue(subsDef, SubscriptionDefKeyInfo.class);
		subsRepo.saveAndFlush(subscriptionDef);
		return subscriptionDef;
	}

	@Override
	public SubscriptionDefKeyInfo deleteSubscriptionDef(Integer id) {
		Optional<SubscriptionDefKeyInfo> subs = subsRepo.findById(id);
		if (subs.isPresent()) { subsRepo.delete(subs.get()); return subs.get(); }
		return null;
	}

	@Override
	public List<SubscriptionDefKeyInfo> getSubscriptionDefByPublisherId(Integer id) {
		return subsRepo.findByPublisherId(id);
	}


}
