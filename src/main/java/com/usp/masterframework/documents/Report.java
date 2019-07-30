package com.usp.masterframework.documents;

import javax.validation.constraints.NotNull;

public class Report {
	
	@NotNull
	private String  name;
	private String  address;
	private String  description;
	private Integer authorId;
	private Integer gravitity;
	
	
	
	public Report() {
		
	}
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthor(Integer authorId) {
		this.authorId = authorId;
	}


	public Integer getGravitity() {
		return gravitity;
	}


	public void setGravitity(Integer gravitity) {
		this.gravitity = gravitity;
	}

}
