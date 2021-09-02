package com.techment.day6.customException;

public class Account {
	
	int balance = 5000;
	
	String withdraw(int amount) throws InSufficientFundException
	{
		if(amount>balance) 
			throw new InSufficientFundException("insufficient fund");
		else
			return "you have withdraw" + amount + "amount";
			//System.out.println("withdraw successful");
	}

}
