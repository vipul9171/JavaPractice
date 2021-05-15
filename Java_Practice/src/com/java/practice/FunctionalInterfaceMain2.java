package com.java.practice;

interface FunctionalAdd
{
	int add(int a, int b);
}


public class FunctionalInterfaceMain2 
{
	public static void main(String[] args) {
		FunctionalAdd functionalAdd=(a,b)->a*b;
		System.out.println(functionalAdd.add(2, 3));
	}

}
