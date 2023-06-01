package com.iteratemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortByValue {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("Komal", 20);
		map.put("Anuradha", 30);
		map.put("Sayali", 10);
		map.put("Aarati", 50);
		map.put("Priyanka", 45);

		List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
		Collections.sort(list, new Demo());
		LinkedHashMap<String, Integer> l = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> obj: list) {
			l.put(obj.getKey(), obj.getValue());
		}
		System.out.println(l);
		
}
}
class Demo implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}
	
	
	
}