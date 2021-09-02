package com.techment.day6.exception;

import java.util.*;
public class ExceptionTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("num1 " + num1);
		//System.out.println("num2 "+ num2);
		
		try
		{
			System.out.println("Enter the number :");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println("num1 " + num1);
			System.out.println("num2 "+ num2);
			int result = num1/num2;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Give or don't give zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Give or don't give exception enter only number");
		}

	}

}
