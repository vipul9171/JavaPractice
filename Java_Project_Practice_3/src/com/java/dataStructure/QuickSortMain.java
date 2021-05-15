package com.java.dataStructure;

import java.util.Arrays;

class QuickSort {

	private int input[];

	void sortArray(int[] arr, int length) {
		this.input = arr;
		int low = 0;
		int high = length;
		sortElements(low, high);
	}

	private void sortElements(int low, int high) {
		Arrays.sort(input);
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
				swap(i, j);
				i++;
				j--;

			}
		}
		if (i < low) {
			sortElements(i, low);
		}
		if (j < high) {
			sortElements(j, high);
		}
	}

	private void swap(int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}

}

public class QuickSortMain {

	public static void main(String[] args) {
		int arr[] = { 12, 32, 11, 56, 45, 22, 16 };
		QuickSort quickSort = new QuickSort();
		quickSort.sortArray(arr, arr.length);

		System.out.println();
	}

}
