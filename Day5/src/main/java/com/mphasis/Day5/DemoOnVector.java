package com.mphasis.Day5;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class DemoOnVector {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		System.out.println(vec.capacity());
		for(int i =1; i<=10; i++) {
			vec.add(i);
		}
		System.out.println(vec.capacity());
		vec.add(16);
		System.out.println(vec.capacity());
		
		System.out.println("Converting vectors to Enumeration");
		Enumeration<Integer> enums = vec.elements();
		while(enums.hasMoreElements())
			System.out.print(enums.nextElement()+" ");
		
		
		System.out.println("\nUsing iterator to print collection");
		Iterator<Integer>it = vec.iterator();
		while(it.hasNext()) {
			int num = it.next();
			if(num %3 == 0)it.remove();
			System.out.print(num+" ");
			
		}
		System.out.println("\n"+vec);
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i =1; i<=10; i++) {
			st.push((int) (Math.random()*100));
		}
		System.out.println(st.toString());
		
	}
}
