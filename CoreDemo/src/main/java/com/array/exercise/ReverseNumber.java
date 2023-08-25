package com.array.exercise;

import java.util.Scanner;

public class ReverseNumber {

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
		System.out.println(reverse);

		m1();
	}

	private static void m1() {

		Integer num1 = 1234;

		num1.toString().chars().mapToObj(i -> (char) i).sorted((a, b) -> b - a).forEach(System.out::print);

	}
}
