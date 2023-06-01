package com.array.exercise;

public class AlphabetCount {

	public static void main(String[] args) {

		String s = "abbcdabbbcdhjhcd";

		int c = 0;
		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt(i - 1))
				c++;
		}
		System.out.println(c);
	}

}
