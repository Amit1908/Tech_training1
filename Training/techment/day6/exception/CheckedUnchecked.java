package com.techment.day6.exception;

import java.io.FileNotFoundException;

public class CheckedUnchecked {

	public static void main(String[] args) throws FileNotFoundException{
		
		//throw new ArithmeticException("Something went wrong");
		  throw new FileNotFoundException("File is not present");

	}

}
