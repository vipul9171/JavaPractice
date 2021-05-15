package com.java.revision_1;

public class Fibo 
{
	public static void main(String[] args) {
		
		int a=0;
		int c=1;
		System.out.print(a+" ");
		for (int i = 0; i < 6; i++)
		{
			System.out.print(c+" ");
			c=c+a;
			a=c-a;
			
		}
	}

}
