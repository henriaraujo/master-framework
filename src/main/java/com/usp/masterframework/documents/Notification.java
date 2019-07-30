package com.usp.masterframework.documents;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Notification extends Report{
	
	
	
	
	public enum Status {
		AWAITING_DECITION, DENIED, ACCEPTED;
	} 

	public enum Priority {
		LOW, MEDIUM, HIGH;
	} 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	//private String name;
	private int currentStatus;
	
	//private String description;

	
	@ManyToOne
	@JsonBackReference
	@NotNull
	@JoinColumn(name = "author_id")
	private User author;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "institution_id")
	private Institution institution;
	
	
	@OneToMany(mappedBy = "notification") 
	@JsonManagedReference
	@ElementCollection
	private Set<Measure> measures;
	
	

	public Notification() {
		super();
		currentStatus = Status.AWAITING_DECITION.ordinal();
	}

	@Override
	public void setAuthorId(Integer authorId) {
		super.setAuthorId(authorId);
	}
	
	@Override
	public String getAddress() {
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		super.setAddress(address);
	}

	@Override
	public Integer getAuthorId() {
		return super.getAuthorId();
	}

	@Override
	public void setAuthor(Integer authorId) {
		super.setAuthor(authorId);
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

}
