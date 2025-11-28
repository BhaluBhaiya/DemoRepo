package com.mphasis.Day5;

public class Student implements Comparable<Student>{
	public int sid;
	public String sname;
	public String city;
	public double marks;

	public Student(int sid, String sname, String city, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getCity() {
		return city;
	}
	public double getMarks() {
		return marks;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	@Override
	public int compareTo(Student o) {
		return this.sname.compareTo(o.sname);
	}
	
	
	
}
