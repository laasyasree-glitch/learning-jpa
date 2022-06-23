package com.learning.jpa.example.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learning.jpa.example.jpain10steps.entity.User;

@Repository
@Transactional //Can be used on both classes and methods 
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entitymanager;//Tracks those objects which are persistent
	
	public long insert(User user) {
		//Open Transaction
		entitymanager.persist(user); 
		//Close Transaction
		return user.getId();
	}
	
	
}

/*
 * Spring Data JPA
public class SomeEntityDAOService {
	
	@PersistenceContext
	private EntityManager entitymanager;//Tracks those objects which are persistent
	
	public long insert(EntityUser user) {
		//Open Transaction
		entitymanager.persist(user); 
		//Close Transaction
		return user.getId();
	}
	
	
}
*/