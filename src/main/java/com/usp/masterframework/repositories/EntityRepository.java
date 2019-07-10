package com.usp.masterframework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.usp.masterframework.documents.Entity;

public interface EntityRepository extends MongoRepository<Entity, String> {

	
}
