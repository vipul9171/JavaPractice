package com.java.StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCharacterCount {
	public static void main(String[] args) {

		String str = "GeeksForGeeks";
		findDuplicateCharcterInString(str);
	}

	private static void findDuplicateCharcterInString(String str) {

		char arr[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : arr) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());

			}

		}

	}

}
