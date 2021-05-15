package com.java.revision_1;

public class DuplicatesInArrayWithouCollection {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6, 2, 1, 3, 6 };
		int size = arr.length;
		duplicateInArray(arr, size);
	}

	private static void duplicateInArray(int[] arr, int size) {
		int temp[] = new int[size];
		int k = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j <= arr.length-1; j++)
			{
				if (arr[i] != arr[j]) {
					temp[k] = arr[i];
					k++;
					break;

				}

			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				System.out.print(temp[i] + ",");

			}
		}

	}

}
