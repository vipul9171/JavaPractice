package com.java.practice;

interface A
{
	default void overrideDefaultMethod()
	{
		System.out.println("Interface Default Method");
	
	}
}

class B implements A
{
	@Override
	public void overrideDefaultMethod()
	{
		System.out.println("Overriden method");
	}
}

public class OverrideDefaultMain 
{
	public static void main(String[] args) {
		
		A a=new B();
		a.overrideDefaultMethod();
		
	}

}
