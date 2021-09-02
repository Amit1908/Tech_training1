package com.techment.task;

public class Diamond {

	public void includeSpace(int n)
	{
		for (int i = 0; i < n; ++i)
		{
			System.out.print(" ");
		}
	}
	public void printPattern(int n)
	{
		System.out.println("\nGiven n : " + n);
		// Top half 
		for (int i = 1; i <= n; ++i)
		{
			includeSpace(n - i);
			for (int j = i; j >= 1; --j)
			{
				System.out.print(j);
			}
			for (int k = 2; k <= i; ++k)
			{
				System.out.print(k);
			}
			System.out.print("\n");
		}
		// Bottom half 
		for (int i = n - 1; i >= 1; --i)
		{
			includeSpace(n - i);
			for (int j = i; j >= 1; --j)
			{
				System.out.print(j);
			}
			for (int k = 2; k <= i; ++k)
			{
				System.out.print(k);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args)
	{
		Diamond task = new Diamond();
		// Test
		task.printPattern(5);
		task.printPattern(7);
	}
}
