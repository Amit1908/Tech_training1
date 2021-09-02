package com.techment.day9.io;

import java.io.File;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("abc.txt");
		System.out.println(file.exists());
		//file.createNewFile(); //create a File
		file.mkdir(); // create a folder
		System.out.println(file.exists());
		
		
	}

}
