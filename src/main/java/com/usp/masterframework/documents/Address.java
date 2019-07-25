package com.usp.masterframework.documents;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "address")
public class Address {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 
	 @NotNull
	 private String name;
	 public void setName() {
		 
	 }

	private String latitude;
	private String longitude;
	 
	 
	 public Address(String name) {
		 this.name = name;
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
	

	public String getLatitude() {
		return latitude;
	}

	public void setLat(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLon(String longitude) {
		this.longitude = longitude;
	}
}
