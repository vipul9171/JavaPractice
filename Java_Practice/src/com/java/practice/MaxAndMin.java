package com.java.practice;

public class MaxAndMin {
	public static void main(String[] args) {
		int numbers[] = { 2, 3, 214, 453, 1, 325, 4536, 5 };
		findMaxAndMin(numbers);

	}

	private static void findMaxAndMin(int[] numbers) {
		int lowest = Integer.MAX_VALUE;
		int highest = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > highest) {
				highest = number;

			} else if (number < lowest) {
				lowest = number;

			}

		}
		System.out.println("Lowest" + lowest);
		System.out.println("Highest" + highest);

	}

}
