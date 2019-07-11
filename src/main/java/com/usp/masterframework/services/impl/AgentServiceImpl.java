package com.usp.masterframework.services.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usp.masterframework.documents.Agent;
import com.usp.masterframework.repositories.AgentRepository;
import com.usp.masterframework.services.AgentService;


@Service
public class AgentServiceImpl implements AgentService {

	@Autowired
	private AgentRepository agentRepository;
	
	
	@Override
	public List<Agent> listAll() {
		return this.agentRepository.findAll();
	}

	@Override
	public Optional <Agent> listById(Integer id) {
		return this.agentRepository.findById(id);
	}

	@Override
	public Agent register(Agent agent) {
		return this.agentRepository.save(agent);
	}

	@Override
	public Agent update(Agent agent) {
		return this.agentRepository.save(agent);
	}

	@Override
	public void remove(Integer id) {
		this.agentRepository.deleteById(id);
	}

}
