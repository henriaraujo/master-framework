package com.usp.masterframework.documents;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public abstract class Person {

	@NotEmpty(message = "Name can not be empty")
	private String name;
	
	@NotEmpty(message = "Email can not be empty")
	@Email (message = "Invalid Email")
	private String email;
	
	public Person() {
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
