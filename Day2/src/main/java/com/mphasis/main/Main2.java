package com.mphasis.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
//		NameInterface naam =(String name)->{
//			System.out.println(name);
//		};
//		naam.printName("Bhuvan");

//		StrRevInterface str = (String s1)->{
//			System.out.println(new StringBuffer(s1).reverse().toString());
//		};
//		str.printRev("Bhanu");

//		StrRevInterface num = (int n)->{
//			if(n%2 ==0)System.out.println("Even");
//			else System.err.println("Odd");
//		};
//		num.oddEven(12);

//		StrRevInterface num = (int[] nums)->{
//			for(int i:nums)System.out.println(i*i);
//		};
//		int nums[]={2,4,9,7,3,11};
//		num.squareAll(nums);;

//		StrRevInterface s1 = (String[]str1)->{
//			Arrays.sort(str);
//			for(String i :str) {
//				System.out.println(i);
//			};
//		};
//		s1.sortStrings(str);

		String[] str = { "pandu", "daksh", "ashish", "bhanu" };
		StrRevInterface s1 = (String[] str1) -> {
			int[] len = new int[str1.length];
			for (int i = 0; i < str1.length; i++) {
				len[i] = str1[i].length();
			}
			return len;

		};

		int[] lengths = s1.findLen(str);
        System.out.println(Arrays.toString(lengths));

	}
}
