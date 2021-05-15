package com.java.stringPrograms;

public class RotationOfStrings {
	public static void main(String[] args) {
		String orignalString = "IndiaUSAEngland";
		String rotationalString = "EnglandIndiaUSA";

		boolean flag = checkRotation(orignalString, rotationalString);
		System.out.println(flag);

	}

	private static boolean checkRotation(String orignalString, String rotationalString) {

		
		if (orignalString.length()!=rotationalString.length()) {
			return false;
		}
		
		String concatenatedString = orignalString + orignalString;
		if (concatenatedString.indexOf(rotationalString) != -1) {
			return true;

		}

		return false;
	}

}
