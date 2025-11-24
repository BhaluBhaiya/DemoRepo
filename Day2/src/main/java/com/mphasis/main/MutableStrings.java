package com.mphasis.main;

import java.io.StreamTokenizer;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableStrings {
	public static void main(String[] args) {
	 StringBuffer buff = new StringBuffer()	;
	 buff.append("Ayush ");
	 buff.append("Bhanu ");
	 buff.append("Ashish ");
	 buff.append("Daksh ");
	 buff.append("Deepu ");
	 buff.append("Bhuvan");
	 
//	 System.out.println(buff);
//	 System.out.println(buff.capacity());
	 
	 StringBuffer sbf = new StringBuffer("name");
	 System.out.println(sbf.capacity());
	 sbf.ensureCapacity(15);
	 System.out.println(sbf.capacity());
	 sbf.ensureCapacity(30);
	 System.out.println(sbf.capacity());
	 
	 
	 StringBuilder sbm = new StringBuilder("Bhanu Pratap");
//	 sbm.replace(7, 12, "***");
	 System.out.println(sbm.reverse());
	 String fru = "Apple,Banana,Mango,Grapes";
	 
	 StringTokenizer token = new StringTokenizer(fru,",");
	 while(token.hasMoreTokens())
		 System.out.println(token.nextToken());;
	
	StringJoiner sj = new StringJoiner(", "); //Delimiter --> ","  (add it in between appends)
	sj.add("Bhanu");
	sj.add("Ayush");
	sj.add("Ashish");
	sj.add("Daksh");
	sj.add("Deepu");
	System.out.println(sj);
	
	
	
	
	
	}
}
