package com.mphasis.Day3;

import java.util.function.Predicate;

public class DemoOnPredicate {
	public static void main(String[] args) {
		Predicate<Integer> isEven = (a) -> a % 2 == 0;
		System.out.println(isEven.test(732) ? "Even" : "Odd");

		if (isEven.test(2411))
			System.out.println("Even");
		else
			System.out.println("False");

		Predicate<String> checkLen = (str) -> str.length() > 7;
		String str = "Bhuvan";
		System.out.println(checkLen.test("Bhalubhaiya"));

		Employee emp1 = new Employee(121, "Bhanu", "SDE I", "Noida", 85000);
		Employee emp2 = new Employee(123, "Ayush", "Software Tester", "Gurugram", 110000);
		Employee emp3 = new Employee(125, "Ashish", "SDE II", "Banglore", 165000);
		Employee emp4 = new Employee(127, "Deepanshu", "SDE II", "Mumbai", 150000);
		Employee emp5 = new Employee(129, "MR. Subhash", "Accounts Manager", "Gurgaon", 95000);

		Employee empArr[] = { emp1, emp2, emp3, emp4, emp5 };

		Predicate<Employee> checkSal = (emp) -> emp.getSalary() > 90000;

		for (Employee emp : empArr) {
			if (checkSal.test(emp))
				System.out.println(emp.getEmpName());
		}
	}

}
