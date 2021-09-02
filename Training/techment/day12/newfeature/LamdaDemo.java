package com.techment.day12.newfeature;


interface Bank
{
	void display();
	
}
public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = ()->System.out.println("this is display method");
		bank.display();
		
		Bank bank2 = ()->
		{
			System.out.println("this is display method");
			System.out.println("this is multi line body");
		};
		bank2.display();
	}

}
