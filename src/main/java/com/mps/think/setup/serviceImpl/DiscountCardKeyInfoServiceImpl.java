package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.DiscountCardKeyInfo;
import com.mps.think.setup.repo.DiscountCardKeyInfoRepo;
import com.mps.think.setup.service.DiscountCardKeyInfoService;
import com.mps.think.setup.service.EffectiveDatesForDiscountService;
import com.mps.think.setup.vo.DiscountCardKeyInfoVO;

@Service
public class DiscountCardKeyInfoServiceImpl implements DiscountCardKeyInfoService {

	@Autowired
	private DiscountCardKeyInfoRepo discountCardKeyInfoRepo;
	
	@Autowired
	private EffectiveDatesForDiscountService effectiveDateService;
	
	@Override
	public DiscountCardKeyInfo saveDiscountCard(DiscountCardKeyInfoVO discountCard) {
		ObjectMapper mapper = new ObjectMapper();
		return discountCardKeyInfoRepo.saveAndFlush(mapper.convertValue(discountCard, DiscountCardKeyInfo.class));
	}

	@Override
	public DiscountCardKeyInfo updateDiscountCard(DiscountCardKeyInfo discountCard) {
		ObjectMapper mapper = new ObjectMapper();
		return discountCardKeyInfoRepo.saveAndFlush(mapper.convertValue(discountCard, DiscountCardKeyInfo.class));
	}

	@Override
	public DiscountCardKeyInfo deleteDiscountCardById(Integer discountCardId) {
		Optional<DiscountCardKeyInfo> discountCard = discountCardKeyInfoRepo.findById(discountCardId);
		if (discountCard.isPresent()) {
			effectiveDateService.deleteEffectiveDatesForDiscountCard(discountCardId);
			discountCardKeyInfoRepo.delete(discountCard.get());
			return discountCard.get();
		}
		return null;
	}

	@Override
	public List<DiscountCardKeyInfo> getDiscountCardKeyInfosForOrderClass(Integer ocId) {
		return discountCardKeyInfoRepo.findByOrderClassOcId(ocId);
	}

	@Override
	public List<DiscountCardKeyInfo> getAllDiscountCards() {
		return discountCardKeyInfoRepo.findAll();
	}

	@Override
	public DiscountCardKeyInfo getDiscountCardKeyInfoById(Integer id) {
		Optional<DiscountCardKeyInfo> discCard = discountCardKeyInfoRepo.findById(id);
		if(discCard.isPresent()) return discCard.get();
		return null;
	}

	@Override
	public List<DiscountCardKeyInfo> findAllDiscountCardKeyInfoByPublisherId(Integer pubId) {
		return discountCardKeyInfoRepo.findByOrderClassPubIdId(pubId);
	}

	@Override
	public List<DiscountCardKeyInfo> getAllDiscountCardKeyInfo() {
		return discountCardKeyInfoRepo.findAll();
	}

}
