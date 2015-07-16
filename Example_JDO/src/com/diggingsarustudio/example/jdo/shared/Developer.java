package com.diggingsarustudio.example.jdo.shared;

import javax.jdo.annotations.Embedded;
import javax.jdo.annotations.EmbeddedOnly;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Developer extends User {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private	Key	key;
	
	@PersistenceCapable
	@EmbeddedOnly
	public static class InChargeTask{
		@Persistent
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
	@Embedded
	protected	InChargeTask inChargeTask;

	public Key getKey() {
		return key;
	}

	public InChargeTask getInChargeTask() {
		return inChargeTask;
	}

	public void setInChargeTask(InChargeTask inChargeTask) {
		this.inChargeTask = inChargeTask;
	}
}
