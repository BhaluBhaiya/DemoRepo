package com.mphasis.main;

import java.io.File;
import java.io.FileNotFoundException;

public class DemoOnFileNotFound {
	
	
	private static void useFile(File f) throws FileNotFoundException {
		if(!f.exists())
			throw new FileNotFoundException();
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("demo.txt");
		useFile(f);
	}

}