package com.techment.polymorphism;

class Bank
{
	public void rateOfInterest()
	{
		System.out.println("3%");
	}
	
	public void openAccount()
	{
		System.out.println("Above 18 age can open account");
	}
}

class SBI extends Bank
{
	public void rateOfInterest()
	{
		System.out.println("5%");
	}
	
	public void loan()
	{
		System.out.println("You can apply for loan");
	}
}


class Axis extends Bank
{
	public void rateOfInterest()
	{
		System.out.println("7%");
	}
}





public class OverridingDemo {

	public static void main(String[] args) {
		
			SBI sbi = new SBI();
			Axis axis = new Axis();
			sbi.loan();
			
			Bank bank = new Axis(); //upcasting
			sbi.rateOfInterest();
			axis.rateOfInterest();
			
	}

}
