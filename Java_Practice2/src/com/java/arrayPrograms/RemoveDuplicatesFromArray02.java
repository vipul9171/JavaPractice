package com.java.arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromArray02 {

	public static void main(String[] args) {

		int arr[] = { 21, 34, 53, 21, 43, 53, 44 };
		int n = arr.length;

		int arr2[] = removeDuplicates(arr, n);
		System.out.println(Arrays.toString(arr2));

	}

	private static int[] removeDuplicates(int[] arr1, int n) {

		Arrays.sort(arr1);
		int result[] = new int[n];
		int previous = arr1[0];
		result[0] = previous;
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] != previous) {
				result[i] = arr1[i];
			}
			previous = arr1[i];

		}
		
		return result;
	}

}
