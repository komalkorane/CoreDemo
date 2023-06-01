package com.array.exercise;

import java.util.Arrays;

public class SortedSecondLastNo {

	public static void main(String[] args) {

		int a[] = {10,82,48,59,60,35,24};
		int sort, lastNum;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					sort=a[i];
					a[i]=a[j];
					a[j]=sort;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		lastNum = a[a.length-2];
		System.out.println(lastNum);
	}

}
