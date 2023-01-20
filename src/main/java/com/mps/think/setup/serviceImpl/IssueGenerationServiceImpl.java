package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.IssueGeneration;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.OrderCodes;
import com.mps.think.setup.repo.IssueGenerationRepo;
import com.mps.think.setup.service.IssueGenerationService;
import com.mps.think.setup.vo.IssueGenerationVo;

@Service

public class IssueGenerationServiceImpl implements IssueGenerationService {

	@Autowired
	IssueGenerationRepo issueGenerationRepo;

	@Override
	public List<IssueGeneration> findAllIssueGenerationVo() {
		return issueGenerationRepo.findAll();
	}

	@Override
	public IssueGenerationVo saveIssueGenerationVo(IssueGenerationVo issueGeneration) {
		IssueGeneration issue = new IssueGeneration();

		issue.setActive(issueGeneration.getActive());
		issue.setDiscountCard(issueGeneration.getDiscountCard());
		issue.setFrequencyOfGeneration(issueGeneration.getFrequencyOfGeneration());
		issue.setIssue_volume(issue.getIssue_volume());
		issue.setIssueCaption(issueGeneration.getIssueCaption());
		issue.setIssueFormat(issueGeneration.getIssueFormat());
		issue.setIssuesAppearonEvery(issueGeneration.getIssuesAppearonEvery());
		issue.setNumberOfIssue(issueGeneration.getNumberOfIssue());
		issue.setIssueDate(issueGeneration.getIssueDate());
		issue.setDateoftheMonthYear(issueGeneration.getDateoftheMonthYear());
		// OrderCodes id added
		OrderCodes ocode = new OrderCodes();
		ocode.setId(issueGeneration.getOderCodeVo().getId());
		issue.setOderCode(ocode);
		/// oderclass id
		OrderClass oc = new OrderClass();
		oc.setOcId(issueGeneration.getOrderClassId().getOcId());
		issue.setOrderClassId(oc);
		issue.setOrderType(issueGeneration.getOrderType());
		issue.setPeriodicity(issueGeneration.getPeriodicity());
		issue.setRateCard(issueGeneration.getRateCard());
		issue.setVolumeCaption(issueGeneration.getVolumeCaption());
		issue.setVolumeFormat(issueGeneration.getVolumeFormat());
		issue = issueGenerationRepo.save(issue);
		issueGeneration.setId(issue.getId());
		return issueGeneration;
	}

	@Override
	public IssueGenerationVo updateIssueGenerationVo(IssueGenerationVo issueGeneration) {
		IssueGeneration issue = new IssueGeneration();
		issue.setId(issueGeneration.getId());
		issue.setActive(issueGeneration.getActive());
		issue.setDiscountCard(issueGeneration.getDiscountCard());
		issue.setFrequencyOfGeneration(issueGeneration.getFrequencyOfGeneration());
		issue.setIssue_volume(issue.getIssue_volume());
		issue.setIssueCaption(issueGeneration.getIssueCaption());
		issue.setIssueFormat(issueGeneration.getIssueFormat());
		issue.setIssuesAppearonEvery(issueGeneration.getIssuesAppearonEvery());
		issue.setNumberOfIssue(issueGeneration.getNumberOfIssue());
		issue.setIssueDate(issueGeneration.getIssueDate());
		issue.setDateoftheMonthYear(issueGeneration.getDateoftheMonthYear());
		// OrderCodes id added
		OrderCodes ocode = new OrderCodes();
		ocode.setId(issueGeneration.getOderCodeVo().getId());
		issue.setOderCode(ocode);
		/// oderclass id
		OrderClass oc = new OrderClass();
		oc.setOcId(issueGeneration.getOrderClassId().getOcId());
		issue.setOrderClassId(oc);
		issue.setOrderType(issueGeneration.getOrderType());
		issue.setPeriodicity(issueGeneration.getPeriodicity());
		issue.setRateCard(issueGeneration.getRateCard());
		issue.setVolumeCaption(issueGeneration.getVolumeCaption());
		issue.setVolumeFormat(issueGeneration.getVolumeFormat());
		issue = issueGenerationRepo.save(issue);
		return issueGeneration;
	}

	@Override
	public IssueGeneration findbyIssueId(Integer issueId) {
		return issueGenerationRepo.findById(issueId).get();
	}

}
