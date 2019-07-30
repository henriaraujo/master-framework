package com.usp.masterframework.documents;

public class Alert {
 
	private String description;
	public enum Status {
		ACTIVED, DESACTIVED;
	} 
	
	
	public Alert() {
		
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
