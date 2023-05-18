package com.mps.think.setup.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SuspendOrder;

@Repository
public interface SuspendOrderRepo extends JpaRepository<SuspendOrder, Integer> {
	
	@Query("SELECT s FROM SuspendOrder s WHERE s.isSuspended IS FALSE AND DATE(s.suspendedfrom) <= :currentDate "
			+ "AND (s.suspendedTo IS NULL OR DATE(s.suspendedTo) >= :currentDate)")
	List<SuspendOrder> getAllNonSuspendedOrders(@Param("currentDate") Date currentDate);
	
	@Query("SELECT s FROM SuspendOrder s WHERE s.isSuspended IS TRUE AND s.suspendedTo IS NOT NULL AND DATE(s.suspendedTo) < :currentDate")
	List<SuspendOrder> getAllOrdersToContinue(@Param("currentDate") Date currentDate);

}
