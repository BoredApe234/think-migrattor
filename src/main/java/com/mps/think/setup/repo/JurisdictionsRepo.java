package com.mps.think.setup.repo;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mps.think.setup.model.Jurisdictions;

@Repository
public interface JurisdictionsRepo extends JpaRepository<Jurisdictions , Integer> {
	
	public Jurisdictions findJurisdictionsById(Integer id);

	List<Jurisdictions> findByPubIdId(Integer pubId);
	
    @Query( value ="SELECT e FROM Jurisdictions  WHERE e.created_at BETWEEN  :today  AND  =  :yesterday" ,nativeQuery = true)
    List<Jurisdictions> findTodayAndYesterdayRecords(@Param("today") LocalDate today, @Param("yesterday") LocalDate yesterday);

}
