package com.java.arrayPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicatesInMap {
	public static void main(String[] args) {
		int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
		int n = arr.length;
		findDuplicateElements(arr, n);
	}

	private static void findDuplicateElements(int[] arr, int n) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);

			} else {
				map.put(i, 1);

			}

		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());

			}
		}

	}

}
