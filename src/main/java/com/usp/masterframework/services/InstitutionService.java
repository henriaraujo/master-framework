package com.usp.masterframework.services;

import java.util.List;
import java.util.Optional;

import com.usp.masterframework.documents.Agent;
import com.usp.masterframework.documents.Institution;

public interface InstitutionService {
	
	 List<Institution> listAll();
	 
	 Optional <Institution> listById(Integer id);
	 
	 Institution register (Institution institution);
	 
	 Institution update(Institution institution);
	 
	 void remove(Integer id);
	 
	 List<Agent> listAllInstitutionAgents(Integer id);
}
