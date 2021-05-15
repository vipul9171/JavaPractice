package com.java.revision_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Java8Stream2 {
	public static void main(String[] args) {
		int vals[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

		// int sum = Arrays.stream(vals).sum();
		/*
		 * OptionalDouble sum = Arrays.stream(vals).average(); System.out.println(sum);
		 */

		/*
		 * String[] array = { "Geeks", "for", "Geeks" };
		 * 
		 * Optional<String> String_combine = Arrays.stream(array).reduce((e1, e2) -> e1
		 * + "-" + e2);
		 * 
		 * String_combine.ifPresent(System.out::println);
		 */

		Map<String, Integer> map = new HashMap<>();
		map.put("A1", 111);
		map.put("B1", 102);
		map.put("B2", 123);
		map.put("B3", 104);
		// map.entrySet().stream().forEach(System.out::println);

		/*
		 * Map<String, Integer> sorted =
		 * map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		 * .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),(e1, e2) ->
		 * e2,LinkedHashMap::new));
		 */

		/*
		 * Map<String, Integer> sorted =
		 * map.entrySet().stream().sorted(Collections.reverseOrder(Entry.
		 * comparingByValue())) .collect(Collectors.toMap(Entry::getKey,
		 * Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		 * System.out.println(sorted);
		 */

		/*Reverse
		 * Map<String, Integer> sorted =
		 * map.entrySet().stream().sorted(Collections.reverseOrder(Entry.
		 * comparingByValue())) .collect(Collectors.toMap(Entry::getKey,
		 * Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		 * System.out.println(sorted);
		 */

		//Ascending sort
		Map<String, Integer> map2 = map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(map2);
	}

}
