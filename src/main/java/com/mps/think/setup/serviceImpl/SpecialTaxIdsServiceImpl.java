package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.SpecialTaxIds;
import com.mps.think.setup.repo.SpecialTaxIdsRepo;
import com.mps.think.setup.service.SpecialTaxIdsService;
import com.mps.think.setup.vo.SpecialTaxIdsVO;
@Service
public class SpecialTaxIdsServiceImpl implements SpecialTaxIdsService{
	
	
	@Autowired
    private SpecialTaxIdsRepo specialTaxIdsRepo;


	@Override
	public List<SpecialTaxIds> findAllSpecialTaxIds() {
		// TODO Auto-generated method stub
		return specialTaxIdsRepo.findAll();
	}

	@Override
	public SpecialTaxIdsVO saveSpecialTaxIds(SpecialTaxIdsVO specialTaxIds) {
		SpecialTaxIds stxid=new SpecialTaxIds();
		stxid.setId(specialTaxIds.getId());
		stxid.setSpecialTaxIds(specialTaxIds.getSpecialTaxIds());
		stxid.setExemptStatus(specialTaxIds.getExemptStatus());
		stxid.setPubId(specialTaxIds.getPubId());
		specialTaxIdsRepo.saveAndFlush(stxid);
		// TODO Auto-generated method stub
		return specialTaxIds;
	}

	@Override
	public SpecialTaxIdsVO updateSpecialTaxIds(SpecialTaxIdsVO specialTaxIds) {
		for (SpecialTaxIds curr : specialTaxIdsRepo.findAll()) {
			if (curr.getId().equals(specialTaxIds.getId())) {
				curr.setSpecialTaxIds(specialTaxIds.getSpecialTaxIds());
				curr.setExemptStatus(specialTaxIds.getExemptStatus());
				curr.setPubId(specialTaxIds.getPubId());
				specialTaxIdsRepo.saveAndFlush(curr);
				return specialTaxIds;
			}
			}
		return null;
	}

	@Override
	public SpecialTaxIds findbySpecialTaxIdsId(Integer SpecialTaxIdsId) {
		for (SpecialTaxIds curr : specialTaxIdsRepo.findAll()) {
			if (curr.getId().equals(SpecialTaxIdsId)) {
				return curr;
			}
		}
		return null;
	}

	@Override
	public SpecialTaxIds deleteBySpecialTaxIdsId(Integer id) {
		SpecialTaxIds delete = findbySpecialTaxIdsId(id);
		specialTaxIdsRepo.delete(delete);
		return delete;
	}

	@Override
	public List<SpecialTaxIds> findAllSpecialTaxIdsForPublisher(Integer pubId) {
		return specialTaxIdsRepo.findByPubIdId(pubId);
	}

	@Override
	public List<SpecialTaxIds> getAllSpecialTaxIds() {
		return specialTaxIdsRepo.findAll();
	}

}
