package com.java.practice;

public class Fibonacci {
	public static void main(String[] args) {
		printSeries(7);
	}

	private static void printSeries(int length) {
		int a = 0;
		System.out.print(a+" ");
		int c = 1;
		for (int i = 1; i <= length; i++) {

			System.out.print(c+" ");
			c =c+a;
			a=c-a;
			
			


		}

	}

}
