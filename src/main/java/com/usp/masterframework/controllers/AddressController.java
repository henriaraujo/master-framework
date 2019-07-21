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
import com.usp.masterframework.documents.Address;
import com.usp.masterframework.responses.Response;
import com.usp.masterframework.services.AddressService;

@RestController
@RequestMapping(path = "/masterframework/addresses")
public class AddressController {

	@Autowired
	private AddressService addressService;
  
	
	@GetMapping
	public ResponseEntity<Response<List<Address>>> listAll(){
		return ResponseEntity.ok(new Response<List<Address>>(this.addressService.listAll()));
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Response<Optional<Address>>> listById(@PathVariable (name = "id") Integer id){
		return ResponseEntity.ok(new Response<Optional<Address>>(this.addressService.listById(id)));
	}
	
	@PostMapping
	public ResponseEntity<Response <Address>> register (@Valid @RequestBody Address address, BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Address>(errors));
		}
		return ResponseEntity.ok(new Response<Address>(this.addressService.register(address)));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Response<Address>> update (@PathVariable (name = "id") Integer id, @Valid @RequestBody Address address,
			BindingResult result){
		if(result.hasErrors()) {
			List<String> errors = new ArrayList<String>();
			result.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Address>(errors));
		}
		address.setId(id);
		return ResponseEntity.ok(new Response<Address>(this.addressService.update(address)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remove (@PathVariable(name = "id") Integer id){
	  this.addressService.remove(id);
	  return ResponseEntity.ok(new Response<Integer>(1));
	}
}
