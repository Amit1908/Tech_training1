package com.techment.day6.exception;

import java.io.FileNotFoundException;
class Student
{
	void checkEligibility(int age) throws FileNotFoundException
	{
		if(age>=18)
			System.out.println("You can aaply for loan");
		else
			//throw new ArithmeticException("You can not apply for loan");
			
			throw new FileNotFoundException("You can not apply for loan");
	}
}
public class ThrowsDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Student student = new Student();
		student.checkEligibility(23);
		
	}

}
