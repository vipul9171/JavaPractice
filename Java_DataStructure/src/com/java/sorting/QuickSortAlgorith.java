package com.java.sorting;

import java.util.Arrays;

public class QuickSortAlgorith {
	public static void main(String[] args) {
		int arr[] = { 23, 43, 55, 12, 3, 4, 76 };
		QuickSort sort = new QuickSort();
		System.out.println(Arrays.toString(arr));
		sort.sortElements(arr);
		System.out.println(Arrays.toString(arr));

	}

}

class QuickSort {

	int input[];

	public void sortElements(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		this.input = arr;
		sortAlgorithm(low, high);

	}

	private void sortAlgorithm(int low, int high) {
		int i = low;
		int j = high;
		int pivot = input[low + (high - low) / 2];
		while (i <= j) {
			if (input[i] < pivot) {
				i++;

			}
			if (input[j] > pivot) {
				j--;

			}
			if (i <= j) {
				swapElement(i, j);
				i++;
				j--;

			}

		}
		if (low < j) {
			sortAlgorithm(low, j);

		}
		if (i < high) {
			sortAlgorithm(i, high);

		}

	}

	private void swapElement(int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}

}
