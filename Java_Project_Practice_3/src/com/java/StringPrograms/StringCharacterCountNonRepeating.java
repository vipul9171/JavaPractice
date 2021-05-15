package com.java.StringPrograms;

public class StringCharacterCountNonRepeating {
	public static void main(String[] args) {
		String str = "AAAAABBCCAADDD";
		stringCount(str);

	}

	private static void stringCount(String str) {
		char arr[] = str.toCharArray();
		int count = 0;
		char previous = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (previous == arr[i]) {
				count++;

				if (arr.length - 1 == i) {
					System.out.print(arr[i - 1] + "" + count);
				}

			} else {
				System.out.print(arr[i - 1] + "" + count);
				previous = arr[i];
				count = 1;

			}

		}

	}

}
