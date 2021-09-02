package com.techment.day12.newfeature;


interface Largest
{
	String large(int a,int b,int c);
}
public class LargestNumber_Lamda {

	public static void main(String[] args) {
		
		Largest largeNumber = (a,b,c)->
		{
			if(a>b && a>c)
				return a+"a is largest";
			else if(b>c && b>a)
				return "b is largest";
			else return "c is largest";
		};
		
		System.out.println(largeNumber.large(5,4,7));

	}

}
