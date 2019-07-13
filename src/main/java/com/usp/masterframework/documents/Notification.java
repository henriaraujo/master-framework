package com.usp.masterframework.documents;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Notification {
	
	public enum Type {
		ADDRESS, SYSTEM // Ad: sensor nao funciona, System: sensor X parou de funcionar
	} 
	
	public enum Status {
		AWAITING_DECITION, DENIED, ACCEPTED;
	} 
	
	
	private String name;
	private int currentStatus;
	
	private String description;
	private User author; 
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "institution_id")
	private Institution institution;
	
	
	public Notification() {
		currentStatus = Status.AWAITING_DECITION.ordinal();
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


	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}



	public int getCurrentStatus() {
		return currentStatus;
	}



	public void setCurrentStatus(int currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
