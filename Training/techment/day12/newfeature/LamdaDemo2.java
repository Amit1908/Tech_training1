package com.techment.day12.newfeature;

interface Calculation
{
	//void add(int a,int b);
	
	int add(int a,int b);
}

public class LamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda expression with parameter
		
		//Calculation calculation = (a,b)->System.out.println("Result :"+ (a+b));
		
		//calculation.add(2, 3);
		//calculation.add(4, 5);
		
		Calculation calculation1 = (a,b)->a+b;
		
		Calculation calculation2 = (a,b)->
		{
			if(a>b)
				return a;
			return b;
		};
		
		System.out.println(calculation1.add(2, 4));
		System.out.println("largest of two num : " +calculation1.add(12, 4));
	}

}
