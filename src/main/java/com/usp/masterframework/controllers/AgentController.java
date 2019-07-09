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

import com.usp.masterframework.documents.Agent;
import com.usp.masterframework.responses.Response;
import com.usp.masterframework.services.AgentService;

@RestController
@RequestMapping(path = "/masterframework/agents")
public class AgentController {

	@Autowired
	private AgentService agentService;
	
	@GetMapping
	public ResponseEntity<Response<List<Agent>>> listAll(){
		return ResponseEntity.ok(new Response<List<Agent>>(this.agentService.listAll()));
	}
	
	// Just for Test
	@GetMapping(path = "/test")
	public ResponseEntity<Response<String>> teste(){
		return ResponseEntity.ok(new Response<String>("TESTE!"));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Optional<Agent>>> listById(@PathVariable (name = "id") String id){
		return ResponseEntity.ok(new Response<Optional<Agent>>(this.agentService.listById(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response <Agent>> register (@Valid @RequestBody Agent agent, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Agent>(errors));
		}
		return ResponseEntity.ok(new Response<Agent>(this.agentService.register(agent)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Agent>> update (@PathVariable (name = "id") String id, @Valid @RequestBody Agent agent,
			BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Agent>(errors));
		}
		agent.setId(id);
		return ResponseEntity.ok(new Response<Agent>(this.agentService.update(agent)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remove (@PathVariable(name = "id") String id){
	  this.agentService.remove(id);
	  return ResponseEntity.ok(new Response<Integer>(1));
	}
	
}
