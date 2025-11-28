package com.mphasis.Day3;

import java.time.LocalDate;

public class DemoOnLocalDate {
public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	System.out.println(today);
	System.out.println(today.getYear());
	System.out.println(today.getMonth());
	System.out.println(today.getMonthValue());
	System.out.println(today.getDayOfWeek());
	
	LocalDate myDate = LocalDate.of(2025,06,15);
	System.out.println(myDate);
	
	LocalDate date1 = LocalDate.of(2023, 01, 29);
	LocalDate date2 = LocalDate.of(2022, 02, 13);
	System.out.println(date1.isBefore(date2));
	
	
	String str = "2024-01-13";
	LocalDate lDate = LocalDate.parse(str);
	System.out.println(lDate);
	
	
}
}
