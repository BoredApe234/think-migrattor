<<<<<<< HEAD
package com.mps.think.setup.service;

import java.util.List;
import java.util.Optional;

import com.mps.think.setup.model.PaymentLinkStatus;
import com.mps.think.setup.vo.PaymentLinkStatusVO;

public interface PaymentLinkStatusService {

	public List<PaymentLinkStatus> getAllPaymentLinkStatus(Integer pubId);
	
	public PaymentLinkStatus savePaymentLinkStatus(PaymentLinkStatusVO paymentLinkStatusVO);
	
	public PaymentLinkStatus updatePaymentLinkStatus(PaymentLinkStatusVO paymentLinkStatusVO);
	
	public PaymentLinkStatus findPaymentLinkStatusById(Integer id);
	public PaymentLinkStatus findPaymentLinkStatusByOrderId(Integer orderId);

	public List<PaymentLinkStatus> getAllPaymentLinkStatus();
}
=======
package com.mps.think.setup.service;

import java.util.List;
import java.util.Optional;

import com.mps.think.setup.model.PaymentLinkStatus;
import com.mps.think.setup.vo.PaymentLinkStatusVO;

public interface PaymentLinkStatusService {

	public List<PaymentLinkStatus> getAllPaymentLinkStatus(Integer pubId);
	
	public PaymentLinkStatus savePaymentLinkStatus(PaymentLinkStatusVO paymentLinkStatusVO);
	
	public PaymentLinkStatus updatePaymentLinkStatus(PaymentLinkStatusVO paymentLinkStatusVO);
	
	public PaymentLinkStatus findPaymentLinkStatusById(Integer id);
	public PaymentLinkStatus findPaymentLinkStatusByOrderId(Integer orderId);

	public List<PaymentLinkStatus> getAllPaymentLinkStatus();
}
>>>>>>> 8248e4c1bbded89ffa1324e4e365965e59b22c19
