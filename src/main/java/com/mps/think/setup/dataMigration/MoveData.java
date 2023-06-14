package com.mps.think.setup.dataMigration;


import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.model.CustomerDetails;


@RestController
public class MoveData {
	
//	@Autowired
//	DataMig dataMigObj;
	
	@Autowired
	FetchDataFromSQLServer t;
	
//	@GetMapping("/moveData")
//	public List<String> moveData() {
//		return t.transfer().stream().map(c -> c.toString()).collect(Collectors.toList());
//	}
	
	@GetMapping("/moveData")
	public String moveData() throws SQLException {
		return t.transfer1();
	}
	
	@GetMapping("/moveCustomerData")
	public List<String> moveCustomerData() {
		return t.transfer().stream().map(c -> c.toString()).collect(Collectors.toList());
	}
	
}
