package com.techment.assessment2;


class RepeatFront
{
	private String name;
	
	String RepeatImpl(String name,int limit)
	{
		String str = "";
		int k = 0;
		for(int i=limit;i>0;i--)
		{
			str = str+name.substring(k,i);
			
		}
		return str;
	}
}
	
	public class Q1
	{
		public static void main(String[] args) {
			
			RepeatFront rep = new RepeatFront();
			System.out.println("Chocolate 4 Characters " + rep.RepeatImpl("Chocolate",4));
			System.out.println("Chocolate 3 Charaters " + rep.RepeatImpl("Chocolate",3));
			System.out.println("Ice Cream 2 Charaters " + rep.RepeatImpl("Ice Cream",2));
		}

	}		

/*public class Q1 {

	public String repeatFront(String str,int n)
	{
		int len = str.length();
		String word = "";
		
		for(int i = n;n>0;n--)
		{
			word  = str.substring(0,n);
		}
		return word;
	}
	public static void main(String[] args) {
		
		Q1 q1 = new Q1();
		System.out.println(q1.repeatFront("Chocolate", 4));
		System.out.println(q1.repeatFront("Chocolate", 3));
		System.out.println(q1.repeatFront("Chocolate", 2));*/
	


