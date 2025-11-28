package com.mphasis.Day3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Hello {
	public String sayHello() {
		return "Hello Duniya";
	}
}

class NumberTest {
	public int sqNum(int num) {
		return num * num;
	}

	public double getLog(double num) {
		return Math.log(num);
	}

	public boolean isEven(int num) {
		return num % 2 == 0;
	}

	public void printNum(Integer[] arr) {
		for (int x : arr) {
			System.out.println(x);
		}
	}

	public void filtername(String[] arr) {
		for (String s : arr) {
			if (s.charAt(0) == 'A')
				System.out.println(s);
		}
	}

	public void salWithBonus(int[] arr) {
		for (int x : arr) {
			System.out.println(x * 0.5 + x);
		}
	}

	public void passCheck(String[] pass) {
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
		for (String s : pass) {
			if (s.matches(regex))
				System.out.println("Valid Password");
			else
				System.out.println("Not A Valid Password");
		}
	}
}

public class DemoObjectMethodRef {
	public static void main(String[] args) {
		String naam = "Bhuvan Parewa";
		Supplier<Integer> lengthUsingLambda = () -> naam.length();

		Supplier<Integer> lengthUsingMR = naam::length;

		System.out.println(lengthUsingLambda.get());
		System.out.println(lengthUsingMR.get());

		Hello h = new Hello();
		Supplier<String> helloUsingLambda = () -> h.sayHello();
		Supplier<String> helloUsingMR = h::sayHello;

		System.out.println(helloUsingLambda.get());
		System.out.println(helloUsingMR.get());

		NumberTest num = new NumberTest();

		Predicate<Integer> isEvenUsingMR = num::isEven;
		System.out.println(isEvenUsingMR.test(45));

		Function<Integer, Integer> sqNumUsingMR = num::sqNum;
		System.out.println(sqNumUsingMR.apply(12));

		Function<Double, Double> getLogUsingMr = num::getLog;
		System.out.println(getLogUsingMr.apply(6.0));

		Integer[] arr = { 5, 5, 4, 8, 2, 3, 9, 7, 1, 6 };

		Consumer<Integer[]> printUsingMR = num::printNum;
		printUsingMR.accept(arr);

		String[] namesArray = { "Alice", "Bob", "Andrew", "Charlie", "Amanda", "David", "Alex", "Brian", "Angela",
				"Chris" };

		Consumer<String[]> nameStartA = num::filtername;
		nameStartA.accept(namesArray);

		int[] salaries = { 45000, 52000, 60000, 75000, 80000, 90000, 100000, 65000, 72000, 85000 };

		Consumer<int[]> newSal = num::salWithBonus;
		newSal.accept(salaries);

		String[] passwords = { "Abc@1234", "Xyz#9876", "Pass@2025", "Qwerty!56", "Strong$Pwd1", "Hello@World9",
				"Java#Code88", "Secure*Pass7", "MyPwd@123", "Test#Pass99" };

		Consumer<String[]> checkPass = num::passCheck;
		checkPass.accept(passwords);
	}
}
