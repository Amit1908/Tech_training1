package com.techment.day13.newFeature;


interface LargeNumber
{
	int large(int a,int b,int c);
	
}

class Calculationutil
{
	int findLargest(int a,int b,int c)
	{
		
			if(a>b&&a>c)
				return a;
			else if(b>c&&b>a)
				return b;
			else return c;
		
	}
}


public class Largest {

	public static void main(String[] args) {
		
		LargeNumber largeNumber = (a,b,c)->
		{
			if(a>b&&a>c)
				return a;
			else if(b>c&&b>a)
				return b;
			else return c;
		};
		System.out.println(largeNumber.large(5,2,7));
		Calculationutil calculationutil = new Calculationutil();
		
		LargeNumber number = calculationutil::findLargest;
		System.out.println(number.large(7,12,10));
		

	}

}
