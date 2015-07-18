package com.diggingsarustudio.example.jdo.shared;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.Embedded;
import javax.jdo.annotations.EmbeddedOnly;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

//Embedded class declaration
@PersistenceCapable
public class Developer extends User {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private	Key	key;
	
	@PersistenceCapable
	@EmbeddedOnly							//Declare this class only can be used as an embedded class which does not need a primary key
											//	because it is not stored as a separate entity.
	public static class InChargeTask{
		@Persistent							//The fields are stored as properties on the entity, using the name of each field and the name of corresponding property.
		private	Integer	id;
		@Persistent
		private	String	work;
		
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getWork() {
			return work;
		}
		
		public void setWork(String work) {
			this.work = work;
		}
	}
	
	@Persistent
	@Embedded									//Use embedded class
	protected	InChargeTask 	currentTask;
	
	
	@Persistent
	@Embedded(members = {															//Specify new name to prevent conflict with the object declared above.
			@Persistent(name = "id", columns = @Column(name = "previousId")),		//Because the embedded class's persistent properties are stored on the 
			@Persistent(name = "work", columns = @Column(name = "previousWork")),	//	same entity as the other fields, you can use persistent fields of the 
																					//	embedded class in JDOQL query filters and sort orders. 
																					//You can refer to the embedded field using the name of the outer field, 
																					//	a dot (.), and the name of the embedded field. 
																					//For example, previousWork.work == "UI development"
																					//This works whether or not the property names for the embedded fields have 
																					//	been changed using @Column annotations.
			
	})
	protected	InChargeTask	previousTask;
	

	public Key getKey() {
		return this.key;
	}


	public InChargeTask getCurrentTask() {
		return this.currentTask;
	}


	public void setCurrentTask(InChargeTask currentTask) {
		this.currentTask = currentTask;
	}


	public InChargeTask getPreviousTask() {
		return this.previousTask;
	}


	public void setPreviousTask(InChargeTask previousTask) {
		this.previousTask = previousTask;
	}

}
