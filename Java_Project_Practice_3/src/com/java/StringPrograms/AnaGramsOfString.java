package com.java.StringPrograms;

import java.util.Arrays;

public class AnaGramsOfString {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "cab";

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (arr1.length!=arr2.length) {
			System.out.println("String are not anagram to each other");
		}else if (Arrays.equals(arr1, arr2)) {
			System.out.println("String are anagram to each other");
		} 
		else {
			System.out.println("Strings are not anagram to each other");
		}
	}

}
