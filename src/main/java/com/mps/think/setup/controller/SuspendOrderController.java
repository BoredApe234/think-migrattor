package com.mps.think.setup.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.exception.OrdersNotSuspended;
import com.mps.think.setup.service.SuspendOrderService;
import com.mps.think.setup.vo.SuspendOrderVO;

@CrossOrigin
@RestController
public class SuspendOrderController {

	@Autowired
	SuspendOrderService suspendOrderService;
	
	@PostMapping("/saveSuspendOrdersDetails")
	public ResponseEntity<?> saveSuspendOrdersDetails(@RequestBody SuspendOrderVO suspendOrder) {
		return ResponseEntity.ok(suspendOrderService.saveSuspendOrderDetails(suspendOrder));
	}
	
//	@PostMapping("/checkSuspension")
//	public void suspendOrder() throws OrdersNotSuspended, ParseException {
//		suspendOrderService.checkOrdersToSuspend();
//	}
//	
//	@PostMapping("/continueOrders")
//	public void continueOrders() throws ParseException {
//		suspendOrderService.checkOrdersToContinue();
//	}
	
}
