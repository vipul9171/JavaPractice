package com.java.arrayPrograms;

public class ShiftZeros 
{
	public static void main(String[] args) {
		 int arr[]= {2,3,0,1,4,0,6,9};
		 
		 int count=0;
		 for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0)
			{
				arr[count++]=arr[i];
				
			}
		}
		 
		 while (count<arr.length) {
			arr[count++]=0;
		}
		 
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
				 
	}

}
