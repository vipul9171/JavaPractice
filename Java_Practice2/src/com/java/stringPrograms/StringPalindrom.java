package com.java.stringPrograms;

public class StringPalindrom {
	public static void main(String[] args) {

		String str1 = "anac";
		String str2=reversedString(str1);
		System.out.println(str1.equals(str2));
	}

	private static String reversedString(String str1)
	{
		if (str1.isEmpty()) {
			return str1;
		}
		return reversedString(str1.substring(1))+str1.charAt(0);
	}

}
