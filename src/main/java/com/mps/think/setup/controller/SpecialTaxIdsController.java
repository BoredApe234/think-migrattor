package com.mps.think.setup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.SpecialTaxIdsService;
import com.mps.think.setup.vo.SpecialTaxIdsVO;
import com.mps.think.setup.vo.EnumModelVO.ExemptStatus;
import com.mps.think.setup.vo.EnumModelVO.ItemType;

@RestController
@CrossOrigin
public class SpecialTaxIdsController {

	@Autowired
	SpecialTaxIdsService stis;	
	
	
	@GetMapping("/getAllSpecialTaxIds")
	public ResponseEntity<?> getAllPubliser(){
		return ResponseEntity.ok(stis.findAllSpecialTaxIds());
	}

	@PostMapping("/saveSpecialTaxIds")
	public ResponseEntity<?> saveubs(@RequestBody SpecialTaxIdsVO Id){
		return ResponseEntity.ok(stis.saveSpecialTaxIds(Id));
	}

	@PostMapping("/updateSpecialTaxIds")
	public ResponseEntity<?> updateSpecialTaxIds(@RequestBody SpecialTaxIdsVO id){
		return ResponseEntity.ok(stis.updateSpecialTaxIds(id));
	}

	@PostMapping("/findbySpecialTaxIdsId")
	public ResponseEntity<?> findbyId(@RequestBody Integer id){
		return ResponseEntity.ok(stis.findbySpecialTaxIdsId(id));
	}
	
	@DeleteMapping("/deleteBySpecialTaxIdsId")
	public ResponseEntity<?> deleteBySpecialTaxIdsId(@RequestBody Integer id) {
		return ResponseEntity.ok(stis.deleteBySpecialTaxIdsId(id));
	}
	
	@PostMapping("/findAllSpecialTaxIdsForPublisher")
	public ResponseEntity<?> findAllSpecialTaxIdsForPublisher(@RequestBody Integer pubId) {
		return ResponseEntity.ok(stis.findAllSpecialTaxIdsForPublisher(pubId));
	}
	@GetMapping("/findAllexemptStatus")
	public ResponseEntity<?> getAllExemptStatus() {
		List<String> list= new ArrayList<>();
		for(ExemptStatus data:ExemptStatus.values()) {
			list.add(data.getExemptStatus());
		}
		return ResponseEntity.ok(list);
	}
	
}
	

