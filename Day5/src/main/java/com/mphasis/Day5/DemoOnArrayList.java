package com.mphasis.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {
	public static void main(String[] args) {
//		ArrayList alist = new ArrayList();
//		alist.add(56);
//		alist.add("Bhanu");
//		alist.add(true);
//		alist.add(73.28);
//		alist.add((float)2/5);
//		Person p = new Person("Bhavya", 15602);
//		alist.add(p);
//		System.out.println(alist);
//		System.out.println(alist.get(2));
//		alist.add(56);
//		alist.add("Bhanu");
//		alist.add(true);
//		alist.add(73.28);
//		alist.add(2/5);
//		System.out.println(alist);
//		ArrayList<String> nameList = new ArrayList<String>();
//		nameList.add("Ayush");
//		nameList.add("Bhanu");
//		nameList.add("Ashish");
//		nameList.add("Deepu");
//		nameList.add("Daksh");
//		nameList.add("Bhavya");
//		System.out.println(nameList);
//		
//		//--------------------------------------------------------------------	
//
//		System.out.println("using enhanced for loop");
//		
//		for(String name : nameList) {
//			System.out.println(name); // using enhanced for loop
//		}
//		
//		//--------------------------------------------------------------------	
//		System.out.println("using Iterator");
//		
//		Iterator<String> it = nameList.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		//--------------------------------------------------------------------	
//		System.out.println("using List Iterator forward");
//		
//		ListIterator<String> lit = nameList.listIterator();
//		
//		while(lit.hasNext()) {
//			System.out.println(lit.next());
//		}
//		
//		//--------------------------------------------------------------------	
//		
//		System.out.println("using List Iterator backward");
//		
//		while(lit.hasPrevious()) {
//			System.out.println(lit.previous());
//			
//		}
//		//--------------------------------------------------------------------	
//		
//		System.out.println(nameList.contains("Daksh"));
//		
//		//--------------------------------------------------------------------	
//		
//		System.out.println("ForEach using lambda");
//		nameList.forEach(name->System.out.println(name));
//		
//		//--------------------------------------------------------------------	
//		
//		System.out.println("ForEach using Method Refrence");
//		nameList.forEach(System.out::println);
//		
//		//--------------------------------------------------------------------	
//		
//		System.out.println("deleted member is : "+ nameList.remove(1));
//		nameList.forEach(System.out::println); 
//
//		//--------------------------------------------------------------------	
//		
//		Integer[] nums1 = {6,4,9,2,4,7,9,12};
//		Integer[] nums2 = {9,7,5,6,1,3,8,2,6};
//		
//		List<Integer> numsList1 = new ArrayList<Integer>(Arrays.asList(nums1));
//		List<Integer> numsList2 = new ArrayList<Integer>(Arrays.asList(nums2));
//		
//		System.out.println("Before retainAll operation"+numsList1);
//		numsList1.retainAll(numsList2);
//		System.out.println("After retainAll operation"+numsList1);
//		
//		//--------------------------------------------------------------------	
//
//		System.out.println("Before sort operation : "+nameList);
//		Collections.sort(nameList);
//		System.out.println("After sort operation : "+nameList);
		
		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(101, "Amit", "Delhi", 85.5));
        studentList.add(new Student(102, "Sneha", "Mumbai", 92.0));
        studentList.add(new Student(103, "Rahul", "Bangalore", 76.8));
        studentList.add(new Student(104, "Priya", "Chennai", 88.3));
        studentList.add(new Student(105, "Karan", "Hyderabad", 81.2));
        
        for(Student s : studentList)
        	System.out.println(s);
		
	}
}
