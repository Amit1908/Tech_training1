package com.techment.day7.collection;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);

		System.out.println("elements of o1 : " + o1);
		
ArrayList<Integer> o2 = new ArrayList<Integer>();
		
		o2.add(101);
		o2.add(102);
		o2.add(103);
		o2.add(4);
		o2.add(5);
		System.out.println("elements of o2 : " + o2);
		//o2.addAll(o1);
		//o2.removeAll(o1);
		  o2.retainAll(o1);
		  System.out.println("elements of o2 after retaining o1 : " + o2);

		//System.out.println("elements of o2 after removing o1 : " + o2);
	}

}
