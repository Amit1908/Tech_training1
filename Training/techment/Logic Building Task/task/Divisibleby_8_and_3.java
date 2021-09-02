package com.techment.task;

import java.util.*;
public class Divisibleby_8_and_3 {

	 public static void main(String[] args) 
	  {
	    Scanner scanner = new Scanner (System.in);
	    System.out.print("Input the first number: ");
	    int a = scanner.nextInt();
	  
	    
	    if(a%3 == 0 && a%8==0)
	    	
	   
	    System.out.println("Divisible by 3 and 8");
	    
	    else if(a%3==0)
	    		System.out.println("Divisible by 3 but not by 8");
	    
	    else if(a%8==0)
	    	System.out.println("Divisible by 8 but not by 3");
	    
	    else
	    	System.out.println("Not divisible by 3 and 8");
	  }
}
