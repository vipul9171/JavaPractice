package com.java.practice;
import java.util.Date;

public class ArrayMultipleMissingElements 
{
	public static void main(String[] args) {
		int arr[]= {2,3,1,4,5,3,2,5,9,4};
		int register[]= new int[arr.length];
		for (int i : arr) 
		{
			register[i]=1;
			
		}
		System.out.println("Missing Elements are:");
		for (int i = 1; i < register.length; i++) {
			if (register[i]==0)
			{
				System.out.println(i);
				
			}
		}
	}
}
