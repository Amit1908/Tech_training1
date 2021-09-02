package com.techment.day7.collection;

import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList obj = new ArrayList();
		System.out.println("size before adding element:"+obj.size());
		obj.add(1);
		obj.add("sachin");
		obj.add(24.50);
		
		System.out.println("size after adding element:"+obj.size());
		System.out.println("element in list:"+ obj);
		
		obj.add(1,"hello");
		System.out.println("element in list after adding at 1st index:"+ obj);
		
		obj.remove(Integer.valueOf(1));
		System.out.println("element in list after removing:"+ obj);
		System.out.println("element at 2nd index:"+ obj.get(2));
		
		
	}

}
