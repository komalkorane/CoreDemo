package com.scenerio;

import java.util.Arrays;
import java.util.HashMap;

public class Scenerio4 {

	public static void main(String[] args) {

		  Integer[] arr = {2, 1, 5, 4, 6};
	      Object[] sortedArr =  Arrays.asList(arr).stream().sorted().toArray();
	      HashMap<Integer,Integer> m = new HashMap<>();
	    
	       for (int i = 0; i <arr.length; i++) {
	            Integer currentNum = arr[i];
	            Integer nextLargest = (i == arr.length - 1) ? m.put(arr[i], -1) : m.put(arr[i], arr[i]+1);
	        
	       }
		
		for(int i=0;i<arr.length;i++) {
			if(m.containsKey(arr[i])) {
				System.out.println(arr[i]+"-"+m.get(arr[i]));
			}
		}
	}

}
