package com.example.Simpleapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Simpleapp.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long >{
	
	@Query(name = "findByEmployeeName")
	Employee findByEmployeeName(@Param("name") String name);
}
