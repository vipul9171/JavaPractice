package com.java.revision_1;

public class ReverseAStringUsingRecursion {
	public static void main(String[] args) {
		String str = "vipul";
		String reverseString = ReverseAStringUsingRecursion.reverse(str);
		if (str.equals(reverseString)) {
			System.out.println("String are palindrom::::" + str);

		} else {
			System.out.println("String are different:::");
			System.out.println(str);
			System.out.println(reverseString);
		}
	}

	private static String reverse(String str) {
		if (str.isEmpty()) {
			return str;

		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
