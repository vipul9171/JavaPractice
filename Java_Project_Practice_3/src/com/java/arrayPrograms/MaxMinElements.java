package com.java.arrayPrograms;

public class MaxMinElements {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arr[] = { 3, 54, 652, 65, 2, 45 };
		for (int i : arr) {

			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;

			}

		}
		System.out.println("Min and Max"+min+" "+max);
	}

}
