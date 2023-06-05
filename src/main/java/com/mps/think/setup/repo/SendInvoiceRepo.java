package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.SendInvoice;

public interface SendInvoiceRepo extends JpaRepository<SendInvoice, Integer> {

}
