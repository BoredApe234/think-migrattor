package com.mps.think.setup.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.PaymentInformation;

@Repository
public interface PaymentInformationRepo extends JpaRepository<PaymentInformation, Integer> {

	List<PaymentInformation> findByPublisherId(Integer pub);
	List<PaymentInformation> findByOrderCustomerIdCustomerId(Integer customerId);

	List<PaymentInformation> findByOrderOrderId(Integer orderId);
	
	@Query("SELECT pinfo FROM PaymentInformation pinfo WHERE DATE(pinfo.createdAt) >= :paymentStart AND DATE(pinfo.createdAt) <= :paymentEnd")
	Page<PaymentInformation> findAllDailyCashReport(
			@Param("paymentStart") Date paymentStart, 
			@Param("paymentEnd") Date paymentEnd, Pageable page);
}
