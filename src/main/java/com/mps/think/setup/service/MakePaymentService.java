package com.mps.think.setup.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mps.think.setup.model.MailTemplate;
import com.mps.think.setup.model.MakePayment;
import com.mps.think.setup.model.SendInvoice;
import com.mps.think.setup.vo.MailTemplateVO;
import com.mps.think.setup.vo.MakePaymentVO;
import com.mps.think.setup.vo.SendInvoiceVO;

public interface MakePaymentService {
	
	public List<MakePayment> findAllMakePaymentByPubId(Integer pubId);
	
	public List<MakePayment> saveMakePayment(MakePaymentVO makePaymentVO);
	
	public MakePayment updateMakePayment(MakePaymentVO makePaymentVO);
	
	public MakePayment findByOrderId(Integer orderId);
	
	public Optional<MakePayment> findByMakePaymentId(Integer id);
	
	public MailTemplateVO sendPaymentLink(MailTemplateVO mailTemplateVO);
	
//	public SendInvoice sendInvoiceToCust(SendInvoiceVO sendInvoiceVO,MultipartFile file) throws IOException, AddressException, MessagingException;
	public SendInvoice sendInvoiceToCust(MultipartFile file,String emailFrom,String emailTo,String emailCC,String emailSubject, String emailContent) throws IOException, AddressException, MessagingException;
	public List<MakePayment> getAllMakePayment();

}
