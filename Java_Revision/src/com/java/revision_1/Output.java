package com.java.revision_1;

import java.util.Arrays;

class A
{
	public int i;
	private int j;
	void cat(int a, int b)
	{
		i=a+1;
		j=b;
	}
	void print()
	{
		System.out.println(j);
	}
	
}
public class Output {

	public static void main(String[] args) {
		/*
		 * 
		 * Map<Integer, Object> map=new TreeMap<Integer, Object>(); map.put(2,null);
		 * map.put(1,null); System.out.println(map);
		 */
	
		int arr[]=new int[5];
		for (int i = 5; i > 0; i--) 
			arr[5-i]=i;
		Arrays.fill(arr,1,4,8);
		for (int i = 0; i < 5; i++) 
			System.out.println(arr[i]);
	}
}
