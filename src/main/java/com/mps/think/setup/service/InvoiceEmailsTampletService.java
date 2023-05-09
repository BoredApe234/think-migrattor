package com.mps.think.setup.service;

import java.util.List;

import com.mps.think.setup.model.InvoiceEmailsTamplet;
import com.mps.think.setup.vo.InvoiceEmailsTampletVO;

public interface InvoiceEmailsTampletService {
	
	public List<InvoiceEmailsTamplet> getAllInvoiceEmailsTamplet(Integer pubId);
	
	public InvoiceEmailsTamplet saveInvoiceEmailsTamplet(InvoiceEmailsTampletVO invoiceEmailsTampletVO);
	
	public InvoiceEmailsTamplet updateInvoiceEmailsTamplet(InvoiceEmailsTampletVO invoiceEmailsTampletVO);
	
	public InvoiceEmailsTamplet findByID(Integer id);
	
	public List<InvoiceEmailsTamplet> defaultStatus(Integer id,Integer pubId);

}
