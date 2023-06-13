package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateFromList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,2,5,1,3,5,6,7,9,54,33);
		
		Set<Integer> set = new HashSet<>();
		
		Set<Integer> duplicate= list.stream().filter(i -> !set.add(i))
		        .collect(Collectors.toSet());
		System.out.println(duplicate);
		
	}

}
