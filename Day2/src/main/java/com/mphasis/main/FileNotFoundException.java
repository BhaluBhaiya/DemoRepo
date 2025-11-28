package com.mphasis.main;

public class FileNotFoundException implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("File closed successfully ");
		
	}

}
