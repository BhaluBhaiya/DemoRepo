package com.demo.SpringApp.services;

import java.util.List;

import com.demo.SpringApp.entities.Employee;

public interface EmployeeServiceInterface {
	
	public List<Employee> findAll();
	public Employee findById(Long id);
	public Employee save(Employee emp);
	public Employee update(Employee emp , Long Id);
	public void delete(Long Id);

}
