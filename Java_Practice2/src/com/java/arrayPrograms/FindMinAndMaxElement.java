package com.java.arrayPrograms;

public class FindMinAndMaxElement {
	public static void main(String[] args) {
		int arr[] = { 23, 43, 45, 12, 45 };
		int high = Integer.MIN_VALUE;
		int low = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > high) {
				high = arr[i];

			} else {

				if (arr[i] < low) {
					low = arr[i];

				}
			}
		}
		System.out.println(high+" "+low);

	}

}
