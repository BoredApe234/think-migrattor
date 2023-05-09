package com.mps.think.setup.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mps.think.setup.model.InvoiceEmailsTamplet;
import com.mps.think.setup.repo.InvoiceEmailsTampletRepo;
import com.mps.think.setup.service.InvoiceEmailsTampletService;
import com.mps.think.setup.vo.InvoiceEmailsTampletVO;
@Service
public class InvoiceEmailsTampletServiceImpl implements InvoiceEmailsTampletService {
	
	@Autowired
	InvoiceEmailsTampletRepo emailsTampletRepo;
	
	@Autowired
	ObjectMapper mapper;

	@Override
	public List<InvoiceEmailsTamplet> getAllInvoiceEmailsTamplet(Integer pubId) {
		return emailsTampletRepo.findByPublisherId(pubId);
	}

	@Override
	public InvoiceEmailsTamplet saveInvoiceEmailsTamplet(InvoiceEmailsTampletVO invoiceEmailsTampletVO) {
		return emailsTampletRepo.saveAndFlush(mapper.convertValue(invoiceEmailsTampletVO, InvoiceEmailsTamplet.class));
	}

	@Override
	public InvoiceEmailsTamplet updateInvoiceEmailsTamplet(InvoiceEmailsTampletVO invoiceEmailsTampletVO) {
		return emailsTampletRepo.saveAndFlush(mapper.convertValue(invoiceEmailsTampletVO, InvoiceEmailsTamplet.class));
	}

	@Override
	public InvoiceEmailsTamplet findByID(Integer id) {
		return emailsTampletRepo.findById(id).get();
	}

	@Override
	public List<InvoiceEmailsTamplet> defaultStatus(Integer id,Integer pubId) {
		List<InvoiceEmailsTamplet> response=new ArrayList<>();
		InvoiceEmailsTamplet invoiceList;
		List<InvoiceEmailsTamplet> invoice = emailsTampletRepo.findByPublisherId(pubId);
		for(InvoiceEmailsTamplet emailtemp:invoice) {
		if(id==emailtemp.getId()) {
			emailtemp.setDefaultStatus(true);
			invoiceList=emailsTampletRepo.saveAndFlush(emailtemp);
			response.add(invoiceList);
		}else {
			emailtemp.setDefaultStatus(false);
			invoiceList=emailsTampletRepo.saveAndFlush(emailtemp);
			response.add(invoiceList);
		}
		}
		return response;
	}

}
