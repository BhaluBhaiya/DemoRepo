package com.example.Simpleapp.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Simpleapp.entities.Employee;
import com.example.Simpleapp.repository.EmployeeRepository;
@Service
public class EmployeeService {
	
    @Autowired
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	public Employee findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	public Employee save(Employee employee) {
		return repository.save(employee);
	}
	
	public Employee findByEname(String name) {
		return repository.findByEmployeeName(name);
		
	}
	
	
}
