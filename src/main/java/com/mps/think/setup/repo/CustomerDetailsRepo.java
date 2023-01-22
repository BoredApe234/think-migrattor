package com.mps.think.setup.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.CustomerDetails;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails, Integer> {

	public CustomerDetails findBycustomerId(Integer customerId);

	@Query("SELECT c From CustomerDetails c WHERE " 
			+ "(c.fname LIKE '%'||:firstName||'%' OR :firstName IS NULL)"
			+ "AND (c.lname LIKE '%'||:lastName||'%' OR :lastName IS NULL)")
	public Page<CustomerDetails> getAllCustomerDetailsForSearch(@Param("firstName") String firstName,
			@Param("lastName") String lastName, Pageable page);

}
