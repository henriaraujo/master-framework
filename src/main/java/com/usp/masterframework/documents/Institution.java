package com.usp.masterframework.documents;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import javax.persistence.Id;


@javax.persistence.Entity
@Table(name = "institution")
public class Institution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(mappedBy = "institution", cascade = CascadeType.ALL)
	private List<Agent> agents;
	
	@NotEmpty(message = "Name can not be empty")
	private String name;
	
	
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

	public List<Agent> getAgents() {
		return agents;
	}

}
