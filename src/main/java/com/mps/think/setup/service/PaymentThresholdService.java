package com.mps.think.setup.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import com.mps.think.setup.model.PaymentThreshold;
import com.mps.think.setup.vo.PaymentThresholdVO;

public interface PaymentThresholdService {

	public List<PaymentThreshold> getAllPaymentThresholdForPublisher(Integer pubId);
	
	public PaymentThreshold savePaymentThreshold(PaymentThresholdVO paymentThresholdVO);
	
	public PaymentThreshold updatePaymentThreshold(PaymentThresholdVO paymentThresholdVO);
	
	public PaymentThreshold findByPaymentThresholdId(Integer id);
	
	public List<HashMap<String, String>> definePayment(LinkedHashMap<Integer, String> amount, Integer paymentThresholdId);
		
	public PaymentThreshold DeletePaymentThreshold(Integer id);
	
	public List<PaymentThreshold> defaultStatus(PaymentThresholdVO paymentThresholdVO);

	public List<PaymentThreshold> getAllPaymentThreshold();
}
