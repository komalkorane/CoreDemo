package com.scenerio;

public class VarArgCalculator {

	public static void main(String[] args) {

		int res =add(10,20,30,40);
		System.out.println("Addition is : "+res);
	}

	private static int add(int... i) {

		int sum = 0;
		for(int num : i) {
			sum = sum + num;
		}
		return sum;
	}

}
