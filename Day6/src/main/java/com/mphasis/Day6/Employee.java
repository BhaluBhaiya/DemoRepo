package com.mphasis.Day6;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private String desg;
	private String dept;
	public Employee(int empId, String empName, int salary, String desg, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.desg = desg;
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getSalary() {
		return salary;
	}
	public String getDesg() {
		return desg;
	}
	public String getDept() {
		return dept;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", desg=" + desg + ", dept="
				+ dept + "]";
	}
	
}
