package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.SubscriptionDefKeyInfoService;
import com.mps.think.setup.vo.SubscriptionDefKeyInfoVO;

@RestController
@CrossOrigin
public class SubscriptionDefinationController {

	@Autowired
	private SubscriptionDefKeyInfoService subscriptionDefService;
	
	@PostMapping("/saveSubscriptionDefination")
	public ResponseEntity<?> saveSubscriptionDefination(@RequestBody SubscriptionDefKeyInfoVO subscriptionDefination) {
		return ResponseEntity.ok(subscriptionDefService.saveSubscriptionDef(subscriptionDefination));
	}
	
	@PutMapping("/updateSubscriptionDefination")
	public ResponseEntity<?> updateSubscriptionDefination(@RequestBody SubscriptionDefKeyInfoVO subscriptionDefination) {
		return ResponseEntity.ok(subscriptionDefService.updateSubscriptionDef(subscriptionDefination));
	}
	
	@GetMapping("subscriptionDefinations/{publisherId}")
	public ResponseEntity<?> getSubscriptionDefinationByPublisherId(@PathVariable Integer publisherId) {
		return ResponseEntity.ok(subscriptionDefService.getSubscriptionDefByPublisherId(publisherId));
	}
	
	@DeleteMapping("deleteSubscriptionDefination")
	public ResponseEntity<?> deleteSubscriptionDefination(@RequestBody Integer id) {
		return ResponseEntity.ok(subscriptionDefService.deleteSubscriptionDef(id));
	}
	
	@GetMapping("/getSubscriptionDefByParentId/{parentId}")
	public ResponseEntity<?> getSubscriptionDefByParentId(@PathVariable("parentId") Integer parentId) {
		return ResponseEntity.ok(subscriptionDefService.getSubscriptionDefByParentId(parentId));
	}
	
	@GetMapping("/getSubscriptionDefByChildId/{childId}")
	public ResponseEntity<?> getSubscriptionDefByChildId(@PathVariable("childId") Integer childId) {
		return ResponseEntity.ok(subscriptionDefService.getSubscriptionDefByChildId(childId));
	}
	
	@GetMapping("/getSubscriptionDefBySubChildId/{subChildId}")
	public ResponseEntity<?> getSubscriptionDefBySubChildId(@PathVariable("subChildId") Integer subChildId) {
		return ResponseEntity.ok(subscriptionDefService.getSubscriptionDefBySubChildId(subChildId));
	}
	
}
