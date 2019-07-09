package com.usp.masterframework.documents;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

public abstract class Person {

	@Id
	private String id;
	
	@NotEmpty(message = "Name can not be empty")
	private String name;
	
	
	@NotEmpty(message = "Email can not be empty")
	@Email (message = "Invalid Email")
	private String email;
	
	public Person() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
