package com.mphasis.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoOnArrUtilClass {
	public static void main(String[] args) {
		int[]arr = {5,7,9,6,3,4};
		String nums = Arrays.toString(arr);
		System.out.println(nums);
		Arrays.sort(arr);
		for(int x :arr) {
			System.out.println(x);
		}
		
		int[]brr = {5,7,9,6,3,4};
		System.out.println("Are they equal before : "+Arrays.equals(arr, brr));
		
		Arrays.sort(brr);
		System.out.println("Are they equal After : "+Arrays.equals(arr, brr));
		
		int[] crr = Arrays.copyOf(arr, 10);
		for(int x :crr) {
			System.out.println(x);
		}
		
		Arrays.fill(crr, 7);

		for(int x :crr) {
			System.out.println(x);
		}
		
		
	}
}
