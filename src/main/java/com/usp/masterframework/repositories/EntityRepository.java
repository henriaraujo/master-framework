package com.usp.masterframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usp.masterframework.documents.Entity;

public interface EntityRepository extends JpaRepository <Entity, String> {

	
}
