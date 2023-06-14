package com.mps.think.setup.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mps.think.setup.model.CancelOrder;
import com.mps.think.setup.model.Order;

@Repository
public interface CancelOrderRepo extends JpaRepository<CancelOrder ,Integer> {
	
	List<CancelOrder> findByOrderidOrderId(Integer id);
	
	@Query("SELECT c FROM CancelOrder c JOIN c.orderid o JOIN o.paymentBreakdown p JOIN o.customerId ci WHERE (ci.publisher.id = :pubId OR :pubId IS NULL) AND (o.orderType LIKE '%'||:orderType||'%') AND "
			+ "(:currencyType IS NULL OR p.currency LIKE '%'||:currencyType||'%') "
			+ "AND (:ordersFrom IS NULL OR DATE(c.createdAt) >= :ordersFrom) AND "
			+ "(:ordersTill IS NULL OR DATE(c.createdAt) <= :ordersTill)")
	public Page<CancelOrder> findAllCancelledSubscriptions(
			  @Param("pubId") Integer pubId,
			  @Param("ordersFrom") Date ordersFrom, 
			  @Param("ordersTill") Date ordersTill, 
			  @Param("currencyType") String currencyType, @Param("orderType") String orderType, Pageable page);
	
	
@Query("select co from CancelOrder co JOIN co.orderid oid JOIN oid.customerId cid WHERE (cid.publisher.id = :pubId OR :pubId IS NULL) AND (DATE(co.createdAt) >= :startRefund AND DATE(co.createdAt) <= :endRefund)")
	Page<CancelOrder> findAllRefundProcessReport(
			 @Param("pubId") Integer pubId,
			@Param("startRefund") Date startRefund, 
			@Param("endRefund") Date endRefund, Pageable page);

}
