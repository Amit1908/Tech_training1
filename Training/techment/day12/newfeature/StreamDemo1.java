package com.techment.day12.newfeature;

import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(20);
		
		System.out.println(nums);
		nums.stream() .forEach(s->System.out.println(s));
		
		//by using method reference
		nums.parallelStream().forEach(System.out::println);
	}

}
