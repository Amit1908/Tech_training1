package com.techment.day13.newFeature;


interface Calculation
{
	void display();
}

class Hello
{
	void message()
	{
		System.out.println("today is holiday");
	}
}


public class MethodReference1 {

	public static void main(String[] args) {
		
		
		//by using lambda expression
		Calculation calculation = ()->System.out.println("this is display method");
		calculation.display();
		
		
		//method reference to non static method or instance method
		Hello hello = new Hello();
		Calculation calculation2 = hello::message;
		calculation2.display();
		
	}

}
