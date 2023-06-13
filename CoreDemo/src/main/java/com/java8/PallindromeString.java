package com.java8;

import java.util.stream.IntStream;

public class PallindromeString {

	public static void main(String[] args) {

		String s = "RADAR";
		boolean isPallindrome = IntStream.range(0, s.length()/2)
				.allMatch(i -> s.charAt(i)==s.charAt(s.length()-i-1));
		System.out.println(isPallindrome);
		
		
	}

}
