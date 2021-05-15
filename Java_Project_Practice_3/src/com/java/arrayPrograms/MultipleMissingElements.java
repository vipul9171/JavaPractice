package com.java.arrayPrograms;

public class MultipleMissingElements {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 2, 4, 8, 9, 1 };

		int register[] = new int[arr.length+3];

		for (int i : arr) {

			register[i] = 1;
		}

		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}

		}

	}

}
