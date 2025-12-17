package com.example.Simpleapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NamedQuery(name ="findByEmployeeName",query ="select e from employee e where e.ename =name ")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eid;
	private String ename;
	private double salary;
	
	
	

}
