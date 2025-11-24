package com.mphasis.main;

public class DemoOnException {
	public static void main(String[] args) {
		int a  = 45 , b[]= {3,5,9,1};
//		try {
//			for(int x = 0;x<=b.length;x++)
//			System.out.println(a/b[x]);	
//		} catch (ArithmeticException ae) {
//			ae.printStackTrace();
//		}catch (ArrayIndexOutOfBoundsException obe) {
//			obe.printStackTrace();
//		}catch (RuntimeException re) {
//			re.printStackTrace();
//		}
		
		String str = null;
		
		if(str == null)
			throw new NullPointerException();
		else 
			System.out.println(str.charAt(5));
		
		System.out.println("Application closed successfully");
	}
}
