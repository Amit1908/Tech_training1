package com.techment.day7.collection;

import java.util.ArrayList;
import java.util.Collections;
public class CollectionTask {

	public static void main(String[] args) {

		ArrayList<String> o1 = new ArrayList<String>();
		
		o1.add("sachin");
		o1.add("Ravi");
		o1.add("Kumar");
		o1.add("Soumya");
		System.out.println("Batch 1 member is:" + o1);
		
		ArrayList<String> o2 = new ArrayList<String>();
		
		o2.add("sourab");
		o2.add("manish");
		o2.add("Kumar");
		o2.add("ankit");
		System.out.println("Batch 2 member is:" + o2);
		
		o2.addAll(o1);
		System.out.println("Member of Batch 1 and Batch 2 is :" + o2);
		
		ArrayList<String> newList = new ArrayList<String>();
		{
			for(String name:o2)
			{
				if(newList.contains(name))
				{
					newList.add(name);
				}
			}
			System.out.println("After removing duplicates elements:");
			
			for(String name : newList)
			{
				System.out.println(name+ " ");
			}
			Collections.sort(newList);
			System.out.println(newList);
		}
	}

}
