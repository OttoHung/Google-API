package com.diggingsarustudio.example.jdo.shared;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


public class Project{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private	Key			key;
	
	@Persistent
	protected String	name;
	@Persistent
	protected Date		commencementDate;
	@Persistent
	protected Date		complementDate;
	@Persistent
	protected Integer	budget;
	
	
	public Key getKey(){
		return this.key;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Date getCommencementDate(){
		return this.commencementDate;
	}
	
	public void setCommencementDate(Date commencementDate){
		this.commencementDate = commencementDate;
	}
	
	public Date getCompleteDate(){
		return this.complementDate;
	}
	
	public void setCompleteDate(Date completeDate){
		this.complementDate = completeDate;
	}
	
	public Integer getBudget(){
		return this.budget;
	}
	
	public void setBudget(Integer budget){
		this.budget = budget;
	}
}
