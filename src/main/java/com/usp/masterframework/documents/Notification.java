package com.usp.masterframework.documents;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
=======
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
public class Notification {
	
	public enum Type {
		ADDRESS, SYSTEM // Ad: sensor nao funciona, System: sensor X parou de funcionar
<<<<<<< HEAD

=======
>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
	} 
	
	public enum Status {
		AWAITING_DECITION, DENIED, ACCEPTED;
	} 
	
<<<<<<< HEAD

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

=======
	
>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
	private String name;
	private int currentStatus;
	
	private String description;
<<<<<<< HEAD

	
	@ManyToOne
	@JsonBackReference
	@NotNull
	@JoinColumn(name = "author_id")

=======
>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
	private User author; 
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "institution_id")
	private Institution institution;
	
	
	public Notification() {
		currentStatus = Status.AWAITING_DECITION.ordinal();
<<<<<<< HEAD
		name = "Notification";

=======
>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
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


<<<<<<< HEAD
=======

>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
	public int getCurrentStatus() {
		return currentStatus;
	}

<<<<<<< HEAD
=======


>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
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
