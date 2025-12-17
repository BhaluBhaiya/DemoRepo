package com.demo.SpringApp.dao;

import java.util.List;
import java.util.Optional;

import com.demo.SpringApp.entities.Employee;


public interface EmployeeDaoInterface {
	public List<Employee> findAll();
	public Optional<Employee> findById(Long id);
	public Employee save(Employee emp);
	public Employee update(Employee emp);
	public void delete(Long id);
}
