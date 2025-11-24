package com.mphasis.Day3;

import java.util.Arrays;

interface MyComparator {
//	public int salComparator(Employee emp1, Employee emp2);
	public int nameComparator(Employee emp1, Employee emp2);
};

public class App {
	public static void main(String[] args) {
		Employee empArr[] = new Employee[5];

		Employee emp1 = new Employee(121, "Bhanu", "SDE I", "Noida", 85000);
		Employee emp2 = new Employee(123, "Ayush", "Software Tester", "Gurugram", 110000);
		Employee emp3 = new Employee(125, "Ashish", "SDE II", "Banglore", 165000);
		Employee emp4 = new Employee(127, "Deepanshu", "SDE II", "Mumbai", 150000);
		Employee emp5 = new Employee(129, "MR. Subhash", "Accounts Manager", "Gurgaon", 90000);

		empArr[0] = emp1;
		empArr[1] = emp2;
		empArr[2] = emp3; // Employee empArr[] ={emp1,emp2,emp3,emp4,emp5};
		empArr[3] = emp4;
		empArr[4] = emp5;

//		MyComparator comparator = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
		MyComparator comparator = (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName());
//
		Arrays.sort(empArr, (e3, e4) -> comparator.nameComparator(e3, e4));
		for (Employee emp : empArr) {
			System.out.println(emp);
		}

	}
}
