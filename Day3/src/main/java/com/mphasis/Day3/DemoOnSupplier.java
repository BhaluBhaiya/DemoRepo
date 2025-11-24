package com.mphasis.Day3;

import java.util.function.Supplier;

public class DemoOnSupplier {

	public static void main(String[] args) {
		String name = "Bhuvan";
		
		Supplier<String> supplier = ()->name.toUpperCase();
		System.out.println(supplier.get());
		
		Supplier<Integer> supp1 =()->{
			return (int)Math.round(Math.random()*1000);
		};
		for(int i =0; i<4;i++) {
			System.out.println(supp1.get());
		}
		
		Supplier<Integer> maxSupp=()->{
			int a=(int) Math.round(Math.random()*1000), b =(int) Math.round(Math.random()*1000);
			System.out.println("A is :"+a);
			System.out.println("B is :"+b);
			return (a>b?a:b);
		};
		System.out.println(maxSupp.get());

	}

}
