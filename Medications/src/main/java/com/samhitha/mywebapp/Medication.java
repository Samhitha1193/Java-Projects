package com.samhitha.mywebapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medication {
	@Id
	@GeneratedValue()
	private long MEDID;
	private String DESCRIPTION;
	public long getMEDID() {
		return MEDID;
	}
	public void setMEDID(long mEDID) {
		MEDID = mEDID;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public Medication(long mEDID, String dESCRIPTION) {
		super();
		MEDID = mEDID;
		DESCRIPTION = dESCRIPTION;
	}
	public Medication() {
		super();
	}
	
	
	
	

}
