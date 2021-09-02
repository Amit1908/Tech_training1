package com.techment.day7.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		
		s1.push(1);
		s1.add(2);
		s1.add(3);
		
		System.out.println(s1);
		s1.pop();
		System.out.println("after moving" + s1);
		
	}
}
