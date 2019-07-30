package com.usp.masterframework.documents;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "routine_activity")
public class RoutineActivity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private Set <Notification> notifications;
	private Set <Measure> measures;
	private Set <Action> actions; //Match X notification take Y measure, for example;
	
	public RoutineActivity() {
		
	}
	
	public Set<Notification> getNotifications() {
		return notifications;
	}


	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}


	public Set<Measure> getMeasures() {
		return measures;
	}


	public void setMeasures(Set<Measure> measures) {
		this.measures = measures;
	}


	public Set<Action> getActions() {
		return actions;
	}


	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}


}
