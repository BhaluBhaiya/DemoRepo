package com.mphasis.Day5;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> trst= new TreeSet<Integer>();
		trst.add(45);
		trst.add(66);
		trst.add(97);
		trst.add(34);
		System.out.println(trst);
		trst.add(67);
		trst.add(34);
		trst.add(19);
		trst.add(26);
		System.out.println(trst);
		System.out.println(trst.ceiling(55));
		System.out.println(trst.floor(55));
		
		Iterator<Integer> it = trst.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		
		System.out.println(trst.headSet(55));
		System.out.println(trst.higher(32));
		
		
		Student s1 = new Student(101, "Amit", "Delhi", 85.5);
        Student s2 = new Student(102, "Sneha", "Mumbai", 92.0);
        Student s3 = new Student(103, "Rahul", "Bangalore", 76.8);
        Student s4 = new Student(104, "Priya", "Chennai", 88.3);
        Student s5 = new Student(105, "Karan", "Hyderabad", 81.2);
        
        TreeSet<Student> studentSt = new TreeSet<Student>();
        studentSt.add(s1);
        studentSt.add(s2);
        studentSt.add(s3);
        studentSt.add(s4);
        studentSt.add(s5);
        
        Iterator<Student> itr = studentSt.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
        
	}
	
}
