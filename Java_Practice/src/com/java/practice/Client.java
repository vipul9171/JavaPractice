package com.java.practice;

class Client {
	public static void main(String args[]) 
	{
		String str=reverseString("ABC");
		System.out.println(str);
	}

	private static String reverseString(String string) {
		
		return reverseString(string.substring(0));
	}
}
