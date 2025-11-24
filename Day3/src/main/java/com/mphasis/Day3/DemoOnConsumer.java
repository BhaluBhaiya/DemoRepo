package com.mphasis.Day3;

import java.util.Arrays;
import java.util.function.Consumer;

public class DemoOnConsumer {
	public static void main(String[] args) {
		Consumer<Integer> sqCon=(num)->{
			System.out.println(num*num);
		};
		sqCon.accept(7);
		
		Consumer<Integer[]>sortCon=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		
		Integer[] arr= {5,5,4,8,2,3,9,7,1,6};
		sortCon.accept(arr);
		
		Employee emp1 = new Employee(121, "Bhanu", "SDE I", "Noida", 85000);
		Employee emp2 = new Employee(123, "Ayush", "Software Tester", "Gurugram", 110000);
		Employee emp3 = new Employee(125, "Ashish", "SDE II", "Banglore", 165000);
		Employee emp4 = new Employee(127, "Deepanshu", "SDE II", "Mumbai", 150000);
		Employee emp5 = new Employee(129, "MR. Subhash", "Accounts Manager", "Gurgaon", 90000);
		
		Employee empArr[] ={emp1,emp2,emp3,emp4,emp5};
		
		Consumer<Employee[]>printCon=(err)->{
			for(Employee emp : empArr) {
				System.out.println(emp.getEmpName());
			}
		};
		
		printCon.accept(empArr);
	}
}
