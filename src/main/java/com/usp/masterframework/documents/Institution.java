package com.usp.masterframework.documents;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Id;
@javax.persistence.Entity
@Table(name = "institution")
public class Institution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Name can not be empty")
	private String name;
<<<<<<< HEAD

=======
>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
	@OneToMany(mappedBy = "institution") 
	@JsonManagedReference
	@ElementCollection
	private Set<Agent> agents;
	

	@OneToMany(mappedBy = "institution") 
	@ElementCollection
	@JsonManagedReference
	private Set<Notification> notifications;
	
	
<<<<<<< HEAD
=======
	
	
>>>>>>> 4f9dd696af924de6dbb8731d4625ab00d6b5506a
	public Institution() {
	}
	
	public Institution(Integer id, @NotEmpty(message = "Name can not be empty") String name, Set<Agent> agents) {
		super();
		this.id = id;
		this.name = name;
		this.agents = agents;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Agent> getAgents() {
		return agents;
	}

	public Set<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}

}
