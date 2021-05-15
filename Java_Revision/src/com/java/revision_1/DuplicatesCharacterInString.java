package com.java.revision_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesCharacterInString {
	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		duplicateCharacters(str);
	}

	private static void duplicateCharacters(String str) {

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
			if (entry.getValue() >= 2) {
				System.out.println(entry.getKey() + "-" + entry.getValue());

			}

		}
	}

}
