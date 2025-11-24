package com.mphasis.Day3;

public class Employee {
	private int empId;
	private String empName;
	private String empDeg;
	private String location;
	private double salary;
	public Employee(int empId, String empName, String empDeg, String location, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDeg = empDeg;
		this.location = location;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDeg() {
		return empDeg;
	}
	public void setEmpDeg(String empDeg) {
		this.empDeg = empDeg;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDeg=" + empDeg + ", location=" + location
				+ ", salary=" + salary + "]";
	}
	
	
	
}
