package com.mps.think.setup.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.AddEfforts;
import com.mps.think.setup.repo.AddEffortsRepo;
import com.mps.think.setup.service.AddEffortsService;
import com.mps.think.setup.vo.AddEffortsVO;

@Service
public class AddEffortsServiceimpl implements AddEffortsService{
	
	@Autowired
	private AddEffortsRepo addEffortsRepo;
	
	@Autowired
	private ObjectMapper mapper;

	@Override
	public List<AddEfforts> getAllAddEfforts() {
		return addEffortsRepo.findAll();
	}

	@Override
	public AddEfforts saveAddEfforts(AddEffortsVO addEfforts) {
		return addEffortsRepo.saveAndFlush(mapper.convertValue(addEfforts, AddEfforts.class));
	}

	@Override
	public AddEfforts updateAddEfforts(AddEffortsVO addEfforts) {
		return addEffortsRepo.saveAndFlush(mapper.convertValue(addEfforts, AddEfforts.class));
	}

	@Override
	public AddEfforts findbyAddEffortsId(Integer id) {
		return addEffortsRepo.findById(id).get();
	}

	@Override
	public AddEfforts deleteByAddEffortsId(Integer id) {
		AddEfforts delete = findbyAddEffortsId(id);
		addEffortsRepo.delete(delete);
		return delete;
	}

}
