package com.java.stringPrograms;

public class ResverseStringWithoutAnyLibrary {
	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		char arr[] = str.toCharArray();
		System.out.println(str);
		
		for (int i = str.length()-1; i >=0; i--)
		{
			String s=""+arr[i];
			System.out.print(s);
		}

	}

}
