package com.iteratemap;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("Komal", 20);
		map.put("Anuradha", 30);
		map.put("Sayali", 10);
		map.put("Aarati", 50);
		map.put("Priyanka", 45);
		
		
		//====using keyset
//		Set s=map.keySet();
//		for(Object obj:s) {
//			System.out.println("Key :"+obj +" Values :"+map.get(obj));  
//		}
		
		//====using entryset
//		Set<Map.Entry<String,Integer>> set=map.entrySet();
//		for(Map.Entry<String, Integer> obj: set) {
//			System.out.println("Key :"+obj.getKey()+" Value :"+obj.getValue());
//		}
		
		//=====using enumeration
//		Hashtable<String, Integer> hash=new Hashtable(map);
//		
//		Enumeration e2=hash.keys();
//		Enumeration e1=hash.elements();
//		while(e2.hasMoreElements()) {
//			System.out.println("Keys :"+e2.nextElement()+" Values :"+e1.nextElement()); 
//		}
		
		//====using lambda java8
		map.forEach((k,v) -> System.out.println("Key :"+k+" Values :"+v));

	}

}
