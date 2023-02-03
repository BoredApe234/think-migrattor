package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.IssueSettings;

@Repository
public interface IssueSettingsRepo extends JpaRepository<IssueSettings, Integer>{

	@Query(value="SELECT * FROM THINK_SETUP.issue_setting where order_class_id=:ocId",nativeQuery = true)
	IssueSettings findByOcId(Integer ocId);
}
