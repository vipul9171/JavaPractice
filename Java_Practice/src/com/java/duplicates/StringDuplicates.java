package com.java.duplicates;

import java.util.HashMap;

import java.util.Map.Entry;

public class StringDuplicates {
	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		StringDuplicates.findDuplicates(str);
	}

	private static void findDuplicates(String str) {

		char arr[] = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}

		}

		for (Entry<Character, Integer> newMap : map.entrySet()) {
			if (newMap.getValue() > 1) {
				System.out.println(newMap.getKey() + " " + newMap.getValue());

			}

		}

	}

}
