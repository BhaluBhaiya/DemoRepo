package com.mphasis.Day3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.print.DocFlavor.INPUT_STREAM;

public class DemoOnStaticMethodRef {

	static class NumberUtil {
		public static int sqNum(int num) {
			return num * num;
		}
		public static double printLog(double num) {
			return Math.log(num);
		}
		public static boolean isEven(int num) {
			return num%2 ==0;
		}
	}
	static class StringUtil{
		public static int stringLength(String str) {
			return str.length();
		}
	}

	public static void main(String[] args) {
		Function<Integer, Integer> sqFuncUsingLamda = (num) -> NumberUtil.sqNum(num);
		Function<Integer, Integer> sqFuncUsingMR = NumberUtil::sqNum;

		System.out.println(sqFuncUsingLamda.apply(44));
		System.out.println(sqFuncUsingMR.apply(12));
		
		Function<Double, Double> printLogUsingLamda = (num) -> NumberUtil.printLog(num);
		Function<Double, Double> printLogUsingMR = NumberUtil::printLog;
		
		System.out.println(printLogUsingLamda.apply(3.0));
		System.out.println(printLogUsingMR.apply(6.0));
		
		
		
		Predicate<Integer> isEvenUsingLamda = (num) -> NumberUtil.isEven(num);
		Predicate<Integer> isEvenUsingMR = NumberUtil::isEven;
		
		System.out.println(isEvenUsingLamda.test(7));
		System.out.println(isEvenUsingMR.test(6));
	
		
		String name = "Bhuvan";
		Supplier<Integer> strLenUsingLambda = ()->StringUtil.stringLength(name);
		
		System.out.println(strLenUsingLambda.get());
		
		Function<String, Integer>strLenUsingMR=StringUtil::stringLength;
		System.out.println(strLenUsingMR.apply(name));
		
		
	}
}
