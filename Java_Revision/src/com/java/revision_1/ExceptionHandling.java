package com.java.revision_1;

public class ExceptionHandling
{
	public static void main(String[] args) 
	{
		try {
			int i=1/0;
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("catch Block exeuted");
		}
		finally {
			System.out.println("Finally Block Executed");
		}
		
	}

}
