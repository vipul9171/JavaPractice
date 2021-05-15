package com.java.practice;

public class ArrayMissingElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 3, 5, 6, 6, 9 };
		int register[] = new int[arr.length + 1];

		for (int i : arr) {
			register[i] = 1;

		}
		
		for (int i = 1; i < register.length; i++) {
			if (register[i]==0) {
				System.out.println(i);
			}
		}
		
	}

}
