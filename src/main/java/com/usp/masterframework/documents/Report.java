package com.usp.masterframework.documents;

public class Report {
	String address;
	String description;
	User author;
	
	public Report() {
		
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
	
	public User getAuthor() {
		return author;
	}


	public void setAuthor(User author) {
		this.author = author;
	}

}
