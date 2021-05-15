package com.java.revision_1;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 2, 4, 5, 6, 3 };
		int size = arr.length;
		arrayDuplicateElements(arr, size);
		
		LinkedHashMap< String, String> test=new LinkedHashMap<>();
		

	}

	private static void arrayDuplicateElements(int[] arr, int size) {
		int temp[] = new int[size];
		int k = 0;
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (arr[i] == arr[j]) {
					temp[i] = arr[i];

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
