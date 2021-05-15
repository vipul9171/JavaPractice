package com.java.revision_1;

public class ExceptionCheck 
{
	public static void main(String[] args) {
		ExceptionCheck check=new ExceptionCheck();
		int str=check.checkTry();
		System.out.println(str);
	}

	private int checkTry() 
	{
		try {
			System.out.println("++++Try");
			return 2;
		} finally {
			System.out.println("Finally Block executed");
			return 7;
		}
	}
	

}
