package com.techmnt.day15.interthreadcommunication;

public class AccountClass {

	int balance = 0;
	
	synchronized public int withdraw(int amount)
	{
		if(amount>balance)
		{
			try {
				System.out.println("no balance waiting to deposit.....");
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " is going to withdraw");
		balance-= amount; //balance = balance-amount
		
		return balance;
	}
	synchronized public int deposi(int amount)
	{
		System.out.println(Thread.currentThread().getName() + " is going to deposit");
		balance+=amount;
		
		return balance;
	}
}
