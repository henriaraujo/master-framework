package com.usp.masterframework.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.usp.masterframework.documents.Agent;
import com.usp.masterframework.documents.Institution;

public interface InstitutionService {
	
	 List<Institution> listAll();
	 
	 Optional <Institution> listById(Integer id);
	 
	 Institution register (Institution institution);
	 
	 Institution update(Institution institution);
	 
	 void remove(Integer id);
	 
	 Set<Agent> listAllInstitutionAgents(Integer id);
}
