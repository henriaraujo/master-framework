package com.usp.masterframework.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usp.masterframework.documents.Agent;
import com.usp.masterframework.documents.Entity;
import com.usp.masterframework.repositories.EntityRepository;
import com.usp.masterframework.services.EntityService;

@Service
public class EntityServiceImpl implements EntityService{

	

	@Autowired
	private EntityRepository entityRepository;
	
	
	@Override
	public List<Entity> listAll() {
		return this.entityRepository.findAll();
	}

	@Override
	public Optional <Entity> listById(String id) {
		return this.entityRepository.findById(id);
	}

	@Override
	public Entity register(Entity entity) {
		return this.entityRepository.save(entity);
	}

	@Override
	public Entity update(Entity entity) {
		return this.entityRepository.save(entity);
	}

	@Override
	public void remove(String id) {
		this.entityRepository.deleteById(id);
	}

	@Override
	public List<Agent> listAllEntityAgents(String id) {
		return this.entityRepository.findById(id).get().getAgents();
	}
	
}
