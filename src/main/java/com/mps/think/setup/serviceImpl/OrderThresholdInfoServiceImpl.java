package com.mps.think.setup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.OrderThresholdInfo;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.SourceCode;
import com.mps.think.setup.model.Terms;
import com.mps.think.setup.repo.OrderThresholdInfoRepo;
import com.mps.think.setup.service.OrderThresholdInfoService;
import com.mps.think.setup.vo.OrderThresholdInfoVO;
@Service
public class OrderThresholdInfoServiceImpl implements OrderThresholdInfoService{
	@Autowired
	OrderThresholdInfoRepo thresholdInfoRepo;

	@Override
	public List<OrderThresholdInfo> findAllorderThresholdByPubId(Integer pubId) {
		return thresholdInfoRepo.findByPublisherId(pubId);
	}

	@Override
	public OrderThresholdInfo saveorderThresholdInfo(OrderThresholdInfoVO orderThresholdInfoVO) {
		OrderThresholdInfo ot=new OrderThresholdInfo();
		OrderClass oc=new OrderClass();
		oc.setOcId(orderThresholdInfoVO.getOrderClass().getOcId());
		ot.setOrderClass(oc);
		Terms term=new Terms();
		term.setTermsId(orderThresholdInfoVO.getTerms().getTermsId());
		ot.setTerms(term);
		SourceCode sc=new SourceCode();
		sc.setSourceCodeId(orderThresholdInfoVO.getSourceCode().getSourceCodeId());
		ot.setSourceCode(sc);
		Order order=new Order();
		order.setOrderId(orderThresholdInfoVO.getOrder().getOrderId());
		ot.setOrder(order);
		ot.setCustomerNbr(orderThresholdInfoVO.getCustomerNbr());
		ot.setOrderNbr(orderThresholdInfoVO.getOrderNbr());
		ot.setStartDate(orderThresholdInfoVO.getStartDate());
		ot.setLineItem(orderThresholdInfoVO.getLineItem());
		ot.setOrderDate(orderThresholdInfoVO.getOrderDate());
		ot.setTotalPaid(orderThresholdInfoVO.getTotalPaid());
		if(orderThresholdInfoVO.getPaymentStatus().equalsIgnoreCase("Prorate Issues")) {
			ot.setUnderPaymentOption(orderThresholdInfoVO.getUnderPaymentOption());
			ot.setExpirationOriginal(orderThresholdInfoVO.getExpirationOriginal());
			ot.setExpirationProrated(orderThresholdInfoVO.getExpirationProrated());
			ot.setOrderQuantityOriginal(orderThresholdInfoVO.getOrderQuantityOriginal());
			ot.setOrderQuantityProrated(orderThresholdInfoVO.getOrderQuantityProrated());
			ot.setRemaining(orderThresholdInfoVO.getRemaining());
			ot.setOrderAmntSubsOriginal(orderThresholdInfoVO.getOrderAmntSubsOriginal());
			ot.setOrderAmntDeliveryOriginal(orderThresholdInfoVO.getOrderAmntDeliveryOriginal());
			ot.setOrderAmntTaxOriginal(orderThresholdInfoVO.getOrderAmntTaxOriginal());
		}
		Publisher pub=new Publisher();
		pub.setId(orderThresholdInfoVO.getPublisher().getId());
		ot.setPublisher(pub);
		OrderThresholdInfo data = thresholdInfoRepo.saveAndFlush(ot);
		ot.setId(data.getId());
		
		return ot;
	}

	@Override
	public OrderThresholdInfo findbyOrderId(Integer orderId) {
		return thresholdInfoRepo.findByOrderOrderId(orderId);
	}

}
