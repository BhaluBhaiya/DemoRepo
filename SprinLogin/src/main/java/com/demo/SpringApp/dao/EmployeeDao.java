package com.demo.SpringApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.SpringApp.entities.Employee;
import com.demo.SpringApp.repositories.EmployeeRepository;

public class EmployeeDao implements EmployeeDaoInterface{
	
	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		return repository.save(emp);
	}

	@Override
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		return repository.save(emp);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
