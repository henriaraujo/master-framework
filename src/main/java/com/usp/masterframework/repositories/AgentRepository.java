package com.usp.masterframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usp.masterframework.documents.Agent;

public interface AgentRepository extends JpaRepository<Agent, String> {

}
