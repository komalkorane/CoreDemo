package com.array.exercise;

public class NoOfOccuranceOfWord {

	public static void main(String[] args) {

		String s = "komalkomalsdgkomal";
		String word = "komal";
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
