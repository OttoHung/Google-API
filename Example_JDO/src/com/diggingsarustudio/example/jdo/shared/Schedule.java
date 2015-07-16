package com.diggingsarustudio.example.jdo.shared;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {

	/**
	 * this UID is generated automatically.
	 */
	private static final long serialVersionUID = 276216647992392187L;			//Set this class serializable.

	private Date	when;
	private String	where;
	private String	whom;
	
	
	public Date getWhen() {
		return when;
	}
	public void setWhen(Date when) {
		this.when = when;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getWhom() {
		return whom;
	}
	public void setWhom(String whom) {
		this.whom = whom;
	}
	
	
	
	
}
