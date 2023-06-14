package com.mps.think.setup.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mps.think.setup.model.MakePayment;
import com.mps.think.setup.service.MakePaymentService;
import com.mps.think.setup.utils.MailTemplateUtils;
import com.mps.think.setup.vo.MailTemplateVO;
import com.mps.think.setup.vo.MakePaymentVO;
import com.mps.think.setup.vo.SendInvoiceVO;
import com.nimbusds.jose.shaded.json.JSONObject;
@RestController
@CrossOrigin
public class MakePaymentController {
	
	@Autowired
	MakePaymentService makePaymentService;
	
	@Autowired
	MailTemplateUtils template;
	
	@PostMapping("/findAllMakePaymentForPublisher")
	public ResponseEntity<?> findAllMakePaymentForPublisher(@RequestBody Integer pubId){
		return ResponseEntity.ok(makePaymentService.findAllMakePaymentByPubId(pubId));
	}
	
	@PostMapping("/saveMakePayment")
	public ResponseEntity<?> saveMakePayment(@RequestBody MakePaymentVO makePaymentVO){
		return ResponseEntity.ok(makePaymentService.saveMakePayment(makePaymentVO));
	}
	
//	@PostMapping("/updateMakePayment")
//	public ResponseEntity<?> updateMakePayment(@RequestBody MakePaymentVO makePaymentVO){
//		return ResponseEntity.ok(makePaymentService.updateMakePayment(makePaymentVO));
//	}

	@PostMapping("/findMakePaymentId")
	public ResponseEntity<?> findMakePaymentId(@RequestBody Integer id){
		return ResponseEntity.ok(makePaymentService.findByMakePaymentId(id));
	}
	
	@PostMapping("/findByOrderId")
	public ResponseEntity<?> findByOrderId(@RequestBody Integer id){
		MakePayment data = makePaymentService.findByOrderId(id);
		return ResponseEntity.ok(data !=null?data:new JSONObject());
	}
	
	@PostMapping("/sendPaymentLink")
	public ResponseEntity<?> sendPaymentLink(@RequestBody MailTemplateVO mailTemplateVO) {
		return ResponseEntity.ok(makePaymentService.sendPaymentLink(mailTemplateVO));
	}
	
	@PostMapping("/sendInvoiceToCust")
	public ResponseEntity<?> sendInvoiceToCust(@RequestPart MultipartFile file,@RequestPart SendInvoiceVO sendInvoiceVO) throws AddressException, IOException, MessagingException {
		
		return ResponseEntity.ok(makePaymentService.sendInvoiceToCust(file,sendInvoiceVO));
	}
//	@PostMapping("/sendInvoiceToCust")
//	public ResponseEntity<?> sendInvoiceToCust(@RequestParam("file") MultipartFile file,
//            @RequestParam("emailFrom") String emailFrom,
//            @RequestParam("emailTo") String emailTo,
//            @RequestParam("emailCC") String emailCC,
//            @RequestParam("emailSubject") String emailSubject,
//            @RequestParam("emailContent") String emailContent,
//            @RequestParam("pubId")Integer pubId) throws AddressException, IOException, MessagingException {
//		
//		return ResponseEntity.ok(makePaymentService.sendInvoiceToCust(file, emailFrom, emailTo, emailCC, emailSubject, emailContent,pubId));
//	}

}
