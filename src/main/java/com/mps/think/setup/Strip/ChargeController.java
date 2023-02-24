package com.mps.think.setup.Strip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.Strip.ChargeRequest.Currency;
import com.mps.think.setup.vo.PublicKey;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

@RestController
public class ChargeController {

	@Autowired
	StripeService paymentsService;

//	@PostMapping("/charge")
//	public String charge(ChargeRequest chargeRequest, Model model) throws StripeException {
//		chargeRequest.setDescription("Example charge");
//		chargeRequest.setCurrency(Currency.EUR);
//		Charge charge = paymentsService.charge(chargeRequest);
//		model.addAttribute("id", charge.getId());
//		model.addAttribute("status", charge.getStatus());
//		model.addAttribute("chargeId", charge.getId());
//		model.addAttribute("balance_transaction", charge.getBalanceTransaction());
//		System.out.println(chargeRequest.toString());
//		System.out.println(charge.toString());
//		return "result";
//	}

	@ExceptionHandler(StripeException.class)
	public String handleError(Model model, StripeException ex) {
		model.addAttribute("error", ex.getMessage());
		return "result";
	}

	@PostMapping("/chargeAPI")
	public ResponseEntity<?> chargeAPI(@RequestBody ChargeRequest chargeRequest) throws StripeException {
		chargeRequest.setDescription("Example charge");
		if (chargeRequest.getCurrency().EUR.toString() == "EUR") {
			chargeRequest.setCurrency(Currency.EUR);
		}
		chargeRequest.setCurrency(Currency.USD);
		Charge charge = paymentsService.charge(chargeRequest);
		PublicKey pk = new PublicKey();
		pk.setId(charge.getId());
		pk.setStatus(charge.getStatus());
		pk.setBalanceTransaction(charge.getBalanceTransaction());
		System.out.println(chargeRequest.toString());
		System.out.println(charge.toString());
		return ResponseEntity.ok(pk);
	}
}