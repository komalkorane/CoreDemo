package com.array.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringEachWordReverse {
	
	//>>>>>>>>>>>>>>>>incomplete>>>>>>>>>>>
	
	public static void main(String[] args) {

		String s = "komal yashawant korane";
		
		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));
		String reverseWord = "";
		
		for(int i=0; i<str.length; i++) {
			String word = str[i];
			String reverse = "";
			for(int j=str.length-1; j>=0; j--) {
				reverse = reverse + word.charAt(j); 
			}
			reverseWord = reverseWord + reverse + " ";
		}
		System.out.println(reverseWord);
		
	}

}
