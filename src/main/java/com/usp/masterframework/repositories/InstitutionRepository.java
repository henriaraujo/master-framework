package com.usp.masterframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usp.masterframework.documents.Institution;

public interface InstitutionRepository  extends JpaRepository<Institution, Integer>{

	
}
