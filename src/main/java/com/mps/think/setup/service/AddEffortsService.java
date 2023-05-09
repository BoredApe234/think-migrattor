package com.mps.think.setup.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.mps.think.setup.model.AddEfforts;
import com.mps.think.setup.vo.AddEffortsVO;

@Service
public interface AddEffortsService {
	
	public List<AddEfforts> getAllAddEfforts();
	
	public AddEfforts saveAddEfforts(AddEffortsVO addEfforts);

	public AddEfforts updateAddEfforts(AddEffortsVO addEfforts);

	public AddEfforts findbyAddEffortsId(Integer id);
	
	public AddEfforts deleteByAddEffortsId(Integer id);

}
