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

	@Query(value = "SELECT m.order_id, o.suspend_order_id FROM orders_to_be_suspended o RIGHT JOIN multi_line_item_order m ON m.order_id = o.order_id WHERE m.parent_order_id = :parentOrderId AND\r\n"
			+ "m.order_id NOT IN (SELECT o.order_id FROM orders_to_be_suspended o JOIN multi_line_item_order m ON m.order_id = o.order_id WHERE m.parent_order_id = :parentOrderId AND o.is_valid IS TRUE)\r\n"
			+ "UNION\r\n"
			+ "SELECT m.order_id, o.suspend_order_id FROM orders_to_be_suspended o JOIN multi_line_item_order m ON m.order_id = o.order_id WHERE m.parent_order_id = :parentOrderId AND o.is_valid IS TRUE\r\n",
			countQuery = "SELECT COUNT(*) AS row_count\r\n"
					+ "FROM (\r\n"
					+ "    SELECT m.order_id, o.suspend_order_id\r\n"
					+ "    FROM orders_to_be_suspended o\r\n"
					+ "    RIGHT JOIN multi_line_item_order m ON m.order_id = o.order_id\r\n"
					+ "    WHERE m.parent_order_id = :parentOrderId\r\n"
					+ "    AND m.order_id NOT IN (\r\n"
					+ "        SELECT o.order_id\r\n"
					+ "        FROM orders_to_be_suspended o\r\n"
					+ "        JOIN multi_line_item_order m ON m.order_id = o.order_id\r\n"
					+ "        WHERE m.parent_order_id = :parentOrderId\r\n"
					+ "        AND o.is_valid IS TRUE\r\n"
					+ "    )\r\n"
					+ "    UNION\r\n"
					+ "    SELECT m.order_id, o.suspend_order_id\r\n"
					+ "    FROM orders_to_be_suspended o\r\n"
					+ "    JOIN multi_line_item_order m ON m.order_id = o.order_id\r\n"
					+ "    WHERE m.parent_order_id = :parentOrderId\r\n"
					+ "    AND o.is_valid IS TRUE\r\n"
					+ ") AS subquery;\r\n"
					+ "",
			nativeQuery = true)
	Page<Object[]> findAllOrdersByIdWithSuspensionDet(@Param("parentOrderId") Integer parentOrderId, Pageable page);

}
