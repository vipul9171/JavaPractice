package com.java.practice;

public class ArrayMissingElment01 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 1, 7, 9, 6, 5 };

		int register[] = new int[arr.length + 1];

		for (int i : arr) {

			register[i] = 1;
		}

		for (int i = 1; i < register.length-1; i++) {
			if (register[i] == 0) {
				System.out.println(i);

			}
		}

		
	}

}
