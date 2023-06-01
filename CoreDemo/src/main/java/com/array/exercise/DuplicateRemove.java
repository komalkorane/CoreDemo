package com.array.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateRemove {

	public static void main(String[] args) {

		Integer a[] = { 10, 20, 40, 30, 10, 20, 20, 20 };
		int b[] = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 0) {
				b[k] = a[i];
				k++;
			}
		}

		int c[] = new int[k];
		for (int z = 0; z < c.length; z++) {
			c[z] = b[z];
		}
		System.out.println(Arrays.toString(c));

//	List<Integer> list =	Arrays.asList(a);
//	List<Integer> l= list.stream().filter(e -> Collections.frequency(list, e)==1)
//	.collect(Collectors.toList());
//		System.out.println(l);
//	
//	Set<Integer> set =	list.stream().collect(Collectors.toSet());
//		System.out.println(set);

	}

}

// array is fixed in size so duplicate 0 are added
