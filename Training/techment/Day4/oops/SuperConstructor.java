package com.techment.Day4.oops;



class Parent1

{
	int a;
	Parent1(int a)
	{
		System.out.println("this is parent constructor" + a);
	}
	
}
class Child1 extends Parent1
{
	Child1(int x)
	{
		super(x);
		System.out.println("this is child constructor");
	}
	
}
public class SuperConstructor {
	
	public static void main(String[] args)
	{

	Child1 child1 = new Child1(2);
    }
}
	
