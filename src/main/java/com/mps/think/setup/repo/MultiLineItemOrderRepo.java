package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mps.think.setup.model.MultiLineItemOrder;

public interface MultiLineItemOrderRepo extends JpaRepository<MultiLineItemOrder, Integer> {

	MultiLineItemOrder findByOrderOrderId(Integer orderId);
	
	List<MultiLineItemOrder> findByParentOrderId(Integer parentId);
	
}
