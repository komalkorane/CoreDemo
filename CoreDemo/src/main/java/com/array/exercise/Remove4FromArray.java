package com.array.exercise;

import java.util.Arrays;

public class Remove4FromArray {

	public static void main(String[] args) {
		int[] arr = {2, 4,21,8,4};

        int[] uniqueArray = Arrays.stream(arr)
                .filter(num -> num != 4) // Skip the number 4
                .toArray();

        System.out.println(Arrays.toString(uniqueArray));
		
	}

}
