package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.InvoiceEmailsTamplet;

@Repository
public interface InvoiceEmailsTampletRepo extends JpaRepository<InvoiceEmailsTamplet, Integer> {

	public List<InvoiceEmailsTamplet> findByPublisherId(Integer pubId);
}
