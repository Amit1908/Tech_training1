package com.techment.day7.collection;

import java.util.LinkedList;

public class ArrayLinkedLitDemo {

	public static void main(String[] args) {
		
		LinkedList o1 = new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.addLast(101);
		o1.add(4);
		o1.addFirst(100);
		
		System.out.println(o1);
		
		o1.removeLast();
		
		System.out.println(o1);

	}

}
