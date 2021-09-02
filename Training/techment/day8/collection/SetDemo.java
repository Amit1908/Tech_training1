package com.techment.day8.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(11);
		hs.add(26);
		System.out.println("hashset :"+ hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(1);
		lhs.add(6);
		lhs.add(6);
		lhs.add(7);
		lhs.add(11);
		lhs.add(26);
		lhs.add("sachin");
		
		System.out.println("LinkedHAshSet"+lhs);
		
		TreeSet ts = new TreeSet();
		ts.add(1);
		ts.add(6);
		ts.add(6);
		ts.add(70);
		ts.add(11);
		ts.add(26);
		
		System.out.println("Treeset :"+ ts);
	}
	

}
