package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {

		// MapAndFlatMap.mapFuntion();
		MapAndFlatMap.mapFlatFunction();

	}

	private static void mapFlatFunction() {
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		list1.add(Arrays.asList(1, 2));
		list1.add(Arrays.asList(3, 4));
		list1.add(Arrays.asList(5, 6));
		List<Integer> list2= list1.stream().flatMap(s->s.stream().map(m1->m1*2)).collect(Collectors.toList());
		System.out.println(list2);
	}

	private static void mapFuntion() {
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(201);
		arrayList1.add(202);
		arrayList1.add(203);
		ArrayList<Integer> list = (ArrayList<Integer>) arrayList1.stream().map(m1 -> m1 * 2)
				.collect(Collectors.toList());
		System.out.println(list);
	}

}
