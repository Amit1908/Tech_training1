package com.techment.task;

import java.util.*;

public class BinaryToDecimal {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number:");
		String binaryString = sc.nextLine();
		System.out.println("Output: " + Integer.parseInt(binaryString,2));
	}

}
