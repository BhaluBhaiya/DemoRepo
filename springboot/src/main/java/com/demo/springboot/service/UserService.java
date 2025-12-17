package com.demo.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.entities.User;
import com.demo.springboot.repository.UserInterface;

@Service
public class UserService implements UserServiceInterface{
	//private static final Logger logger=LoggerFactory.getLogger(UserService.class);
	@Autowired
	UserInterface repository;
	
	public List<User> findAll(){
		//logger.info("Fetching all Employees");
		return repository.findAll();
	}
	
	public User findById(Long eid) {
		//logger.info("Retrieving Employee by Id");
		return repository.findById(eid).get();
	}
	
	public User save(User user) {
		//logger.info("Saving an Employee");
		return repository.save(user);
	}
}
