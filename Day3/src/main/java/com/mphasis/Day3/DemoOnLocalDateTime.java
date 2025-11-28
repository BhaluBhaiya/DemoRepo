package com.mphasis.Day3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		String str = "2025-11-03 19:16:15 a";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dt1 = LocalDateTime.of(2025, 11, 03, 19, 16, 15);
		System.out.println(dt1);

		String formattedDT = dt.format(dtf);
		String formattedDT1 = dt1.format(dtf);
		
		
		System.out.println(formattedDT);
		System.out.println(formattedDT1);
		
		String str1 = "2025-11-03 19:16:15";
		LocalDateTime parsedDT = LocalDateTime.parse(str1, dtf);
		System.out.println(parsedDT);
	}
}
