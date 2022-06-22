package com.learning.jpa.example.jpain10steps;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.example.jpain10steps.entity.User;
import com.learning.jpa.example.jpain10steps.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class UserDOVserviceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(UserDOVserviceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack","Admin");
		long insert = userDaoService.insert(user);
		System.out.println(user);
		log.info("New USer is created : "+user);
	}

}
