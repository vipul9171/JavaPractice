package com.java.StringPrograms;

import java.util.regex.Pattern;

public class StringContainsDigit 
{
	public static void main(String[] args) {
		String str1="234a3";
		Pattern pattern=Pattern.compile(".*[^0-9].*");
		
		System.out.println("Input contains only digits "+!pattern.matcher(str1).matches());
	}

}


