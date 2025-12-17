package com.demo.SpringApp.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.SpringApp.controller.EmployeeController;
import com.demo.SpringApp.dao.EmployeeDao;
import com.demo.SpringApp.entities.Employee;
import com.demo.SpringApp.repositories.EmployeeRepository;

public class EmployeeService implements EmployeeServiceInterface{
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		logger.info("fetching all employee");
		return repository.findAll();
	}
	
	public Employee findById(Long id) {
		logger.info("retrieving employee by id");
		return repository.findById(id).get();
	}
	
	public Employee save(Employee employee) {
		logger.info("Saving employee data");
		return repository.save(employee);
	}

	@Override
	public Employee update(Employee emp, Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		
	}

}
