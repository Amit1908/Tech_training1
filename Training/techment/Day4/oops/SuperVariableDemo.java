package com.techment.Day4.oops;


class Parent
{
	int a=10;
}
class Child extends Parent
{
	int b = 20;
	void sum()
	{
		int c = a+b;
		System.out.println("sum :"+c);
	}
}




public class SuperVariableDemo {

	public static void main(String[] args) {
		
		Child child = new Child();
				child.sum();
		
	}

}
