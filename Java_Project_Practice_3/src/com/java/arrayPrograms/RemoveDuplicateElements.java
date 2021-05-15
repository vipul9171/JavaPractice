package com.java.arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 2, 5, 3, 7, 2 };
		removeElements(arr);
	}

	private static void removeElements(int[] arr) {

		Arrays.sort(arr);
		int n = arr.length;

		int previous = arr[0];
		for (int i = 1; i < n; i++) {
			if (previous == arr[i]) {
				arr[i] = 0;
			}
			previous = arr[i];
		}

		System.out.println(Arrays.toString(arr));
	}

}
