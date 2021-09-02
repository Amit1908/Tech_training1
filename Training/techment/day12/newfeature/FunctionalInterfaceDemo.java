package com.techment.day12.newfeature;


//@Functional Interface
interface Bank2
{
	void rateOfInterest();
	
	default void display()
	{
		System.out.println("this is a default method");
	}
	
	static void loan()
	{
		System.out.println("you can apply for loan");
	}
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
