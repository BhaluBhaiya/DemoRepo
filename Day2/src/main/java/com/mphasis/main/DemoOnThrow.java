package com.mphasis.main;

public class DemoOnThrow {
	private static void checkMethod(int a, int[] b) {
		for(int i =0; i<b.length;i++) {
			if(b[i] ==0)
				throw new ArithmeticException();
			else if(i++ > b.length)
				throw new ArrayIndexOutOfBoundsException();
			else 
				System.out.println(a/b[i]);
		}
		
	}
	public static void main(String[] args) {
		int a = 51, b[] = {2,5,3,4,6,8,9};
		checkMethod(a,b);
	}

}
