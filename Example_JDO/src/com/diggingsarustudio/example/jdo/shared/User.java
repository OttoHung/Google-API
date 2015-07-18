package com.diggingsarustudio.example.jdo.shared;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

//Java Data Object class declaration
@PersistenceCapable													//Declare this class as capable of being stored and retrieved from datastore with JDO.
public class User {
	
	@PrimaryKey														//Declare this field as Primary key.
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)		//Declare this field are to be stored in the datastore
																	//	and set the key generated automatically.
	private Key key;
	
	@Persistent
	private Integer id;
	@Persistent
	private String	firstName;
	@Persistent
	private String	lastName;
	
	public Key getKey(){
		return this.key;
	}
	
	
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
}
