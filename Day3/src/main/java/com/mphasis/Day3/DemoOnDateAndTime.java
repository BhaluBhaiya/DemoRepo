package com.mphasis.Day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoOnDateAndTime {
	public static void main(String[] args) throws ParseException {
		Date today = new Date();	
		System.out.println(today);
		System.out.println(today);
		
		Date date1 = new Date(2025,01,24);
		Date date2 = new Date(2023,04,20);
		System.out.println(date1.after(date2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		System.out.println(sdf.format(today));
		
		String str = "24-11-2025";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf1.parse(str);
		System.out.println(d);
	}
}    
