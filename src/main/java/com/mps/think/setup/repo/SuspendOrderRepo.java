package com.mps.think.setup.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SuspendOrder;

@Repository
public interface SuspendOrderRepo extends JpaRepository<SuspendOrder, Integer> {

	@Query(value = "SELECT m.order_id, o.suspend_order_id FROM multi_line_item_order m LEFT JOIN orders_to_be_suspended o ON o.order_id = m.order_id "
			+ "WHERE m.parent_order_id = :parentOrderId AND o.is_valid IS TRUE AND (o.is_reinstated IS NULL || o.is_reinstated IS FALSE)",
			countQuery = "SELECT COUNT(*) FROM multi_line_item_order m LEFT JOIN orders_to_be_suspended o ON o.order_id = m.order_id "
					+ "WHERE m.parent_order_id = :parentOrderId AND o.is_valid IS TRUE AND (o.is_reinstated IS NULL || o.is_reinstated IS FALSE)",
			nativeQuery = true)
	Page<Object[]> findAllOrdersByIdWithSuspensionDet(@Param("parentOrderId") Integer parentOrderId, Pageable page);

}
