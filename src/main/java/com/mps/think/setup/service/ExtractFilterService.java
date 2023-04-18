package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.mps.think.setup.model.ExtractFilter;
import com.mps.think.setup.vo.ExtractFilterVO;

@Service
public interface ExtractFilterService {
	
	public List<ExtractFilter> getAllExtractFilter();
	
	public ExtractFilter saveExtractFilter(ExtractFilterVO extractFilter);

	public ExtractFilter updateExtractFilter(ExtractFilterVO extractFilter);

	public ExtractFilter findbyExtractFilterId(Integer id);
	
	public ExtractFilter deleteByExtractFilterId(Integer id);

}
