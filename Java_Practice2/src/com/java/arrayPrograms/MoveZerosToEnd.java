package com.java.arrayPrograms;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 3, 5, 0, 5, 0, 1 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}

		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

}
