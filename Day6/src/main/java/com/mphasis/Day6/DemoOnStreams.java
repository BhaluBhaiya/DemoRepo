package com.mphasis.Day6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOnStreams {
	public static void main(String[] args) {
//		Integer[] arr = {2,9,7,3,6,4,1,59,465,32,78,4658,34658,465,65,467,483};
//		 List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());
//		 System.out.println(list);
////		 ------------------------- Own Comparator----------------------------------------------------
//		 
//		 Integer min = Arrays.stream(arr).min((a,b)->a-b).get();
//		 System.out.println(min);
//		 
////		 ------------------------- Built-In Comparator----------------------------------------------------
//		 
//		 min = Arrays.stream(arr).min(Integer::compare).get();
//		 System.out.println(min);
//		 
////		 ------------------------- Built-In Count ----------------------------------------------------
//		 
//		 long cnt = Arrays.stream(arr).count();
//		 System.out.println(cnt);
//		 
////		 ------------------------- Sum of array using reduce----------------------------------------------------
//		 
//		 long sum = Arrays.stream(arr).reduce(0, (a,b)->a+b);
//		 System.out.println(sum);
//
////		 ------------------------- minimum of array using reduce----------------------------------------------------
//		 
//		 System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b));
//	
////		 ------------------------- Maximum of array using reduce----------------------------------------------------
//	
//		 System.out.println(Arrays.stream(arr).reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b));
//		 
////		 ------------------------- Intermediate Operations ----------------------------------------------------
////		 1. Filter
//		 Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
//		 
////		 2. Map
//		 Stream.of(arr).map(num->num+10).forEach(System.out::println);
//		 
////		 3. Limit
//		 Stream.of(arr).limit(15).forEach(System.out::println);
//		 
////		 4. Distinct
//		 Stream.of(arr).distinct().forEach(System.out::println);
//		 System.out.println(Arrays.stream(arr).distinct().count());
//		 
//		 System.out.println(Stream.of(arr).anyMatch(num-> num>5678));
//		 
//		 Integer[] nums = {59,465,32,78,367,465,65,467,483};
//		 List<Integer> num = Arrays.asList(nums);
//		 num.stream().filter(a->a%3==0) //multiple of 3
//		 .distinct() //no duplicate
//		 .skip(2) //skip 2 elements
//		 .forEach(System.out::println);
		 
//		 num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;
		 
		 
		 String names[] = {"Bhuvan","Ashish","Ayush","Bhanu","Daksh","Deepu","Jha"};
		 Arrays.stream(names)
		 .filter(name->name.length()>4)
		 .filter(name->name.startsWith("A"))
		 .sorted(Comparator.reverseOrder())
		 .forEach(System.out::println);
		 
		 Employee emp1 = new Employee(132, "Bhanu", 85000, "SDE-1", "Java");
		 Employee emp2 = new Employee(135, "Ayush", 125000, "Tester", "App Testing");
		 Employee emp3 = new Employee(101, "Ashish", 165000, "SDE-1", "Cloud");
		 Employee emp4 = new Employee(151, "Subhash", 185000, "Manager", "Accounts");
		 Employee emp5 = new Employee(159, "Deepu", 185000, "SDE-2", "BlinkIt");
		 Employee emp6 = new Employee(136, "Deepu", 145000, "SDE-1", "Data Analytic");
		 
		 ArrayList<Employee> eList = new ArrayList<Employee>(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6));
//		 System.out.println(eList);
		 
		 eList.stream().filter(emp->emp.getSalary()>130000).forEach(System.out::println);
		 System.out.println("------------------------------------------------------------- ");
		 eList.stream().filter(emp->emp.getDesg().equals("SDE-1")).forEach(System.out::println);
		 
		 
		 
		 
		 
		 
	}
}
