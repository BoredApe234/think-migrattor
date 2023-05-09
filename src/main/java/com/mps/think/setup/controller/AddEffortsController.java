package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mps.think.setup.service.AddEffortsService;
import com.mps.think.setup.vo.AddEffortsVO;

@RestController
@CrossOrigin
public class AddEffortsController {
	
	@Autowired
	private AddEffortsService addEffortsService;
	
	@GetMapping("/getAllEfforts")
	public ResponseEntity<?> getAllAddEfforts() {
		return ResponseEntity.ok(addEffortsService.getAllAddEfforts());
	}
	
	@PostMapping("/saveEfforts")
	public ResponseEntity<?> saveAddEfforts(@RequestBody AddEffortsVO id) {
		return ResponseEntity.ok(addEffortsService.saveAddEfforts(id));
	}
	
	@PostMapping("/updateEfforts")
	public ResponseEntity<?> updateInserts(@RequestBody AddEffortsVO id) {
		return ResponseEntity.ok(addEffortsService.updateAddEfforts(id));	
		}
	
	@PostMapping("/findbyEffortsId")
	public ResponseEntity<?> findbySplitsId(@RequestBody Integer id) {
		return ResponseEntity.ok(addEffortsService.findbyAddEffortsId(id));
	}
	
	@DeleteMapping("/deletebyEffortsId")
	public ResponseEntity<?> deleteBySplitsId(@RequestBody Integer id) {
		return ResponseEntity.ok(addEffortsService.deleteByAddEffortsId(id));
	}


}
