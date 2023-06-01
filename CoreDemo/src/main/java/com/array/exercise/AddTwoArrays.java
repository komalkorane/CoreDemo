package com.array.exercise;

import java.util.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {

		int n1[] = { 28, 23, 73, 63, 60, 90 };
		int n2[] = { 35, 56, 79, 12, 35, 88 };
		int num[] = new int[n1.length];
		int k = 0;
		for (int i = 0; i < n1.length; i++) {
			num[k] = n1[i] + n2[i];
			k++;
		}

		System.out.println(Arrays.toString(num));

	}
}
