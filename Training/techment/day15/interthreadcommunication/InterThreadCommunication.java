package com.techmnt.day15.interthreadcommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		AccountClass account = new AccountClass();
		Thread t1 = new Thread()
			{
				public void run()
				{
					System.out.println("after withdraw balance is :"+account.withdraw(3000));
				}
			};
			
			Thread t2 = new Thread()
			{
				public void run()
				{
					System.out.println("after deposit balance is :" + account.deposi(2000));
				}
			};
			
			t1.setName("Atm");
			t2.setName("Bank");
			
			t1.start();
			t2.start();

	}

}
