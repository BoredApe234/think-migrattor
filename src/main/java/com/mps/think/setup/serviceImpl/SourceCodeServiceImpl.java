package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.SourceCode;
import com.mps.think.setup.repo.SourceCodeRepo;
import com.mps.think.setup.service.SourceCodeService;
import com.mps.think.setup.vo.SourceCodeVO;

@Service
public class SourceCodeServiceImpl implements SourceCodeService {
	
	@Autowired
	SourceCodeRepo sourceCodeRepo;

	@Override
	public List<SourceCode> findAllSourceCode() {
		List<SourceCode> scList = sourceCodeRepo.findAll();
		if (scList.isEmpty()) {
			throw new NotFoundException("No Source Code present, please add Source Code!");
		}
		return scList;
	}

	@Override
	public SourceCodeVO saveSourceCode(SourceCodeVO sourceCode) {
		
		ObjectMapper mapper = new ObjectMapper();
		SourceCode newSourceCode = mapper.convertValue(sourceCode, SourceCode.class);
		sourceCodeRepo.saveAndFlush(newSourceCode);
		
		return sourceCode;
	}

	@Override
	public SourceCode findbySourceCodeId(Integer sourceCodeId) {
		 Optional<SourceCode> cc = sourceCodeRepo.findById(sourceCodeId);
			if(!cc.isPresent()) {
				throw new NotFoundException("Source Code Id : "+ sourceCodeId +" does not exist!");
			}
			return cc.get();
	}

	@Override
	public SourceCodeVO updateSourceCode(SourceCodeVO sourceCode) {
		ObjectMapper mapper = new ObjectMapper();
		SourceCode sourceCodeToUpdate = mapper.convertValue(sourceCode, SourceCode.class);
		sourceCodeRepo.saveAndFlush(sourceCodeToUpdate);
		return sourceCode;
	}

	@Override
	public SourceCode deleteSourceCodeById(Integer sourceCodeId) {
		SourceCode delete = findbySourceCodeId(sourceCodeId);
		sourceCodeRepo.delete(delete);
		return delete;
	}

	@Override
	public List<SourceCode> findSourceCodeByParentId(Integer parentId) {
		return sourceCodeRepo.findByParentIDParentID(parentId);
	}

//	@Override
//	public List<SourceCode> findSourceCodeByChildId(Integer childId) {
//		return sourceCodeRepo.findByChildIDChildId(childId);
//	}

}
