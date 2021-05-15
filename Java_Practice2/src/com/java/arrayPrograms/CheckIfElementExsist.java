package com.java.arrayPrograms;

public class CheckIfElementExsist {
	public static void main(String[] args) {
		int arr[] = { 23, 43, 2, 35, 54, 6, 5 };
		int number = 3;
		exsist(arr, number);

	}

	private static boolean exsist(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.println("Number exsist at index " + i);
				return true;
			}

		}
		System.out.println("Number doesn't Exsist");
		return false;
	}

}
