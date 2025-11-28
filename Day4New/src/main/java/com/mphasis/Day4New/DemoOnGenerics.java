package com.mphasis.Day4New;

import java.util.Arrays;

public class DemoOnGenerics {
	
	public static <T> void display(T data) {
		System.out.println("Data is "+data);
	}
	
	public static <T extends Number,U extends Number> void add(T t1 , U u1) {
		System.out.println(t1);
		System.out.println(u1);
		System.out.println(t1.doubleValue() + u1.doubleValue());
	}
	
	
	
	public static void main(String[] args) {
		
//		Container<String> c1 = new Container<String>();
//		c1.setItem("Bhnlu");
//		
//		Container<Student> c2 = new Container<Student>();
//		Student s1 = new Student();
//		c2.setItem(s1);
//		System.out.println(c2.getItem());
//		
//		Container<Integer> c3 = new Container<Integer>();
//		c3.setItem(44);
//		System.out.println(c3.getItem());
//		
//		Container<Integer[]> c4 = new Container<Integer[]>();
//		Integer[] arr = {5,1,3,4,7,9,8};
//		c4.setItem(arr);
//		System.out.println(Arrays.toString(c4.getItem()));
		
//		Pair<String, Double> p1 = new Pair<String, Double>("distance in km is :",7.3);
//		System.out.println(p1);
//		
//		Student s1 = new Student(123,"Bhanu","B.Tech");
//		Pair<Integer, Student> p2= new Pair<Integer, Student>(1,s1);
//		System.out.println(p2);
		
		
		Order<String> o1 = new Order<String>("Laptop");
		Order<String> o2 = new Order<String>("Mobile");
		
		
		
		Item[] itemArr = new Item[5];
		
		Item i1 = new Item(121,"Laptop", 70000.00);
		Item i2 = new Item(122,"Smartphone", 50000.00);
		Item i3 = new Item(123,"Ipad", 105000.00);
		Item i4 = new Item(124,"Television", 200000.00);
		Item i5 = new Item(125,"Monitor", 65000.00);
		
		itemArr[0] = i1;
		itemArr[1] = i2;
		itemArr[2] = i3;
		itemArr[3] = i4;
		itemArr[4] = i5;
		
		Order<Item[]> o4 = new Order<Item[]>(itemArr);
		System.out.println(Arrays.toString(o4.getItem()));
		System.out.println(o4);
		
		Integer[] nums = {1,9,8,3,7,12,7,4,5,1,5,};
		
		String[] str = {"Student A","Student B","Student C","Student D","Student E","Student F"};
		
		ArrayPrinter<Integer> ap1 = new ArrayPrinter<Integer>(nums);
		ArrayPrinter<String> ap2 = new ArrayPrinter<String>(str);
		
		
		System.out.println(ap1);
		System.out.println(ap2);
		
		add(4.6,5.9);
		
	}
}
