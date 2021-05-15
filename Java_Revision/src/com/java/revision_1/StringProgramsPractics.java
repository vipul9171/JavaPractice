package com.java.revision_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringProgramsPractics {
	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		int size = str.length();
		// countCharactersInString(str, size);

		anagramOfString("GeeksForGeeks", "GeeksGeeksFor");

	}

	private static void anagramOfString(String string1, String string2) {
		char arr1[] = string1.toCharArray();
		char arr2[] = string2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Boolean result = Arrays.equals(arr1, arr2);
		System.out.println(result);

	}

	private static void countCharactersInString(String str, int size) {
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
