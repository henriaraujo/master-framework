package com.usp.masterframework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.usp.masterframework.documents.Agent;

public interface AgentRepository extends MongoRepository<Agent, String> {

}
