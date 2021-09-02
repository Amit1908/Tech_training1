package com.techment.task;

import java.util.*;
public class Mathematical_operation {

	public static void main(String args[])
	{
		int first,second,multiply,add ,substract;
		float divide;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers: ");
		first = sc.nextInt();
		second = sc.nextInt();

		add = first + second;
		substract = first - second;
		multiply = first * second;
		divide = first/second;

		System.out.println("Sum = " + add);
		System.out.println("Difference = " + substract);
		System.out.println("Multiplication = " + multiply);
		System.out.println("Division = " + divide);
	}
}
