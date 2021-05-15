package com.java.threads;

public class DuplicateInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 5, 3, 6, 2, 7 };
		int size = arr.length;
		findDuplicate(arr, size);

	}

	private static void findDuplicate(int[] arr, int size) {

		int temp[] = new int[size - 1];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp[k] = arr[j];
					k++;

				}

			}

		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				System.out.println(temp[i]);

			}
		}

	}

}
