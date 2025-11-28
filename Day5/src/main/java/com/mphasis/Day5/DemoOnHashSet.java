package com.mphasis.Day5;

import java.util.HashSet;
import java.util.Iterator;

public class DemoOnHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(78);
		hs.add(326);
		hs.add(26);
		System.out.println(hs);
		hs.add(45);
		hs.add(21);
		hs.add(37);
		hs.add(12);
		System.out.println(hs);
		for(Integer i : hs) {
			System.out.print(i+" ");
		}
		System.out.println("Using Iterator");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
			System.out.print("\n"+it.next());
		System.out.print("\n");
		
		System.out.println("Using Lambda function");
		hs.forEach(num ->System.out.println(num));
		System.out.println("Using method Refrence");
		hs.forEach(System.out::println);
	}
}
