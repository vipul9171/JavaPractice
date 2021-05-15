package com.java.arrayPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleMissingElements {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 4, 5, 7, 9, 4, 5, 8,8,2,5 };
		int n = arr.length;

		duplicateElements(arr, n);
	
	}

	private static void duplicateElements(int[] arr, int n) {
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
