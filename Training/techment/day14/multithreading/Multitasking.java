package com.techment.day14.multithreading;

class Sanika extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Sanika :"+i+"msg :welcome to bangalore");
			
		}
	}
}

class Parul extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				try {
					Thread.sleep(10000);
					
				}
				catch(InterruptException e)
				{
					e.PrintStackTrace();
				}
			}
			System.out.println("Parul :"+i+"msg :Take Vaccination");
			
		}
	}
}

class Amit extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Amit :"+i+"msg :Covid19 is not over yet");
			
		}
	}
}

public class Multitasking {

	public static void main(String[] args) {
		
		Sanika sanika = new Sanika();
		Parul parul = new Parul();
		Amit amit = new Amit();
		
		//sanika.run();
		//parul.run();
		//amit.run();
		
		sanika.start();
		parul.start();
		amit.start();
	}

}
