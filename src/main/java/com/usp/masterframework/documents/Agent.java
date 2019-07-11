package com.usp.masterframework.documents;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;


@javax.persistence.Entity
@Table(name = "agent_table")
public class Agent extends Person{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "entity_id_table")
	private Entity entity;

	
	public Agent() {
		super();
		
	}
	
	public Entity getEntity() {
		return entity;
	}


	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getName() {

		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String getEmail() {
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		super.setEmail(email);
	}

	
}
