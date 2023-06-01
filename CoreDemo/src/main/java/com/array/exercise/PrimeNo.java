package com.array.exercise;

import java.util.Arrays;

public class PrimeNo {

	public static void main(String[] args) {

		int a[] = { 17, 31, 7, 9, 20 };
		int c[] = new int[a.length];
		int d[] = new int[a.length];
		int k = 0;
		int p = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					c[k] = a[i];
					k++;
				} 
				else {
					d[p] = a[i];
					p++;
				}
			}
		}
//		int b[] = new int[k];
//		for (int j = 0; j < b.length; j++) {
//			b[j] = c[j];
//		}
		int s[] = new int[p];
		for (int j = 0; j < s.length; j++) {
			s[j] = d[j];
		}
//		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(s));

	}

}
