package com.mphasis.Day5;

public class DemoOnMutableClass {
	public static void main(String[] args) {
		System.out.println("Immutable class creation");
		System.out.println("1.Class need to be final." 
				+ "\n2.Properties need to be private final."
				+ "\n3.Properties need to get their values only using constructors."
				+ "\n4.No setters given/defined.");
		Person p1 = new Person("Bhanu Pratap", 421);
		System.out.println(p1);

	}
}
