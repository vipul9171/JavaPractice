package com.java.practice;

import java.util.Arrays;

public class QuickSort {
	static int arr[] = { 2, 1, 45, 43, 22, 21, 34, 52, 11, 16 };

	public static void main(String[] args) {

		sortElement(arr);
		QuickSort quickSort=new QuickSort();
		quickSort.sortElement(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sortElement(int[] arr) {
		int i = 0;
		int length = arr.length - 1;
		sort(i, length);

	}

	private static void sort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = arr[low + (high - low) / 2];

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;

			}
			while (arr[j] > pivot) {
				j--;

			}
			if (i <= j) {

				swap(i, j);
				i++;
				j--;

			}

		}
		if (low > j) {
			sort(low, j);

		}
		if (high < i) {
			sort(high, i);

		}
	}

	private static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
