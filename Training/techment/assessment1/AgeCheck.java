package com.techment.assessment1;

import java.util.*;
public class AgeCheck {

	public static void main(String[] args) {
		int Children=0,Adult=0,SeniorCitizen=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number of people you want  : ");
		int number = scanner.nextInt();
		int age[] = new int[number];
		for(int i =0;i<age.length;i++)
		{
			System.out.println("Enter the Age of "+(i+1)+" Person : ");
			age[i] =scanner.nextInt(); 
		}
		
		for(int i =0;i<age.length;i++)
		{
			if(age[i]<18)
				Children+=1;
			else if(age[i]>=18 && age[i]<55)
				Adult+=1;
			else if(age[i]>55)
				SeniorCitizen+=1;
			else
				System.out.println("Please Enter a Valid Age : ");
//			age[i] =scanner.nextInt(); 
		}
		System.out.println("Total Childrens Are : "+Children);
		System.out.println("Total Adult Are : "+Adult);
		System.out.println("Total SeniorCitizen Are : "+SeniorCitizen);
		
		//System.out.println(age);
		scanner.close();
	}

}


