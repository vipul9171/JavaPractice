package com.java.practice;

public class DivdeAndConcur {
	public static void main(String[] args) {

		int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = arr.length;
		int l = 0;
		int max_sum = DivdeAndConcur.maxElement(arr, l, n - 1);
		System.out.println(max_sum);
	}

	private static int maxElement(int[] arr, int l, int h) {

		if (h == l) {
			return arr[l];
		}
		int m = (l + h) / 2;

		return Math.max(Math.max(maxElement(arr, l, m), maxElement(arr, m + 1, h)), crossingElement(arr, l, m, h));

	}

	private static int crossingElement(int arr[], int l, int m, int h) {
		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for (int i = m; i >= l; i--) {
			sum = sum + arr[i];
			if (sum > left_sum) {

				left_sum = sum;
			}

		}
		sum = 0;
		int right_Sum = Integer.MIN_VALUE;
		for (int i = m + 1; i <= h; i++) {
			sum = sum + arr[i];
			if (sum > left_sum) {
				right_Sum = sum;

			}
		}

		return Math.max(left_sum + right_Sum, Math.max(left_sum, right_Sum));
	}

}
