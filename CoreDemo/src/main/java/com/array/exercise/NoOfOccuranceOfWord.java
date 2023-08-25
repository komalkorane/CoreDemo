package com.array.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class NoOfOccuranceOfWord {

	public static void main(String[] args) {

		String s = "komalkomalsdgkomal";
		String word = "komal";

//		m1(s, word);
		m2(s, word);
//		m3(s, word);
	}

	private static void m1(String s, String word) {

		Pattern p = Pattern.compile(word);
		Matcher m = p.matcher(s);
		int count = 0;

		while (m.find()) {
			count++;
		}
		System.out.println("Occurance of " + word + " is " + count);
	}

	private static void m2(String s, String word) {

		int length = word.length();
		int l = s.length();
		long counter = IntStream.range(0, l - length + 1).filter(i -> s.substring(i, i + length)
				.equals(word)).count();
		System.out.println(counter);
	}

	private static void m3(String s, String word) {
		int count = 0;
		int index = s.indexOf(word);
		System.out.println(index);
		while (index != -1) {
			count++;
			index = s.indexOf(word, index + word.length());
		}
		System.out.println("Number of occurrences of \"" + word + "\": " + count);
	}

}
