package com.techment.day5.abstraction;

abstract class Bank
{
	void Eligibility()
	{
		System.out.println("Above 18 u can open a/c");
		
	}
	
	abstract int rateofinterest(int interestRate);
}



class Axis extends Bank
{
	int rateofinterest(int interestRate)
	{
		interestRate =  2*interestRate;
		return interestRate;
	}
}

class Kotak extends Bank
{
	int rateofinterest(int interestRate)
	{
		System.out.println("Kotak Bank" + interestRate);
		return interestRate;
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		
		Bank bank = new Axis();
		System.out.println(bank.rateofinterest(5));

	}

}
