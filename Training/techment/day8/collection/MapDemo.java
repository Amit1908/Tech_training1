package com.techment.day8.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
public class MapDemo {
	public static void main(String[] args) {
		
		HashMap<String,String> hs = new HashMap<String,String>();
		hs.put("sachin","sachin is a btasman");
		hs.put("dravid","he is a wicket keeper");
		hs.put("dhoni","dhoni is a captain");
		
		System.out.println("HashMap is:"+ hs);
		
		for(Entry<String, String> e : hs.entrySet())
		{
			//System.out.println(e);
			//System.out.println("key:"+e.getKey());
			//System.out.println("key:"+e.getValue());
		}
		
		System.out.println("Printing the value :");
		for(String val : hs.values())
		{
			System.out.println(val);
		}
		
		
		System.out.println("printing the key :");
		for(String key : hs.keySet())
		{
			System.out.println(key);
		}
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1,"amit");
		lhm.put(2,"kumar");
		lhm.put(3,"sinha");
		lhm.put(3,"sinha");
		lhm.put(40,"aniket");
		lhm.put(11,"dubey");
		
		System.out.println("LinkedHashMap is:"+ lhm);
		
		TreeMap tm = new TreeMap();
		tm.put(1,"amit");
		tm.put(2,"kumar");
		tm.put(3,"sinha");
		tm.put(3,"sinha");
		tm.put(30,"aniket");
		tm.put(2,"dubey");
		
		
		System.out.println("TreeMap is:"+ tm);
 	}
}
