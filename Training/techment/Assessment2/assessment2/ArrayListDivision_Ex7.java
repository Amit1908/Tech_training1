package com.techment.assessment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ArrayListDivision_Ex7 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		int len= list.size();
		//System.out.println(len);
		int len1 = len/2;
		int len2 = len-len1;
		//System.out.println(list1.get(1));
		System.out.println("Main List " );
		for(int i =0;i<list.size();i++)
		{
			//list1.add(list.get(i));
			System.out.println(list.get(i));
		}
		System.out.println("============List 1============= ");
		for(int i =0;i<len1;i++)
		{
			list1.add(list.get(i));
			System.out.println(list1.get(i));
		}

		System.out.println("==============output===== ");	

		for(int i =len2;i<list.size();i++)
		{
			//System.out.println("check");

			list2.add(list.get(i));
			//System.out.println(list2.get(i));
		}
		System.out.println( "Max From List 1 : " +list1.stream().max(Comparator.naturalOrder()) // Optional<Integer>
                .get());
		System.out.println( "Max From List 2 : " +list2.stream().max(Comparator.naturalOrder()) // Optional<Integer>
                .get());

	}

}
