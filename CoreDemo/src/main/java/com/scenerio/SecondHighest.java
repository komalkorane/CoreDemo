package com.scenerio;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {

		int a[] = { 20, 30, 18, 50, 47, 74 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int secondLarge = a[a.length - 2];
		System.out.println(secondLarge);

	}

}
