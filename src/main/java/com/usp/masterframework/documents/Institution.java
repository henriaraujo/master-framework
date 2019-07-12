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
	
	
	@OneToMany(mappedBy = "institution") 
	@JsonManagedReference
	@ElementCollection
	private Set<Agent> agents;
	
	public Institution() {
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

}
