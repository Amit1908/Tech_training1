package com.techment.day9.io;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("abc.text");
		/*System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
*/
		
		int ch = fr.read();
		
		
		
		while(ch!=-1)
		{
			System.out.println((char)ch);
			ch=fr.read();  //increment
		}
	}

}
