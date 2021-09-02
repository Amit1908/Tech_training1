package com.techment.day6.customException;

public class CustomException {

	public static void main(String[] args) {
		
		Account account = new Account();
		try
		{
			System.out.println(account.withdraw(2000));
		}
		catch(InSufficientFundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
