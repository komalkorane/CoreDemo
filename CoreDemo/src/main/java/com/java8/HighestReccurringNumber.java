package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestReccurringNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

		Map<Integer, Long> count = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);

		Optional<Integer> maxReccurringNumber = list.stream()
				.max(Comparator.comparingInt(num -> Collections.frequency(list, num)));
		System.out.println(maxReccurringNumber);
		
		Long c =  list.stream().distinct().count();
		System.out.println(c);
	}

}
