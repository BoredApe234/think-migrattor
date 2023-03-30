package com.mps.think.setup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.AddProcessService;
import com.mps.think.setup.vo.AddProcessVO;

import com.mps.think.setup.vo.EnumModelVO.Process_types;

@RestController
@CrossOrigin
public class AddProcessController {
	
	@Autowired
	AddProcessService addProcessService;
	
	@GetMapping("/getAllAddProcess")
	public ResponseEntity<?> getAllAddProcess() {
		return ResponseEntity.ok(addProcessService.getAllProcess());
	}
	
	@PostMapping("/saveAddProcess")
	public ResponseEntity<?> saveProcess(@RequestBody AddProcessVO id) {
		return ResponseEntity.ok(addProcessService.saveProcess(id));
	}
	
	@PostMapping("/updateAddProcess")
	public ResponseEntity<?> updateJobQueue(@RequestBody AddProcessVO id) {
		return ResponseEntity.ok(addProcessService.updateProcess(id));
	}
	
	@PostMapping("/findbyAddProcessId")
	public ResponseEntity<?> findbyProcessId(@RequestBody Integer id) {
		return ResponseEntity.ok(addProcessService.findbyProcessId(id));
	}
	
	@DeleteMapping("/deletebyAddProcessId")
	public ResponseEntity<?> deleteByProcessId(@RequestBody Integer id) {
		return ResponseEntity.ok(addProcessService.deleteByProcessId(id));
	}
	
	@GetMapping("/findAllProcess_types")
	public ResponseEntity<?> getAllProcess_types() {
		List<String> list= new ArrayList<>();
		for(Process_types data:Process_types.values()) {
			list.add(data.getProcess_types());
		}
		return ResponseEntity.ok(list);
	}

}
