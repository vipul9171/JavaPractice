package com.java.practice;

import java.util.Arrays;

public class Hello {
	public static void main(String[] args) {
		String a="Hi5";
		String b="Hi"+"5";
		String c="12345";
		String d="Hi"+c.length();

		System.out.println(a.hashCode());
		System.out.println(d.hashCode());
		System.out.println(a==d);
}
}