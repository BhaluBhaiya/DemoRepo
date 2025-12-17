package com.demo.SpringApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringApp.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
