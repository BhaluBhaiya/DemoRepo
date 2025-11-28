package com.mphasis.Day5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Integer[] arr = { 15, 68, 98, 3, 1, 4, 54, 66, 56, 5,45 };

		LinkedList<Integer> ll1 = new LinkedList<Integer>(Arrays.asList(arr));
		for (int num : arr) {
			ll.add(num);
		}

//		System.out.println("from ll");
//		Iterator<Integer> it = ll.descendingIterator();
//		while (it.hasNext())
//			System.out.println(it.next());
//
//		System.out.println("from ll1");
//		Iterator<Integer> itr = ll1.descendingIterator();
//		while (itr.hasNext())
//			System.out.println(itr.next());
		
		
		
		System.out.println(ll.get(0));
		System.out.println(ll.hashCode());
		ll1.push(12);
		System.out.println(ll1.hashCode());
		System.out.println(ll1.get(0)); 
	}
}
