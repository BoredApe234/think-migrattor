<<<<<<< HEAD
package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.PaymentLinkStatus;
@Repository
public interface PaymentLinkStatusRepo extends JpaRepository<PaymentLinkStatus, Integer> {

	List<PaymentLinkStatus> findByPublisherId(Integer pubId);
	PaymentLinkStatus findByorderId(Integer orderId);
}
=======
package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.PaymentLinkStatus;
@Repository
public interface PaymentLinkStatusRepo extends JpaRepository<PaymentLinkStatus, Integer> {

	List<PaymentLinkStatus> findByPublisherId(Integer pubId);
	PaymentLinkStatus findByorderId(Integer orderId);
}
>>>>>>> 8248e4c1bbded89ffa1324e4e365965e59b22c19
