package com.java.arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int arr1[] = { 23, 42, 31, 21, 21, 23 };
		int size = arr1.length;
		int arr2[] = removElements(arr1, size);
		System.out.println(Arrays.toString(arr2));
	}

	private static int[] removElements(int[] arr1, int size) {

		Arrays.sort(arr1);
		int previous = arr1[0];
		int result[] = new int[arr1.length];
		result[0] = previous;
		for (int i = 1; i < size; i++) {

			int ch=arr1[i];
			if (ch!=previous)
			{
				result[i]=ch;
				
			}
			previous=ch;
		}

		return result;

	}

}
