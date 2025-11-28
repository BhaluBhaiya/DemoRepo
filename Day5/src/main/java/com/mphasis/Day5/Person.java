package com.mphasis.Day5;

public final class Person {
	private final String name;
	private final int  uid;
	public Person(String name , int uid) {
		super();
		this.name = name;
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public int getUid() {
		return uid;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", uid=" + uid + "]";
	}
	
	
}
