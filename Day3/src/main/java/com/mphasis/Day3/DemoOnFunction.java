package com.mphasis.Day3;

import java.util.function.Function;

public class DemoOnFunction {
	public static void main(String[] args) {
		Function<Integer, Integer> sqFunc = (num) -> num * num;
		int[] arr = { 5, 5, 4, 8, 2, 3, 9, 7, 1, 6 };
		for (int x : arr)
			System.out.println(sqFunc.apply(x));

		Employee emp1 = new Employee(121, "Bhanu", "SDE I", "Noida", 85000);
		Employee emp2 = new Employee(123, "Ayush", "Software Tester", "Gurugram", 110000);
		Employee emp3 = new Employee(125, "Ashish", "SDE II", "Banglore", 165000);
		Employee emp4 = new Employee(127, "Deepanshu", "SDE II", "Mumbai", 150000);
		Employee emp5 = new Employee(129, "MR. Subhash", "Accounts Manager", "Gurgaon", 95000);

		Employee empArr[] = { emp1, emp2, emp3, emp4, emp5 };

		Function<Employee, String> upperCase = (emp) -> emp.getEmpName().toUpperCase();

		for (Employee emp : empArr) {
			System.out.println(upperCase.apply(emp));
		}

		Function<Integer, Integer> add20 = (num) -> num + 20;
		System.out.println(sqFunc.andThen(add20).apply(7));

		Function<Employee, Employee> checkSal = (emp) -> {
			if (emp.getSalary() > 90000)
				return emp;
			else
				return null;
		};
		for(Employee e: empArr) {
			System.out.println(checkSal.apply(e));
		}

	}
}
