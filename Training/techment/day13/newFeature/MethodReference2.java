package com.techment.day13.newFeature;


interface Calculate
{
	int add(int a,int b);
}

class Add
{
	int addition(int a,int b)
	{
		return a+b;
	}
}
class Sub
{
	int Subtract(int a,int b)
	{
		return a-b;
	}
}

public class MethodReference2 {

	public static void main(String[] args) {
		
		//by using Lambda Expression
		Calculate cal = (a,b) -> a+b;
		System.out.println(cal.add(2,4));
		
		Calculate cal2  = (a,b)->a-b;
		System.out.println(cal2.add(5,3));
		
		//by using Method reference
		Add add = new Add();
		Calculate c1=add::addition;
		System.out.println(c1.add(3, 7));
		
		Sub sub = new Sub();
		Calculate c2 = sub::Subtract;
		System.out.println(c1.add(14, 6));
		
	}

}
