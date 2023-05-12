package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.PaymentThreshold;
import com.mps.think.setup.repo.PaymentThresholdRepo;
import com.mps.think.setup.service.PaymentThresholdService;
import com.mps.think.setup.vo.PaymentThresholdVO;
@Service
public class PaymentThresholdServiceImpl implements PaymentThresholdService {

	@Autowired
	PaymentThresholdRepo paymentThresholdRepo;

	@Override
	public List<PaymentThreshold> getAllPaymentThresholdForPublisher(Integer pubId) {
		return paymentThresholdRepo.findByPublisherId(pubId);
	}

	@Override
	public PaymentThreshold savePaymentThreshold(PaymentThresholdVO paymentThresholdVO) {
		ObjectMapper obj = new ObjectMapper();
		PaymentThreshold pThreshold = obj.convertValue(paymentThresholdVO, PaymentThreshold.class);
		PaymentThreshold threshold = paymentThresholdRepo.saveAndFlush(pThreshold);
		return threshold;
	}

	@Override
	public PaymentThreshold updatePaymentThreshold(PaymentThresholdVO paymentThresholdVO) {
		ObjectMapper obj = new ObjectMapper();
		PaymentThreshold pThreshold = obj.convertValue(paymentThresholdVO, PaymentThreshold.class);
		PaymentThreshold threshold = paymentThresholdRepo.saveAndFlush(pThreshold);
		return threshold;
	}

	@Override
	public PaymentThreshold findByPaymentThresholdId(Integer id) {
		return paymentThresholdRepo.findById(id).get();
	}

//	@Override
//	public HashMap<String, String> definePayment(double invoiceAmount, double paidAmount, Integer paymentThresholdId) {
//		HashMap<String, String> payment = new HashMap<String, String>();
//		PaymentThreshold threshold = paymentThresholdRepo.findById(paymentThresholdId).get();
//
//		double paidPercentage = (paidAmount * 100) / invoiceAmount;
//		double unPaidAmount = Math.abs(invoiceAmount - paidAmount);
//		if (paidPercentage <= threshold.getPartialThreshold()) {
//			System.out.println("1 Partial payments");
//			payment.put("paymentStatus", "Partial payments");
//			return payment;
//		} else if (paidPercentage > threshold.getPartialThreshold() && paidPercentage < threshold.getUnderThreshold()) {
//			if ((int) unPaidAmount <= threshold.getMaxUnderpaymentForPartial()) {
//				System.out.println("2 Under payments");
//				payment.put("paymentStatus", "Under payments");
//				return payment;
//			}
//			System.out.println("3 Partial payments");
//			payment.put("paymentStatus", "Partial payments");
//			return payment;
//		} else if (paidPercentage >= threshold.getUnderThreshold() && paidPercentage <= threshold.getOverThreshold()) {
//			if ((int) unPaidAmount <= threshold.getMaxUnderpaymentForFull()) {
//				System.out.println("4 Full payments");
//				payment.put("paymentStatus", "Full payments");
//				return payment;
//			} else if ((int) unPaidAmount > threshold.getMaxUnderpaymentForPartial()) {
//				System.out.println("7 Partial payments");
//				payment.put("paymentStatus", "Partial payments");
//				return payment;
//			}
//			System.out.println("5 Under payments");
//			payment.put("paymentStatus", "Under payments");
//			return payment;
//
//		} else if (paidPercentage > threshold.getOverThreshold() && paidPercentage <= threshold.getRefundThreshold()) {
//			if ((int) unPaidAmount <= threshold.getMaxOverpaymentForFull()) {
//				System.out.println("6 Full payments");
//				payment.put("paymentStatus", "Full payments");
//				return payment;
//			} else if ((int) unPaidAmount > threshold.getMaxOverpaymentForRefund()) {
//				System.out.println("7 Refund payments");
//				payment.put("paymentStatus", "Refund payments");
//				return payment;
//			}
//			System.out.println("8 Over payments");
//			payment.put("paymentStatus", "Over payments");
//			return payment;
//		} else if (paidPercentage > threshold.getRefundThreshold()) {
//			System.out.println("9 Refund payments");
//			payment.put("paymentStatus", "Refund payments");
//			return payment;
//		}
//		payment.put("paymentStatus", "Not have vaild payment");
//		return payment;
//	}LinkedHashMap<Integer, String> amount
	
	
	@Override
	public List<HashMap<String, String>> definePayment(LinkedHashMap<Integer, String> amount, Integer paymentThresholdId) {
		HashMap<String, String> payment = new HashMap<String, String>();
		
		List<HashMap<String, String>> list = null;
		for(Map.Entry<Integer,String> entry : amount.entrySet()) {
		String[] str=entry.getValue().split(",");
		double invoiceAmount=Double.valueOf(str[0]);
		double paidAmount=Double.valueOf(str[1]);
		PaymentThreshold threshold = paymentThresholdRepo.findById(paymentThresholdId).get();

		double paidPercentage = (paidAmount * 100) / invoiceAmount;
		double unPaidAmount = Math.abs(invoiceAmount - paidAmount);
		if (paidPercentage <= threshold.getPartialThreshold()) {
			System.out.println("1 Partial payments");
			payment.put("paymentStatus", "Partial payments");
			list.add(payment);
			return list;
		} else if (paidPercentage > threshold.getPartialThreshold() && paidPercentage < threshold.getUnderThreshold()) {
			if ((int) unPaidAmount <= threshold.getMaxUnderpaymentForPartial()) {
				System.out.println("2 Under payments");
				payment.put("paymentStatus", "Under payments");
				list.add(payment);
				return list;
			}
			System.out.println("3 Partial payments");
			payment.put("paymentStatus", "Partial payments");
			list.add(payment);
			return list;
		} else if (paidPercentage >= threshold.getUnderThreshold() && paidPercentage <= threshold.getOverThreshold()) {
			if ((int) unPaidAmount <= threshold.getMaxUnderpaymentForFull()) {
				System.out.println("4 Full payments");
				payment.put("paymentStatus", "Full payments");
				list.add(payment);
				return list;
			} else if ((int) unPaidAmount > threshold.getMaxUnderpaymentForPartial()) {
				System.out.println("7 Partial payments");
				payment.put("paymentStatus", "Partial payments");
				list.add(payment);
				return list;
			}
			System.out.println("5 Under payments");
			payment.put("paymentStatus", "Under payments");
			list.add(payment);
			return list;

		} else if (paidPercentage > threshold.getOverThreshold() && paidPercentage <= threshold.getRefundThreshold()) {
			if ((int) unPaidAmount <= threshold.getMaxOverpaymentForFull()) {
				System.out.println("6 Full payments");
				payment.put("paymentStatus", "Full payments");
				list.add(payment);
				return list;
			} else if ((int) unPaidAmount > threshold.getMaxOverpaymentForRefund()) {
				System.out.println("7 Refund payments");
				payment.put("paymentStatus", "Refund payments");
				list.add(payment);
				return list;
			}
			System.out.println("8 Over payments");
			payment.put("paymentStatus", "Over payments");
			list.add(payment);
			return list;
		} else if (paidPercentage > threshold.getRefundThreshold()) {
			System.out.println("9 Refund payments");
			payment.put("paymentStatus", "Refund payments");
			list.add(payment);
			return list;
		}
		payment.put("paymentStatus", "Not have vaild payment");
		list.add(payment);
		}
		return list;
		
	}
	@Override
	public PaymentThreshold DeletePaymentThreshold(Integer id) {
		PaymentThreshold remove = paymentThresholdRepo.findById(id).get();
		if (remove != null) {
			paymentThresholdRepo.delete(remove);
		}
		return remove;
	}

	@Override
	public List<PaymentThreshold> defaultStatus(PaymentThresholdVO paymentThresholdVO) {
		List<PaymentThreshold> list=paymentThresholdRepo.findByPublisherId(paymentThresholdVO.getPublisher().getId());
		ObjectMapper obj = new ObjectMapper();
		PaymentThreshold pThresholdnew,thresh;
		List<PaymentThreshold> response=new ArrayList<>();
		for(PaymentThreshold pthreshold:list) {
			if(Objects.equals(paymentThresholdVO.getPaymentThresholdId(), pthreshold.getPaymentThresholdId())) {
				pThresholdnew = obj.convertValue(pthreshold, PaymentThreshold.class);
				pThresholdnew.setStatus(true);
				thresh=paymentThresholdRepo.saveAndFlush(pThresholdnew);
				response.add(thresh);
			}else {
			pThresholdnew = obj.convertValue(pthreshold, PaymentThreshold.class);
			pThresholdnew.setStatus(false);
			thresh=paymentThresholdRepo.saveAndFlush(pThresholdnew);
			response.add(thresh);
			}
		}
		return response;
	}
}
