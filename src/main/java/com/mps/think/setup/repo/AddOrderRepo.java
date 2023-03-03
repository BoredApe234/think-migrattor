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
	
	
	@Query("SELECT o FROM Order o "
			+ "JOIN o.orderAddresses oa "
			+ "JOIN o.customerId cusDet "
			+ "JOIN o.keyOrderInformation keyInfo "
			+ "JOIN o.orderItemsAndTerms itemTerms "
			+ "JOIN o.paymentBreakdown payment "
			+ "JOIN o.orderClass oc "
			+ "JOIN o.auxiliaryInformation auxInfo "
			+ "JOIN oa.address oadd "
			+ "JOIN keyInfo.orderCode kioc "
			+ "JOIN keyInfo.sourceCode srcCod "
			+ "JOIN kioc.orderCodes ordCod "
			+ "JOIN itemTerms.subsProdPkgDef subDef "
			+ "JOIN itemTerms.term t "
			+ "JOIN payment.rateCard rc "
			+ "WHERE (ordCod.orderCode LIKE '%'||:keyword||'%') OR (srcCod.sourceCode LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(keyInfo.orderStatus, ' ', keyInfo.orderCategory, ' ', keyInfo.purchaseOrder, ' ', COALESCE(keyInfo.agent, '')) LIKE '%'||:keyword||'%') OR "
			+ "(keyInfo.orderDate LIKE '%'||:keyword||'%') OR "
			+ "(keyInfo.agentReferenceNum LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(oadd.addressName, ' ', oadd.name, ' ', oadd.addressLine1, ' ', COALESCE(oadd.addressLine2, ''), ' ', oadd.city, ' ', oadd.state, ' ', oadd.country, ' ', oadd.phone) LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(oadd.zipCode, ' ', oadd.countryCode) LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(o.orderType, ' ', o.orderStatus) LIKE '%'||:keyword||'%') OR "
			+ "(o.orderId LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(subDef.subscriptionDefCode, ' ', t.term, ' ', itemTerms.numOfIssues, ' ', itemTerms.copiesPerIssue, ' ', itemTerms.validFrom, ' ', itemTerms.validTo, ' ', "
			+ "COALESCE(itemTerms.liabilityIssue, ''), ' ', COALESCE(itemTerms.extendedIssue, '')) LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(rc.rateCard, ' ', payment.paymentStatus, ' ', payment.netAmount) LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(oc.orderClassName, ' ', oc.ocType) LIKE '%'||:keyword||'%') OR "
			+ "(CONCAT(cusDet.fname, ' ', cusDet.lname, ' ', cusDet.initialName, ' ', cusDet.company, ' ', cusDet.email, ' ', cusDet.primaryPhone) LIKE '%'||:keyword||'%') OR "
			+ "(auxInfo.orderAuxJSON LIKE '%'||:keyword||'%') "
			+ "GROUP BY o.orderId")
	public Page<Order> findOrdersBySearch(@Param("keyword") String keyword, Pageable page);
	
}
















