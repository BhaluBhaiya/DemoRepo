package com.mphasis.Day3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		LocalTime t1 = LocalTime.of(22, 46);
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.of(12, 25, 25);
		System.out.println(t2);
		System.out.println(t2.getHour());
		System.out.println(t2.getMinute());
		System.out.println(t2.getSecond());
		
		String strTime = "11:56:17";
		LocalTime timeStr = LocalTime.parse(strTime);
		System.out.println(timeStr);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime = time.format(df);
		System.out.println(formattedTime);
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
		
	}
}
