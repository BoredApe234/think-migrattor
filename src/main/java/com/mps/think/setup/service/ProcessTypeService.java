package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.mps.think.setup.model.ProcessType;
import com.mps.think.setup.vo.ProcessTypeVO;

@Service
public interface ProcessTypeService {
	
	public List<ProcessType> getAllProcessType();

	public ProcessType saveProcessType(ProcessTypeVO processType);

	public ProcessType updateProcessType(ProcessTypeVO processType);

	public ProcessType findbyProcessTypeId(Integer id);
	
	public ProcessType deleteByProcessTypeId(Integer id);
	
	

}
