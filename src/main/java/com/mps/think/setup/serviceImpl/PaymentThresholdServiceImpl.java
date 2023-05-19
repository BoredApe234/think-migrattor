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
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.PaymentBreakdown;
import com.mps.think.setup.model.PaymentThreshold;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.PaymentThresholdRepo;
import com.mps.think.setup.service.PaymentThresholdService;
import com.mps.think.setup.vo.PaymentThresholdVO;

@Service
public class PaymentThresholdServiceImpl implements PaymentThresholdService {

	@Autowired
	PaymentThresholdRepo paymentThresholdRepo;

	@Autowired
	AddOrderRepo addOrderRepo;

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
	public List<HashMap<String, String>> definePayment(LinkedHashMap<Integer, String> amount,
			Integer paymentThresholdId) {
		List<HashMap<String, String>> list = new ArrayList<>();

		Optional<PaymentThreshold> threshold = paymentThresholdRepo.findById(paymentThresholdId);
		if (threshold.isPresent()) {
			for (Map.Entry<Integer, String> entry : amount.entrySet()) {
				HashMap<String, String> payment = new HashMap<>();
				String[] str = entry.getValue().split(",");
				double invoiceAmount = Double.parseDouble(str[0]);
				double paidAmount = Double.parseDouble(str[1]);

				double paidPercentage = (paidAmount * 100) / invoiceAmount;
				double unPaidAmount = Math.abs(invoiceAmount - paidAmount);

				String paymentStatus;

				if (paidPercentage == 100) {
					paymentStatus = "Paid";
				} else if (paidPercentage == 0) {
					paymentStatus = "No Payment";
				} else if (paidPercentage <= threshold.get().getPartialThreshold()) {
					paymentStatus = "Partial Payment";
				} else if (paidPercentage < threshold.get().getUnderThreshold()) {
					if ((int) unPaidAmount <= threshold.get().getMaxUnderpaymentForPartial()) {
						paymentStatus = "Paid - Underpayment";
					} else {
						paymentStatus = "Paid - Prorated";
					}
				} else if (paidPercentage <= threshold.get().getOverThreshold()) {
					if ((int) unPaidAmount <= threshold.get().getMaxUnderpaymentForFull()) {
						paymentStatus = "Paid - Underpayment";
					} else if ((int) unPaidAmount > threshold.get().getMaxUnderpaymentForPartial()) {
						paymentStatus = "Partial Payment";
					} else {
						paymentStatus = "Paid - Prorated";
					}
				} else if (paidPercentage <= threshold.get().getRefundThreshold()) {
					if ((int) unPaidAmount <= threshold.get().getMaxOverpaymentForFull()) {
						paymentStatus = "Paid - Overpayment";
					} else if ((int) unPaidAmount > threshold.get().getMaxOverpaymentForRefund()) {
						paymentStatus = "Refund payments";
					} else {
						paymentStatus = "Paid - Prorated";
					}
				} else {
					paymentStatus = "Refund payments";
				}

				payment.put("paymentStatus", entry.getKey() + "," + paymentStatus);
				list.add(payment);
			}
		}
		for (HashMap<String, String> updateOrder : list) {
			for (Map.Entry<String, String> keyValue : updateOrder.entrySet()) {
				String[] pStatus = keyValue.getValue().split(",");
				try{
				    Integer orderId = Integer.parseInt(pStatus[0]);
				    Order orderDetails = addOrderRepo.findById(orderId).get();
				    PaymentBreakdown paymentBreakdown = orderDetails.getPaymentBreakdown();
					paymentBreakdown.setPaymentStatus(pStatus[1]);
					orderDetails.setPaymentBreakdown(paymentBreakdown);
					addOrderRepo.saveAndFlush(orderDetails);
				} catch(NumberFormatException ex){ // handle your exception
				   throw new NumberFormatException("Invalid Order Id");
				}
			}
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
		List<PaymentThreshold> list = paymentThresholdRepo.findByPublisherId(paymentThresholdVO.getPublisher().getId());
		ObjectMapper obj = new ObjectMapper();
		PaymentThreshold pThresholdnew, thresh;
		List<PaymentThreshold> response = new ArrayList<>();
		for (PaymentThreshold pthreshold : list) {
			if (Objects.equals(paymentThresholdVO.getPaymentThresholdId(), pthreshold.getPaymentThresholdId())) {
				pThresholdnew = obj.convertValue(pthreshold, PaymentThreshold.class);
				pThresholdnew.setStatus(true);
				thresh = paymentThresholdRepo.saveAndFlush(pThresholdnew);
				response.add(thresh);
			} else {
				pThresholdnew = obj.convertValue(pthreshold, PaymentThreshold.class);
				pThresholdnew.setStatus(false);
				thresh = paymentThresholdRepo.saveAndFlush(pThresholdnew);
				response.add(thresh);
			}
		}
		return response;
	}
}
