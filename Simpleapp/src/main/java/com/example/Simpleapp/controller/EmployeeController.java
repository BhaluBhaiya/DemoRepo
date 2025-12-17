package com.example.Simpleapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Simpleapp.entities.Employee;
import com.example.Simpleapp.service.EmployeeService;
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/")
	public List<Employee> findAll(){
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Employee findById(Long id) {
		return service.findById(id);
	}
	@PostMapping("/")
	public Employee save(@RequestBody Employee employee) {
		return service.save(employee);
	}
	
//	public Employee findByName(String ename) {
//		return service.findByName();
//	}
	
}
