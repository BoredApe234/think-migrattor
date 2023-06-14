package com.mps.think.setup.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.AddressStatus;


@Repository
public interface AddressStatusRepo extends JpaRepository<AddressStatus, Integer>{
	
	List<AddressStatus> findByPubIdId(Integer pubId);

}
