package com.java.revision_1;

public class MaxMin {
	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arr[] = { 2, 3, 12, 2, 34, 54, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else {
				if (min >arr[i]) {
					min = arr[i];
				}

			}

		}
		System.out.println("Max is:"+max);
		System.out.println("Min is:"+min);
	}
	

}
