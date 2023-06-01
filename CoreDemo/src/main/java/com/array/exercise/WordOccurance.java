package com.array.exercise;

import java.util.Arrays;
import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {

		String input = "India is my country i love my country India";
		String[] words = input.split(" ");
		System.out.println(Arrays.toString(words));

		HashMap<String, Integer> wordMap = new HashMap();
		for (String word : words) {
			if (wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
			} else {
				wordMap.put(word, 1);
			}
		}
		System.out.println(wordMap);

	}
}
