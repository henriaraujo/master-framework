package com.usp.masterframework.documents;

public class Action {
	
	private Notification notification;
	private Measure measure;
	
  public Action() {
	  
  }

public Notification getNotification() {
	return notification;
}

public void setNotification(Notification notification) {
	this.notification = notification;
}

public Measure getMeasure() {
	return measure;
}

public void setMeasure(Measure measure) {
	this.measure = measure;
}
  
 
}
