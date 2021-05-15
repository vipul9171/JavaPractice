package com.java.StringPrograms;

public class ReverseWordsInSentence 
{
	public static void main(String[] args) {
		String newString = "";
		String str="Reverse the words in array";
		String arr[]=str.split(" ");
		for (int i = arr.length-1; i >= 0; i--) {
			newString=newString+arr[i]+" ";
			
		}
		System.out.println(newString);
		
	}

}
