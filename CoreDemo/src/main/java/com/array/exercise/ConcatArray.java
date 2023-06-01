package com.array.exercise;

import java.util.Arrays;

public class ConcatArray {

	public static void main(String[] args) {

		int n1[] = { 28, 23, 73, 63, 60, 90 };
		int n2[] = { 35, 56, 79, 12 };
		int num[] = new int[n1.length + n2.length];
		int k = 0;
		for (int i = 0; i < n1.length; i++) {
			num[k] = n1[i];
			k++;
		}
		for (int j = 0; j < n2.length; j++) {
			num[k] = n2[j];
			k++;
		}
		System.out.println(Arrays.toString(num));

	}

}
