package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.ProcessType;
import com.mps.think.setup.repo.ProcessTypeRepo;
import com.mps.think.setup.service.ProcessTypeService;
import com.mps.think.setup.vo.ProcessTypeVO;

@Service
public class ProcessTypeServiceImpl  implements ProcessTypeService{
	
	@Autowired
	private ProcessTypeRepo processTypeRepo;
	
	@Autowired
	private ObjectMapper mapper;

	@Override
	public List<ProcessType> getAllProcessType() {
		return processTypeRepo.findAll();
	}

	@Override
	public ProcessType saveProcessType(ProcessTypeVO processType) {
	    return processTypeRepo.saveAndFlush(mapper.convertValue(processType, ProcessType.class));
	}

	@Override
	public ProcessType updateProcessType(ProcessTypeVO processType) {
	    return processTypeRepo.saveAndFlush(mapper.convertValue(processType, ProcessType.class));
	}

	@Override
	public ProcessType findbyProcessTypeId(Integer id) {
		Optional<ProcessType> cr = processTypeRepo.findById(id);
		return cr.get();
	}

	@Override
	public ProcessType deleteByProcessTypeId(Integer id) {
		ProcessType delete = findbyProcessTypeId(id);
		processTypeRepo.delete(delete);
		return delete;
	}

}
