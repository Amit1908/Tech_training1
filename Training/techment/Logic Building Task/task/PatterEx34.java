package com.techment.task;

public class PatterEx34 {
	
	public static void main(String[] args) {
		int n=7;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=n-i+1;j--) {
				System.out.print(j);  //print pattern
			}
			System.out.println();  //next line
		}

	}


}
