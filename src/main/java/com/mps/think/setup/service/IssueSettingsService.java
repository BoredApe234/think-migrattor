package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.IssueSettings;
import com.mps.think.setup.vo.IssueSettingsVO;

public interface IssueSettingsService {
	public List<IssueSettings> findAllIssueSetting();

	public IssueSettingsVO saveIssueSetting(IssueSettingsVO issueSettingsVO);

	public IssueSettingsVO updateIssueSetting(IssueSettingsVO IssueSettingsVO);

	public IssueSettings findbyIssueSettingId(Integer IssueSettingId);

}
