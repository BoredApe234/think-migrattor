package com.mps.think.setup.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.MakePayment;
import com.mps.think.setup.repo.MakePaymentRepo;
import com.mps.think.setup.service.MakePaymentService;
import com.mps.think.setup.vo.MakePaymentVO;
@Service
public class MakePaymentServiceImpl implements MakePaymentService{
	
	@Autowired
	MakePaymentRepo makePaymentRepo;

	@Override
	public List<MakePayment> findAllMakePaymentByPubId(Integer pubId) {
		return makePaymentRepo.findByPublisherId(pubId);
	}

	@Override
	public MakePayment saveMakePayment(MakePaymentVO makePaymentVO) {
		ObjectMapper obj=new ObjectMapper();
		MakePayment makePayment=obj.convertValue(makePaymentVO, MakePayment.class);
		MakePayment data=makePaymentRepo.saveAndFlush(makePayment);
		return data;
	}

	@Override
	public MakePayment updateMakePayment(MakePaymentVO makePaymentVO) {
		ObjectMapper obj=new ObjectMapper();
		MakePayment makePayment=obj.convertValue(makePaymentVO, MakePayment.class);
		MakePayment data=makePaymentRepo.saveAndFlush(makePayment);
		return data;
	}

	@Override
	public Optional<MakePayment> findByMakePaymentId(Integer id) {
		return makePaymentRepo.findById(id);
	}

	
}
