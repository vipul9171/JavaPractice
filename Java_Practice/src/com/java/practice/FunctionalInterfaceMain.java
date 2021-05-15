package com.java.practice;

@FunctionalInterface
interface Functional {
	default void test1()
	{
		System.out.println("This is test1 method");
	}
	
	default void test2()
	{
		System.out.println("This is test2 method");
	}
	
	void display();
}

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		Functional functional = () -> {
			System.out.println("this is display");
		};
		functional.display();
		functional.test1();
		functional.test2();
		
	}
}
