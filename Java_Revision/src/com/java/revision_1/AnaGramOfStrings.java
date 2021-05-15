package com.java.revision_1;

import java.util.Arrays;

public class AnaGramOfStrings {
	public static void main(String[] args) {
		String str1 = "call of the pace";
		String str2 = "of call pace ther";
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flag = Arrays.equals(arr1, arr2);
		if (!flag)
		{
			System.out.println(str1+"**Strings are not anagram to each other**"+str2);
			
		} else {
			System.out.println(str1+ "**Strings are anagram to each other**"+str2);
		}
	}

}
