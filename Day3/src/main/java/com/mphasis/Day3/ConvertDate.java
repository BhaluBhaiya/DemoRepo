package com.mphasis.Day3;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertDate {
	public static void main(String[] args) throws ParseException {
		Date date = new Date(2025 - 1900, 11, 24);
		System.out.println(date);

		String strDate = "15-08-2025";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(strDate);
		Date sdate = new Date(uDate.getTime());

		Date sqlDate = Date.valueOf("2025-10-03");
		java.util.Date utilDate1 = new java.util.Date(sqlDate.getTime());
		java.util.Date utilDate2 = sqlDate;

		Date sqlDate1 = Date.valueOf("2025-03-25");
		String str = sqlDate1.toString();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.parseObject(str));
		
		
		String myDate= "2022-07-22";
		}
}
