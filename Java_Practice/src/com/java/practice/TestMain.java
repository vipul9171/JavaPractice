package com.java.practice;

class A1 
{
	 static void display()
	{
		System.out.println("this class A display");
	}
	
}
class B1 extends A1
{

	 static void disply()
	{
		System.out.println("Test");
	}
}

public class TestMain 
{
	public static void main(String[] args) {
		A1.display();
		
	}
	
}
