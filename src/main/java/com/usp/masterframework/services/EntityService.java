package com.usp.masterframework.services;

import java.util.List;
import java.util.Optional;

import com.usp.masterframework.documents.Entity;

public interface EntityService {
	
	 List<Entity> listAll();
	 
	 Optional <Entity> listById(String id);
	 
	 Entity register (Entity entity);
	 
	 Entity update(Entity entity);
	 
	 void remove(String Id);
	 

}
