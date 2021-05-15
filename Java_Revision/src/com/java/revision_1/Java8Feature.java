package com.java.revision_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class EmployeeNew {

	String name;
	int salary;
	int age;
	String city;

	public EmployeeNew(String name, int salary, int age, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmployeeNew [name=" + name + ", salary=" + salary + ", age=" + age + ", city=" + city + "]";
	}

}

public class Java8Feature {
	public static void main(String[] args) {
		List<EmployeeNew> list = new ArrayList<EmployeeNew>();
		list.add(new EmployeeNew("Emp1", 320000, 21, "Indore"));
		list.add(new EmployeeNew("Emp2", 660000, 20, "Mumbai"));
		list.add(new EmployeeNew("Emp3", 450000, 32, "Indore"));
		list.add(new EmployeeNew("Emp4", 340000, 38, "Mumbai"));
		list.add(new EmployeeNew("Emp5", 250000, 35, "Pune"));
		list.add(new EmployeeNew("Emp6", 760000, 23, "Indore"));

		// sorted employee on the basis of salary
		/*
		 * List<EmployeeNew> employeeNews = list.stream().sorted((e1, e2) -> (int)
		 * (e1.getSalary() - e2.getSalary())) .collect(Collectors.toList());
		 * System.out.println(employeeNews.toString());
		 */
		// using joining method to seperate the values
		/*
		 * String str=
		 * list.stream().map(EmployeeNew::getName).collect(Collectors.joining(","));
		 * System.out.println(str);
		 */

		// using filters to get the salary greater than a specific value
		/*
		 * List<EmployeeNew>
		 * list2=list.stream().filter(e->e.getSalary()>250000).collect(Collectors.toList
		 * ()); System.out.println(list2.toString());
		 */

		// using arrayto check if array contains the numbers less
		// Java8Feature.arrayContain()

		// Getting Average Salary
		/*
		 * IntSummaryStatistics doubleSummaryStatistics =
		 * list.stream().mapToInt(EmployeeNew::getSalary) .summaryStatistics();
		 * 
		 * System.out.println(doubleSummaryStatistics.getMin());
		 */

		// Filter by a City
		/*
		 * List<EmployeeNew>
		 * list2=list.stream().filter(e->e.getCity().equals("Indore")).collect(
		 * Collectors.toList()); System.out.println(list2.toString());
		 */

		// Group by through Streams
		/*
		 * Map<String, List<EmployeeNew>>
		 * list2=list.stream().collect(Collectors.groupingBy(EmployeeNew::getCity));
		 * System.out.println(list2);
		 */

		// O
		/*
		 * final Optional<EmployeeNew>
		 * str=list.stream().filter(n->n.getName().startsWith("I")).findFirst();
		 * System.out.println(str.toString());
		 */

		/*
		 * // Using flatMap for transformating and flattening. List<Integer> listofInts
		 * = listOfListofInts.stream() .flatMap(list -> list.stream())
		 * .collect(Collectors.toList());
		 */

		/*
		 * Comparator<EmployeeNew> comparator=
		 * Comparator.comparing(EmployeeNew::getCity).thenComparing(EmployeeNew::getAge)
		 * ;
		 * 
		 * List<EmployeeNew>
		 * list2=list.stream().sorted(comparator).collect(Collectors.toList());
		 * System.out.println(list2.toString());
		 */

		// Java Reduce function to represent single resultant value
		/*
		 * Optional<EmployeeNew>
		 * highestSalary=list.stream().reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:
		 * e2); highestSalary.ifPresent(System.out::println);
		 */

		Map<String, EmployeeNew> map = new HashMap<>();
		map.put("a", new EmployeeNew("Emp1", 320000, 91, "Indore"));
		map.put("b", new EmployeeNew("Emp2", 660000, 20, "Mumbai"));
		map.put("c", new EmployeeNew("Emp3", 450000, 32, "Andore"));

		/*
		 * //Sorting map on the basis of Integer with use of Interger Wrapper class
		 * compare method similarly other wrapper classes also have compare method
		 * 
		 * Map<String, EmployeeNew> map2 = map.entrySet().stream() .sorted((e1, e2) ->
		 * Integer.compare(e1.getValue().getAge(), e2.getValue().getAge()))
		 * .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1,
		 * LinkedHashMap::new)); System.out.println(map2);
		 */

		// Map<String, EmployeeNew>
		// map3=map.entrySet().stream().sorted((e1,e2)->String.)
		/*
		 * Map<String, EmployeeNew> map3 = map.entrySet().stream() .sorted((e1, e2) ->
		 * e1.getValue().getName().compareTo(e2.getValue().getName()))
		 * .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1),
		 * LinkedHashMap::new);
		 */

		// Comparator<EmployeeNew>
		// comareByCity=Comparator.comparing(EmployeeNew::getSalary);
		//list.stream().sorted((e1, e2) -> e1.getCity().compareTo(e2.getCity())).forEach(System.out::println);

		Map<Object, Object> map2 = map.entrySet().stream()
				.sorted(Entry.comparingByValue((e1, e2) -> e1.getAge()-e2.getAge()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(map2);

	}

	private static void arrayContain() {
		int arr[] = { 2, 3, 13, 34, 3, 42, 32, 22, 12, 35 };
		Arrays.stream(arr).filter(n -> n < 30).forEach(System.out::println);

	}

}
