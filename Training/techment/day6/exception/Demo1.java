package com.techment.day6.exception;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println("name is Amit");
		System.out.println("email amit1908sinha@gmail.com");
		
		try
		{
			System.out.println(1/0);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("don't give zero");
		}*/
		
		catch(NullPointerException e)
		{
			System.out.println("don't give zero");
		}
		System.out.println("contact : 7488103663");

	}

}
