package com.array.exercise;

public class CollabaraL1 {

	public static void main(String[] args) {
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i <= j; i++) {
				if (i % 2 == 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
		/* using java8
		 * IntStream.range(0, 4) .forEach(j -> { IntStream.rangeClosed(0, j) .forEach(i
		 * -> { if (i % 2 == 0) System.out.print("*"); else System.out.print("#"); });
		 * System.out.println(); });
		 */
	}

}
