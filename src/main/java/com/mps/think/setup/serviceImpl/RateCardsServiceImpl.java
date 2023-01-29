package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.mps.think.setup.model.RateCards;

import com.mps.think.setup.repo.RateCardsRepo;
import com.mps.think.setup.service.RateCardsService;
import com.mps.think.setup.vo.RateCardsVO;

@Service
public class RateCardsServiceImpl implements RateCardsService {
	
	@Autowired
	RateCardsRepo rateCardsRepo;

	@Override
	public List<RateCards> findAllRateCards() {
		List<RateCards> rcList = rateCardsRepo.findAll();
		if (rcList.isEmpty()) {
			throw new NotFoundException("No RateCards present, please add RateCards!");
		}
		return rcList;
	}

	@Override
	public RateCardsVO saveRateCards(RateCardsVO rateCards) {
		ObjectMapper mapper = new ObjectMapper();
		RateCards newRateCards = mapper.convertValue(rateCards, RateCards.class);
		if (rateCards.getChildId() == null || rateCards.getChildId().getChildId() == 0) {
			newRateCards.setChildId(null);
		}
		if (rateCards.getSubChildId() == null || rateCards.getSubChildId().getSubChildId() == 0) {
			newRateCards.setSubChildId(null);
		}
		rateCardsRepo.saveAndFlush(newRateCards);
		return rateCards;
	}

	@Override
	public RateCardsVO updateRateCards(RateCardsVO rateCards) {
		ObjectMapper mapper = new ObjectMapper();
		RateCards rateCardsToUpdate = mapper.convertValue(rateCards, RateCards.class);
		if (rateCards.getChildId() == null || rateCards.getChildId().getChildId() == 0) {
			rateCardsToUpdate.setChildId(null);
		}
		if (rateCards.getSubChildId() == null || rateCards.getSubChildId().getSubChildId() == 0) {
			rateCardsToUpdate.setSubChildId(null);
		}
		rateCardsRepo.saveAndFlush(rateCardsToUpdate);
		return rateCards;
	}

	@Override
	public RateCards findbyrcId(Integer rcId) {
		 Optional<RateCards> rc = rateCardsRepo.findById(rcId);
			if(!rc.isPresent()) {
				throw new NotFoundException("RateCards Id : "+ rcId +" does not exist!");
			}
			return rc.get();
	}

	@Override
	public RateCards deleteByrcId(Integer rcId) {
		RateCards delete = findbyrcId(rcId);
		rateCardsRepo.delete(delete);
		return delete;
	}

	@Override
	public List<RateCards> getAllRateCardsByParentID(Integer parentID) throws Exception {
		return rateCardsRepo.findByParentIdParentID(parentID);
	}

	@Override
	public List<RateCards> getAllRateCardsByChildID(Integer childId) throws Exception {
		// TODO Auto-generated method stub
		return rateCardsRepo.findByChildIdChildId(childId);
	}

	@Override
	public List<RateCards> getAllRateCardsBySubChildId(Integer subChildId) throws Exception {
		// TODO Auto-generated method stub
		return rateCardsRepo.findBySubChildIdSubChildId(subChildId);
	}

}
