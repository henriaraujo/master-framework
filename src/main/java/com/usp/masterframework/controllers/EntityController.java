package com.usp.masterframework.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usp.masterframework.documents.Entity;
import com.usp.masterframework.responses.Response;
import com.usp.masterframework.services.EntityService;


@RestController
@RequestMapping(path = "/masterframework/entities")
public class EntityController {

	@Autowired
	private EntityService entityService;
	
	
	@GetMapping
	public ResponseEntity<Response<List<Entity>>> listAll(){
		return ResponseEntity.ok(new Response<List<Entity>>(this.entityService.listAll()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Optional<Entity>>> listById(@PathVariable (name = "id") String id){
		return ResponseEntity.ok(new Response<Optional<Entity>>(this.entityService.listById(id)));
	}

	@PostMapping
	public ResponseEntity<Response <Entity>> register (@Valid @RequestBody Entity entity, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Entity>(errors));
		}
		return ResponseEntity.ok(new Response<Entity>(this.entityService.register(entity)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Entity>> update (@PathVariable (name = "id") int id, @Valid @RequestBody Entity entity,
			BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Entity>(errors));
		}
		entity.setId(id);
		return ResponseEntity.ok(new Response<Entity>(this.entityService.update(entity)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remove (@PathVariable(name = "id") String id){
	  this.entityService.remove(id);
	  return ResponseEntity.ok(new Response<Integer>(1));
	}
	
	
}
