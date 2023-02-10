package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.SourceAttributeValues;
@Repository
public interface SourceAttributeValuesRepo extends JpaRepository<SourceAttributeValues, Integer> {

}
