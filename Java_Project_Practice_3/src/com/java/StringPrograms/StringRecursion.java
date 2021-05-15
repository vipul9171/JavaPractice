package com.java.StringPrograms;

public class StringRecursion 
{
	public static void main(String[] args) {
		String str="Vipul";
		String str2=reverseString(str);
		System.out.println("Reversed String is "+str2);
	}

	private static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverseString(str.substring(1))+str.charAt(0);
	}

}
