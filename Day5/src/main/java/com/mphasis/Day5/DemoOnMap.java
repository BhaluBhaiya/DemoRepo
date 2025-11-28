package com.mphasis.Day5;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMap {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		HashMap<Integer, String> mpp = new HashMap<Integer, String>();
//		mpp.put(0, "Bhanu");
//		mpp.put(1, "Ayush");
//		mpp.put(7, "Ashish");
//		mpp.put(5, "Daksh");
//		mpp.put(11, "Deepu");
//		mpp.put(null,null);
//		System.out.println(mpp);
//		mpp.put(11, "Bhavya");
//		
//		System.out.println(mpp);
//		System.out.println(mpp.keySet());
//		System.out.println(mpp.values());
//		System.out.println(mpp.entrySet());
//		
//		System.out.println(mpp);
//		System.out.println(mpp.get(7));
//		System.out.println(mpp.getOrDefault(2,"Bhalu"));
//		System.out.println(mpp);
//		
//		Set<Integer>keySt = mpp.keySet();
//		Iterator<Integer>it = keySt.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		
//		Set<String>valueSt =  new HashSet<String>(mpp.values());
//		Iterator<String>itr = valueSt.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		Iterator<Entry<Integer,String>> entItr = mpp.entrySet().iterator();
//		while(entItr.hasNext())
//			System.out.println(entItr.next());
		
//		TreeMap<Integer, Integer> treeMpp = new TreeMap<Integer, Integer>();
//		treeMpp.put(1, 3);
//		treeMpp.put(2, 46);
//		treeMpp.put(3, 31);
//		treeMpp.put(9, 37);
//		treeMpp.put(7, 19);
//		treeMpp.put(5, 46);
//		System.out.println(treeMpp);
//		System.out.println(treeMpp.descendingMap());
//		System.out.println(treeMpp.ceilingEntry(4));
//		
//		System.out.println(treeMpp.hashCode());
//		treeMpp.remove(3);
//		System.out.println(treeMpp);
//		System.out.println(treeMpp.firstKey());
		
		
		
		
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(0, "Bhanu");
		table.put(1, "Ayush");
		table.put(7, "Ashish");
		table.put(5, "Daksh");
		table.put(11, "Deepu");
		table.put(11, "Bhavya");
		System.out.println(table);
		
		Enumeration<Integer> keys = table.keys();
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());
		
		Enumeration<String > values = table.elements();
		while(values.hasMoreElements())
			System.out.println(values.nextElement());
	}
}
