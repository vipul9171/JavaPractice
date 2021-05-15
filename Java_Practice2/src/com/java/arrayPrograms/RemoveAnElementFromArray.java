package com.java.arrayPrograms;

import java.util.Arrays;

public class RemoveAnElementFromArray {
	public static void main(String[] args) {
		int arr1[] = { 23, 42, 31, 21, 21, 23 };
		int size = arr1.length;
		int n = 31;
		int arr2[] = removElements(arr1, n);
		System.out.println(Arrays.toString(arr2));
	}

	private static int[] removElements(int[] arr1, int n) {

		int previous = n;
		int count = 1;
		for (int i = 1; i < arr1.length; i++) {
			if (previous == arr1[i]) {
				arr1[i] = 0;
			}
			if (arr1[i] != 0) {
				count++;
			}

		}
		System.out.println(count);
		int result[] = new int[count];
		int countNew = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				result[countNew++] = arr1[i];

			}

		}

		return result;
	}

}
