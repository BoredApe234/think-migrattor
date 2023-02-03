package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.IssueGeneration;
@Repository
public interface IssueGenerationRepo extends JpaRepository<IssueGeneration, Integer> {

	@Query(value="SELECT MAX(seq_of_issue) FROM THINK_SETUP.issue_generation",nativeQuery = true)
	int findMaxSeqOfIssue();
}
