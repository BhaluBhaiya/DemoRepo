package com.mphasis.main;

public class TryWithResourceDemo implements AutoCloseable{
	
	@Override
	public void close() throws Exception {
		System.out.println("resource closed successfully");		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
