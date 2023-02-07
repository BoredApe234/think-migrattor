package com.mps.think.setup.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.Order;

@Repository
public interface AddOrderRepo extends JpaRepository<Order, Integer> {
	
//	public List<Order> findAllByCustomerId(Integer customerId) throws Exception;
	
	public List<Order> findByCustomerIdCustomerId(Integer customerId) throws Exception;
	
	public List<Order> findByOrderClassOcId(Integer ocId) throws Exception;

	@Query("SELECT o FROM Order o JOIN o.customerId cus JOIN o.keyOrderInformation keyInfo WHERE "
			+ "(o.orderStatus LIKE '%'||:orderStatus||'%' OR :orderStatus IS NULL) "
			+ "AND ((keyInfo.orderDate >= :ordersFrom AND keyInfo.orderDate <= :ordersTill) OR (:ordersFrom IS NULL OR :ordersTill IS NULL)) "
			+ "AND (cus.customerId LIKE '%'||:customerId||'%' OR :customerId IS NULL) "
			+ "AND (CONCAT(cus.fname, ' ', cus.lname) LIKE '%'||:customerName||'%' OR :customerName IS NULL)")
	public Page<Order> findAllOrdersForReport(@Param("orderStatus") String orderStatus,
											  @Param("ordersFrom") Date ordersFrom, 
											  @Param("ordersTill") Date ordersTill, 
											  @Param("customerId") Integer customerId, 
											  @Param("customerName") String customerName, Pageable page);
	
	@Query("SELECT DISTINCT o FROM Order o JOIN o.orderAddresses oa JOIN oa.address oadd JOIN o.customerId cusDet JOIN o.keyOrderInformation keyInfo "
			+ "JOIN keyInfo.orderCode kioc JOIN kioc.orderCodes ordCod JOIN keyInfo.sourceCode srcCod "
			+ "WHERE (ordCod.orderCode LIKE '%'||:keyword||'%') OR (srcCod.sourceCode LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(keyInfo.orderStatus, ' ', keyInfo.orderCategory, ' ', keyInfo.agent, ' ', keyInfo.purchaseOrder) LIKE '%'||:keyword||'%') OR "
			+ "(keyInfo.agentReferenceNum LIKE '%'||:keyword||'%') OR "
			+ "CONCAT(oadd.addressName, ' ', oadd.name, ' ', oadd.addressLine1, ' ', oadd.addressLine2, ' ', oadd.zipCode, ' ', oadd.city, ' ', "
			+ "oadd.state, ' ', oadd.country, ' ', oadd.countryCode, ' ', oadd.phone) LIKE '%'||:keyword||'%' OR "
			+ "CONCAT(o.orderId, ' ', o.orderStatus, ' ', o.orderType) LIKE '%'||:keyword||'%'")
	public Page<Order> findOrdersBySearch(@Param("keyword") String keyword, Pageable page);
	
}
