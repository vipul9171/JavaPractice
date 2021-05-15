package com.java.streamAPI;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List list = List.of(2, 3, 41, 43, 12, 23, 34, 41);
		List<String> names = List.of("Saket", "Trevor", "Franklin", "Michael");

		// StreamAPI.printEvenNumberInString(list);
		// StreamAPI.squareRootOfMapping(list);
		HashSet<Integer> hashSet=new HashSet<>();
		StreamAPI.printUpperCaseString(names);
		ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap<>();
		

	}

	private static void printUpperCaseString(List<String> names) {
		List<String> toUpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		toUpperCase.forEach(System.out::println);

	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printEvenNumberInString(List<Integer> integers) {
		integers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	private static void squareRootOfMapping(List<Integer> integers) {
		integers.stream().filter(n -> n < 10).map(n -> n * n).forEach(System.out::println);
	}
}
