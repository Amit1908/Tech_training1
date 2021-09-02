package com.techment.assessment2;

public class RepeatEnd_Q2 {
	
	public String repeatEnd(String str,int n)
	{
		String word = str.substring(str.length()-n);
		for(int i=1;i<n;i++)
			word = word + str.substring(str.length()-n);
			return word;
	}

	public static void main(String[] args) {
		
		RepeatEnd_Q2 q2 = new RepeatEnd_Q2();
		System.out.println(q2.repeatEnd("Hello", 3));
		System.out.println(q2.repeatEnd("Hello", 2));
		System.out.println(q2.repeatEnd("Hello", 1));

	}

}
