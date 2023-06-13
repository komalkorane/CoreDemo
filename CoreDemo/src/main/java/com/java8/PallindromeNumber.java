package com.java8;

import java.util.stream.IntStream;

public class PallindromeNumber {

	public static void main(String[] args) {

//		Integer i = 12321;
		Integer i = 15643175;
		String s = i.toString();
		boolean isPallindromeNumber = IntStream.range(0, s.length()/2)
				.allMatch(k -> s.charAt(k)==s.charAt(s.length()-k-1));
		System.out.println(isPallindromeNumber);
		
		
	}

}
