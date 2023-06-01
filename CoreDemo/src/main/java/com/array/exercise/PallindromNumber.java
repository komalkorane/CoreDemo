package com.array.exercise;

import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int reminder, reverse = 0;
		int num1 = num;

		while (num != 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		if (num1 == reverse)
			System.out.println("Number is pallindrome : " + num1);
		else
			System.out.println("Number is not pallindrome : " + num1);

		
	}
}
