package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.SourceFormat;
import com.mps.think.setup.model.SourceFormatAndAttributeMapping;
import com.mps.think.setup.vo.SourceFormatVo;

public interface SourceFormatService {

	public List<SourceFormat> findAllSourceFormat();

	public SourceFormatVo saveSourceFormat(SourceFormatVo sourceFormatVo);

	public SourceFormatVo updateSourceFormat(SourceFormatVo sourceFormatVo);

	public SourceFormat findbySourceFormatId(Integer SourceFormatId);
	
	public List<SourceFormat> getAllSourceFormatForPublisher(Integer pubId);
	
	public SourceFormat deleteBySourceFormatId(Integer id);

	public List<SourceFormat> getAllSourceFormat();

	public List<SourceFormatAndAttributeMapping> getAllSourceFormatAndAttributeMapping();

}
