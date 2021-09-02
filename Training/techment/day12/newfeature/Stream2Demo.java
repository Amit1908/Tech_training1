package com.techment.day12.newfeature;

import java.util.ArrayList;

public class Stream2Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
		{
			numbers.add(i);
		}
		System.out.println("numbers "+ numbers);
		System.out.println("printing only even number");

		numbers.parallelStream().filter(num->num%2==0) .forEach(s->System.out.println(s));
		
		numbers.parallelStream() .map(num->"after adding 100: " +(num+100)) .forEach(s->System.out.println(s));
		
		numbers.parallelStream() .limit(2) .forEach(s->System.out.println(s));
		numbers.parallelStream() .skip(2) .forEach(s->System.out.println(s));
		
		Long size = numbers.parallelStream().count();
		System.out.println();
	}

}
