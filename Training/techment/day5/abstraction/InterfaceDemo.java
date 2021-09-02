package com.techment.day5.abstraction;


interface One
{
	void greet();
}

interface Two
{
	void greet();
}

class Manager{
	void operationRegion()
	{
		
	}
}


class Employee2 extends Manager implements One,Two 
{

	@Override
	public void greet() {
		
		
	}
		
		
}

	
public class InterfaceDemo {

	public static void main(String[] args) {
		

	}

}
