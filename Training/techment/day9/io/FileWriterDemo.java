package com.techment.day9.io;

import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("abc.txt");

		fw.write("hello \n");
		fw.write(92);
		fw.write(98);
		fw.close();
	}

}

