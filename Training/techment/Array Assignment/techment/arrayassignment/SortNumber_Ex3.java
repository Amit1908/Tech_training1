package com.techment.arrayassignment;

import java.util.*;
public class SortNumber_Ex3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number[] = new int[10];
		int sum =0;
		 //For insertion Of Marks
		 for (int i =0; i <10;i++)
		 {
			 System.out.println("Insert the number to be sort "+(i+1));
			 number[i]=scanner.nextInt();
		 }
		 //for sorting
		 for(int i = 0;i<number.length;i++)
			{
			 for (int j =(i+1);j<number.length;j++)
			 {
				 if(number[i]>number[j])
				 {
					 int swap=number[j];
					 number[j]=number[i];
					 number[i]=swap;
					 
				 }
			 }
			}
		 for (int i=0; i<number.length; i++)   
		 { System.out.println("Numbers in ascending order are : " +number[i]);
		 //sum+=marks[i];
		
		 }
						scanner.close();

	}

}
