package com.diggingsarustudio.example.jdo.shared;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.diggingsarustudio.example.jdo.shared.User;

//Serializable object and persistence capable object declaration
@PersistenceCapable
public class Manager extends User {
	
	@Persistent(serialized = "true")		//Declare this serializable class as a Blob value. 
											//	It isn't indexed and can't be used in query filters and sort orders.
	private Schedule	schedule;
	
	@Persistent								//Declare a PersistenceCapable object as field
	private Project		currentProject;

	public Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Project getCurrentProject() {
		return this.currentProject;
	}

	public void setCurrentProject(Project currentProject) {
		this.currentProject = currentProject;
	}	
	
	
	
}
