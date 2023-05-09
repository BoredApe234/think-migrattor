package com.mps.think.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.service.InvoiceEmailsTampletService;
import com.mps.think.setup.vo.InvoiceEmailsTampletVO;

@RestController
@CrossOrigin
public class InvoiceEmailsTampletController {
	
	@Autowired
	InvoiceEmailsTampletService invoiceEmailsTampletService;
	
	@PostMapping("/getAllInvoiceEmailsTamplet")
	public ResponseEntity<?> getAllInvoiceEmailsTamplet(@RequestBody Integer pubId){
		return ResponseEntity.ok(invoiceEmailsTampletService.getAllInvoiceEmailsTamplet(pubId));
	}
	
	@PostMapping("/saveInvoiceEmailsTamplet")
	public ResponseEntity<?> saveInvoiceEmailsTamplet(@RequestBody InvoiceEmailsTampletVO invoiceEmailsTampletVO){
		return ResponseEntity.ok(invoiceEmailsTampletService.saveInvoiceEmailsTamplet(invoiceEmailsTampletVO));
	}
	
	@PostMapping("/updateInvoiceEmailsTamplet")
	public ResponseEntity<?> updateInvoiceEmailsTamplet(@RequestBody InvoiceEmailsTampletVO invoiceEmailsTampletVO){
		return ResponseEntity.ok(invoiceEmailsTampletService.updateInvoiceEmailsTamplet(invoiceEmailsTampletVO));
	}
	
	@PostMapping("/findByInvoiceEmailsTampletId")
	public ResponseEntity<?> findByInvoiceEmailsTampletId(@RequestBody Integer id){
		return ResponseEntity.ok(invoiceEmailsTampletService.findByID(id));
	}
	
	@PostMapping("/defaultStatusInvoiceEmailsTamplet")
	public ResponseEntity<?> defaultStatus(@RequestParam Integer id,@RequestParam Integer pubId){
		return ResponseEntity.ok(invoiceEmailsTampletService.defaultStatus(id, pubId));
	}

}
