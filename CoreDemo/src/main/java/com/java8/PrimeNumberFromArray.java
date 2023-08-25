package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumberFromArray {

	public static void main(String[] args) {

		int[] k = { 17, 37, 349, 58, 127, 26, 48 };
		Arrays.stream(k).filter(PrimeNumberFromArray::isPrime)
		.forEach(num -> System.out.print(num + " "));

	}

	public static boolean isPrime(int num) {

		return IntStream.rangeClosed(2, (int) Math.sqrt(num))
				 .noneMatch(i -> num % i == 0);

	}

}
