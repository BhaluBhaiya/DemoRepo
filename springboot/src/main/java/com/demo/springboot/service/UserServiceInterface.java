package com.demo.springboot.service;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.demo.springboot.entities.User;


public interface UserServiceInterface {
	
	
	public List<User> findAll();
	
	public User findById(Long eid) ;
	public User save(User user) ;

}
