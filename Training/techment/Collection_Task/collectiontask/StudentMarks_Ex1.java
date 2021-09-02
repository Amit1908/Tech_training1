package com.techment.collectiontask;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks_Ex1 {

	public static void main(String[] args) {
		
		double sum =0,average=0;
		StudentMarks_Ex1 s1 = new StudentMarks_Ex1();
		
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many subjects marks you want to enter =  ");
		int number = scanner.nextInt();
		System.out.println("ok Total subject is = "+number);

		ArrayList<Integer> marks=new ArrayList<Integer>(number);
		
		Scanner scanMarks = new Scanner(System.in);
		
		for(int i=0;i<number;i++)
		{	System.out.print("Enter the marks for student "+(i+1)+"= ");
			marks.add(scanMarks.nextInt()) ;
		}

//		System.out.println(" marks = "+marks);
		
//		System.out.print("=======================================\n marks : ");
//		for(int i=0;i<number;i++)
//		{	
//
//			 System.out.print("["+(i+1)+" = "+marks.get(i)+"],");
//		}
		
		System.out.println("\n=======================================");
//		ArrayList<Integer> copyMarks = marks;
		
		ArrayList<Integer> copyMarks   = (ArrayList<Integer>)marks.clone();

		
		Collections.sort(marks);
		
		
		
		System.out.println("Highest marks "+marks.get(number-1));
		
		for(int i=0;i<number;i++)
		{	
			 sum +=marks.get(i);
		}
		
		average= sum/number;
		
		System.out.println("average = "+average);
		
		System.out.print("=======================================\n marks : ");
		for(int i=0;i<number;i++)
		{	

			 System.out.print("["+(i+1)+" - "+copyMarks.get(i)+"]");
		}

		System.out.println("\n=======================================");
		System.out.println("3rd student marks "+copyMarks.get(2));
		
		System.out.print("=======================================\nSorted marks : ");
		for(int i=0;i<number;i++)
		{	

			 System.out.print("["+(i+1)+" - "+marks.get(i)+"]");
		}

		
	}

}
