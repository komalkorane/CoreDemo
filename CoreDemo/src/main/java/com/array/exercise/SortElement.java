package com.array.exercise;

import java.util.Arrays;

public class SortElement {

	public static void main(String[] args) {

		int num[] = { 12, 178, 16, 17, 379, 86, 390 };
		int k = 0;
	
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					k=num[i];
					num[i]=num[j];
					num[j]=k;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
}
