package com.techment.day14.multithreading;

class Apple extends Thread
{
	public void run()
	
	{
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("eat apple " + Thread.currentThread().getName());
		}
	}
}

class Banana extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("eat banana " + Thread.currentThread().getName());
		}
	}
}
public class ThreadNaming {

	public static void main(String[] args) {
		

		Apple apple = new Apple();
		Banana banana = new Banana();
		
		//apple.run();
		//banana.run();
		apple.setName("Apple Thread");
		banana.setName("Banana Thread");
		
		banana.setPriority(2);
		apple.setPriority(8);
		
		apple.start();
		banana.start();
		
		//banana.suspend();
		//banana.resume();
	}

}
