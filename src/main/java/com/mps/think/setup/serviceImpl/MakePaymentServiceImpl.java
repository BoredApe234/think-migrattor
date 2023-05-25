package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.MailTemplate;
import com.mps.think.setup.model.MakePayment;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.repo.AddOrderRepo;
import com.mps.think.setup.repo.MailTemplateRepo;
import com.mps.think.setup.repo.MakePaymentRepo;
import com.mps.think.setup.service.MakePaymentService;
import com.mps.think.setup.utils.MailTemplateUtils;
import com.mps.think.setup.vo.MailTemplateVO;
import com.mps.think.setup.vo.MakePaymentVO;

@Service
public class MakePaymentServiceImpl implements MakePaymentService {

	@Autowired
	MakePaymentRepo makePaymentRepo;

	@Autowired
	MailTemplateRepo mailTemplateRepo;
	
	@Autowired
	AddOrderRepo addOrderRepo;

	@Autowired
	MailTemplateUtils template;

	@Override
	public List<MakePayment> findAllMakePaymentByPubId(Integer pubId) {
		return makePaymentRepo.findByPublisherId(pubId);
	}
	

	@Override
	public List<MakePayment> saveMakePayment(MakePaymentVO makePaymentVO) {
//		ObjectMapper obj=new ObjectMapper();  entry.getValue()
//		MakePayment makePayment=obj.convertValue(makePaymentVO, MakePayment.class);
//		MakePayment data=makePaymentRepo.saveAndFlush(makePayment);
//		double amnt=makePaymentVO.getAmountToBePaid();
		List<MakePayment> mke=new ArrayList<>();
//		if(makePaymentVO.getTotalAmount()>=makePaymentVO.getTotalPaidAmount()) {
		for (Map.Entry<Integer,Double> entry : makePaymentVO.getListOfOrder().entrySet()) {
		Order odr=addOrderRepo.findById(entry.getKey()).get();
		MakePayment makePayment=new MakePayment();
		makePayment.setNameOfCustomer(makePaymentVO.getNameOfCustomer());
		makePayment.setPayerCustomer(makePaymentVO.getPayerCustomer());
		makePayment.setBaseAmount(odr.getPaymentBreakdown().getNetAmount().doubleValue());
		makePayment.setPaymentAccount(makePaymentVO.getPaymentAccount());
		makePayment.setPaymentType(makePaymentVO.getPaymentType());
		makePayment.setCard(makePaymentVO.getCard());
		makePayment.setAmountToBePaid(entry.getValue());
		makePayment.setExpiryDate(makePaymentVO.getExpiryDate());
		makePayment.setTransactionStatus(makePaymentVO.getTransactionStatus());
		makePayment.setChargeId(makePaymentVO.getChargeId());
		makePayment.setStatus(makePaymentVO.getStatus());
		Publisher pub=new Publisher();
		pub.setId(makePaymentVO.getPublisher().getId());
		makePayment.setPublisher(pub);
		Order od=new Order();
//		String[] s=entry.getKey().split("-");
		od.setOrderId(entry.getKey());
		makePayment.setOrder(od);
		MakePayment listdata=makePaymentRepo.saveAndFlush(makePayment);
		mke.add(listdata);
//		}
		}return mke;

	}

	@Override
	public MakePayment updateMakePayment(MakePaymentVO makePaymentVO) {
		ObjectMapper obj = new ObjectMapper();
		MakePayment makePayment = obj.convertValue(makePaymentVO, MakePayment.class);
		MakePayment data = makePaymentRepo.saveAndFlush(makePayment);
		return data;
	}

	@Override
	public Optional<MakePayment> findByMakePaymentId(Integer id) {
		return makePaymentRepo.findById(id);
	}

	@Override
	public MailTemplateVO sendPaymentLink(MailTemplateVO mailTemplateVO) {
		try {
			template.sendMailToCus(mailTemplateVO.getEmailFrom(), mailTemplateVO.getEmailTo(),
					mailTemplateVO.getEmailCC(), mailTemplateVO.getEmailSubject(), mailTemplateVO.getEmailContent());
			ObjectMapper obj = new ObjectMapper();
			mailTemplateRepo.saveAndFlush(obj.convertValue(mailTemplateVO, MailTemplate.class));
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return mailTemplateVO;
	}

	@Override
	public MakePayment findByOrderId(Integer orderId) {
		return makePaymentRepo.findByOrderOrderId(orderId);
	}


	@Override
	public List<MakePayment> getAllMakePayment() {
	return makePaymentRepo.findAll();
	}

}
