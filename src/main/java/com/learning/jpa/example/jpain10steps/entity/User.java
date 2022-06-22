package com.learning.jpa.example.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table<-User
@Entity

public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	protected User() {
		//Accepts default constructor
	}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
}
