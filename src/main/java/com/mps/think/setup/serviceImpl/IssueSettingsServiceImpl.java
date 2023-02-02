package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.ChildClass;
import com.mps.think.setup.model.IssueSettings;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.ParentClass;
import com.mps.think.setup.model.SubChildClass;
import com.mps.think.setup.repo.IssueSettingsRepo;
import com.mps.think.setup.service.IssueSettingsService;
import com.mps.think.setup.vo.IssueSettingsVO;
@Service
public class IssueSettingsServiceImpl implements IssueSettingsService{
	
	@Autowired
	IssueSettingsRepo issueSettingsRepo;

	@Override
	public List<IssueSettings> findAllIssueSetting() {
		return issueSettingsRepo.findAll();
	}

	@Override
	public IssueSettingsVO saveIssueSetting(IssueSettingsVO issueSettingsVO) {

		IssueSettings issueSettings=new IssueSettings();
		issueSettings.setNumberOfIssue(issueSettingsVO.getNumberOfIssue());
		issueSettings.setFrequencyOfGeneration(issueSettingsVO.getFrequencyOfGeneration());
		issueSettings.setPeriodicity(issueSettingsVO.getPeriodicity());
		issueSettings.setIssuesAppearonEvery(issueSettingsVO.getIssuesAppearonEvery());
		issueSettings.setDwmOfThewmy(issueSettingsVO.getDwmOfThewmy());
		issueSettings.setVolumeCaption(issueSettingsVO.getVolumeCaption());
		issueSettings.setVolumeFormat(issueSettingsVO.getVolumeFormat());
		issueSettings.setChangeDate(issueSettingsVO.getChangDate());
		issueSettings.setIssueCaption(issueSettingsVO.getIssueCaption());
		issueSettings.setIssueFormat(issueSettingsVO.getIssueFormat());
		issueSettings.setIssuesOrVolume(issueSettingsVO.getIssuesOrVolume());
		OrderClass od=new OrderClass();
		od.setOcId(issueSettingsVO.getOrderClassId().getOcId());
		issueSettings.setOrderClassId(od);
		ParentClass parent=new ParentClass();
		parent.setParentID(issueSettingsVO.getParentClassId().getParentID());
		issueSettings.setParentClassId(parent);
		ChildClass child=new ChildClass();
		if(issueSettingsVO.getChildClassId().getChildId()==0){
			child.setChildId(null);
		}else{
			child.setChildId(issueSettingsVO.getChildClassId().getChildId());
		}
		issueSettings.setChildClassId(child);
		SubChildClass subchild=new SubChildClass();
		if(issueSettingsVO.getSubChildClassId().getSubChildId()==0){
			subchild.setSubChildId(null);
		}else{
			subchild.setSubChildId(issueSettingsVO.getSubChildClassId().getSubChildId());
		}
		issueSettings.setSubChildClassId(subchild);
		issueSettingsRepo.saveAndFlush(issueSettings);
		issueSettingsVO.setId(issueSettings.getId());
		return issueSettingsVO;
	}

	@Override
	public IssueSettingsVO updateIssueSetting(IssueSettingsVO IssueSettingsVO) {
	
		IssueSettings issueSettings=new IssueSettings();
		issueSettings.setId(IssueSettingsVO.getId());
		issueSettings.setNumberOfIssue(IssueSettingsVO.getNumberOfIssue());
		issueSettings.setFrequencyOfGeneration(IssueSettingsVO.getFrequencyOfGeneration());
		issueSettings.setPeriodicity(IssueSettingsVO.getPeriodicity());
		issueSettings.setIssuesAppearonEvery(IssueSettingsVO.getIssuesAppearonEvery());
		issueSettings.setDwmOfThewmy(IssueSettingsVO.getDwmOfThewmy());
		issueSettings.setVolumeCaption(IssueSettingsVO.getVolumeCaption());
		issueSettings.setVolumeFormat(IssueSettingsVO.getVolumeFormat());
		issueSettings.setChangeDate(IssueSettingsVO.getChangDate());
		issueSettings.setIssueCaption(IssueSettingsVO.getIssueCaption());
		issueSettings.setIssueFormat(IssueSettingsVO.getIssueFormat());
		issueSettings.setIssuesOrVolume(IssueSettingsVO.getIssuesOrVolume());
		OrderClass od=new OrderClass();
		od.setOcId(IssueSettingsVO.getOrderClassId().getOcId());
		issueSettings.setOrderClassId(od);
		ParentClass parent=new ParentClass();
		parent.setParentID(IssueSettingsVO.getParentClassId().getParentID());
		issueSettings.setParentClassId(parent);
		ChildClass child=new ChildClass();
		if(IssueSettingsVO.getChildClassId().getChildId()==0){
			child.setChildId(null);
		}else{
			child.setChildId(IssueSettingsVO.getChildClassId().getChildId());
		}
		issueSettings.setChildClassId(child);
		SubChildClass subchild=new SubChildClass();
		if(IssueSettingsVO.getSubChildClassId().getSubChildId()==0){
			subchild.setSubChildId(null);
		}else{
			subchild.setSubChildId(IssueSettingsVO.getSubChildClassId().getSubChildId());
		}
		issueSettings.setSubChildClassId(subchild);
		issueSettingsRepo.saveAndFlush(issueSettings);
		return IssueSettingsVO;
	}

	@Override
	public IssueSettings findbyIssueSettingId(Integer IssueSettingId) {
		Optional<IssueSettings> data=issueSettingsRepo.findById(IssueSettingId);
		return data.get();
	}

	
}
