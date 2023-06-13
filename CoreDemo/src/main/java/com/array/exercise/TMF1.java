package com.array.exercise;

public class TMF1 {

	public static void main(String[] args) {

		try {
			int n = 1000, x = 0;
			int arr[] = new int[n];
			for (int i = 0; i <= n; i++) {
				arr[i] = i / x;
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1st ");
		} 
		catch (ArithmeticException e) {
			System.out.println("2nd");
		} 
		catch (Exception e) {
			System.out.println("3rd");
		}

	}

}
