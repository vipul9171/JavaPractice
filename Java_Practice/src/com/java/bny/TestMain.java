package com.java.bny;

import java.util.HashSet;
import java.util.Set;

public class TestMain 
{
	public static void main(String[] args) {
		Set<Integer> integers =new HashSet<>();
		integers.add(101);
		integers.add(102);
		
		for (Integer integer : integers) {
			System.out.println(integer);
		}
	}

}
