package com.mphasis.main;

public class Person {
	private String name;
	private int pID;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int pID, int age) {
		super();
		this.name = name;
		this.pID = pID;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pID=" + pID + ", age=" + age + "]";
	}
	public void checkElegibility() {
		// TODO Auto-generated method stub
		
	}
}
