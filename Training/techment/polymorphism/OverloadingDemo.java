package com.techment.polymorphism;

class Hello
{
	public void write(int num)
	{
		System.out.println("You have witten number and number is:" +num);
	}
	
	public void write(String msg)
	{
		System.out.println("You have witten character and character is:" +msg);
	}
	
	
}




public class OverloadingDemo {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		hello.write("welcome");
				
		
	}

}
