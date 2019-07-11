package com.usp.masterframework.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usp.masterframework.documents.Agent;
import com.usp.masterframework.documents.Institution;
import com.usp.masterframework.repositories.InstitutionRepository;
import com.usp.masterframework.services.InstitutionService;

@Service
public class InstitutionServiceImpl implements InstitutionService{

	

	@Autowired
	private InstitutionRepository institutionRepository;
	
	
	@Override
	public List<Institution> listAll() {
		return this.institutionRepository.findAll();
	}

	@Override
	public Optional <Institution> listById(String id) {
		return this.institutionRepository.findById(id);
	}

	@Override
	public Institution register(Institution institution) {
		return this.institutionRepository.save(institution);
	}

	@Override
	public Institution update(Institution institution) {
		return this.institutionRepository.save(institution);
	}

	@Override
	public void remove(String id) {
		this.institutionRepository.deleteById(id);
	}

	@Override
	public List<Agent> listAllInstitutionAgents(String id) {
		return this.institutionRepository.findById(id).get().getAgents();
	}
	
}
