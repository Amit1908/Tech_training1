package com.techment.day17.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yor DOB");
		String dob = sc.next();
		
		System.out.println("Your birth date is :" +dob);
		
		//DateTimeFormatter dtfl = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtfl = DateTimeFormatter.ofPattern("yy/MMM/dd");
		
		LocalDate birthDate = LocalDate.parse(dob, dtfl);
		System.out.println("Birthday :"+ birthDate);
		
		System.out.println("birth date in given format :" + birthDate.format(dtfl));
		
	}

}
