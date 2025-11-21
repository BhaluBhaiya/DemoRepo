package com.mphasis.Day1;

public class Employee {
	private String empName;
	private Integer empId;
	private String desg;
	private String mobileNum;

	
	public Employee(String empName, Integer empId, String desg, String mobileNum) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desg = desg;
		this.mobileNum = mobileNum;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getMobile() {
		return mobileNum;
	}

	public void setMobile(String mobile) {
		this.mobileNum = mobile;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", desg=" + desg + ", mobile=" + mobileNum + "]";
	}
}
