package com.java.revision_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountVowelsInString {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		CountVowelsInString.printVowels(str);

	}

	private static void printVowels(String str) {

		char arr[] = str.toCharArray();
		int count = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (map.containsKey(c)) {
				
			}
		}
		
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());

			}
		}

	}

}
