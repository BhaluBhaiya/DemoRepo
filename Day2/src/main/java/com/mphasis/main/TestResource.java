package com.mphasis.main;

public class TestResource {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		TryWithResourceDemo demo = new TryWithResourceDemo();
		try(demo){
			System.out.println("using demo resource");
		}

	}

}
