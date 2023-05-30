package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.LabelLayout;
import com.mps.think.setup.repo.LabelLayoutRepo;
import com.mps.think.setup.service.LabelLayoutService;
import com.mps.think.setup.vo.LabelLayoutVO;

@Service
public class LabelLayoutServiceImpl implements LabelLayoutService{
	
	@Autowired
	private LabelLayoutRepo labelLayoutRepo;
	
	@Autowired
	private ObjectMapper mapper;

	@Override
	public List<LabelLayout> getAllLabelLayout() {
		return labelLayoutRepo.findAll();
	}

	@Override
	public LabelLayout saveLabelLayout(LabelLayoutVO labelLayout) {
		return labelLayoutRepo.saveAndFlush(mapper.convertValue(labelLayout, LabelLayout.class));
	}

	@Override
	public LabelLayout updateLabelLayout(LabelLayoutVO labelLayout) {
		return labelLayoutRepo.saveAndFlush(mapper.convertValue(labelLayout, LabelLayout.class));
	}

	@Override
	public LabelLayout findbyLabelLayoutId(Integer id) {
		return labelLayoutRepo.findById(id).get();
	}

	@Override
	public LabelLayout deleteByLabelLayoutId(Integer id) {
		LabelLayout delete = findbyLabelLayoutId(id);
		labelLayoutRepo.delete(delete);
		return delete;
	}

	@Override
	public List<LabelLayout> findAllLabelLayoutForPublisher(Integer pubId) {
		return labelLayoutRepo.findByPubIdId(pubId);
	}

}
