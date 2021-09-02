package com.techment.day5.abstraction;

interface Bank1
{
	void rateofInterest();
}

class Axis1 implements Bank1

{
	public void rateofInterest()
	{
		System.out.println("5%");
	}
}

class Kotak1 implements Bank1

{
	public void rateofInterest()
	{
		System.out.println("4%");
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
	
		Bank1 bank1 = new Kotak1();
		bank1.rateofInterest();
	}

}
