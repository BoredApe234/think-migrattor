package com.mps.think.setup.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.IssueGeneration;
@Repository
public interface IssueGenerationRepo extends JpaRepository<IssueGeneration, Integer> {

	@Query(value="SELECT MAX(seq_of_issue) FROM think_setup_new.issue_generation where order_class_id=:ocId",nativeQuery = true)
	int findMaxSeqOfIssue(@Param("ocId") Integer ocId);
}
