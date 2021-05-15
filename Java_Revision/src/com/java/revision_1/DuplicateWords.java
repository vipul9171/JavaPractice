package com.java.revision_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWords {
	public static void main(String[] args) {
		String str = "This this is My new new code";
		DuplicateWords.findUniqueCharacter(str);

	}

	private static void findUniqueCharacter(String str) {

		String arr[] = str.split(" ");
		
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);

			}

		}
		
		System.out.println(map.toString());
		/*
			 * for (Entry<String, Integer> entry : map.entrySet()) {
			 * 
			 * System.out.println(entry.getKey() + " " + entry.getValue());
			 * 
			 * 
			 * }
			 */
	}

}
