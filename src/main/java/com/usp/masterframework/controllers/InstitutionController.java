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

import com.usp.masterframework.documents.Institution;
import com.usp.masterframework.responses.Response;
import com.usp.masterframework.services.InstitutionService;


@RestController
@RequestMapping(path = "/masterframework/entities")
public class InstitutionController {

	@Autowired
	private InstitutionService institutionService;
	
	
	@GetMapping
	public ResponseEntity<Response<List<Institution>>> listAll(){
		return ResponseEntity.ok(new Response<List<Institution>>(this.institutionService.listAll()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Optional<Institution>>> listById(@PathVariable (name = "id") String id){
		return ResponseEntity.ok(new Response<Optional<Institution>>(this.institutionService.listById(id)));
	}

	@PostMapping
	public ResponseEntity<Response <Institution>> register (@Valid @RequestBody Institution institution, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Institution>(errors));
		}
		return ResponseEntity.ok(new Response<Institution>(this.institutionService.register(institution)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Institution>> update (@PathVariable (name = "id") int id, @Valid @RequestBody Institution institution,
			BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Institution>(errors));
		}
		institution.setId(id);
		return ResponseEntity.ok(new Response<Institution>(this.institutionService.update(institution)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remove (@PathVariable(name = "id") String id){
	  this.institutionService.remove(id);
	  return ResponseEntity.ok(new Response<Integer>(1));
	}
	
	
}
