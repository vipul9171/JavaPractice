package com.java.revision_1;

import java.util.Iterator;

public class RemovingElementsFromArray {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 4, 5, 2 };
		int n = arr.length;
		int c=sortArray(arr, n);
		for (int i = 0; i < c; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int sortArray(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;

		int temp[] = new int[n];

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];

			}

		}
		temp[j++] = arr[n - 1];

		for (int i = 0; i < n - 1; i++) {
			arr[i] = temp[i];
		}

		return j;

	}

}
