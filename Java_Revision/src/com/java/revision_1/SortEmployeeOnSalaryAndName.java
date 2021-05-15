package com.java.revision_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	double salary;
	int age;

	public Employee(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}

public class SortEmployeeOnSalaryAndName {
	public static void main(String[] args) {
		/*
		 * Object name = new Object(); System.out.println(name.getClass());
		 */

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("xyz", 18, 32000));

		employees.add(new Employee("abe", 32, 38000));
		employees.add(new Employee("abc", 44, 88000));
		employees.add(new Employee("abc", 18, 28000));

		// sort by Salary
		/*
		 * List<Employee> employees2 = employees.stream().sorted((o1, o2) -> (int)
		 * (o2.getSalary() - o1.getSalary())) .collect(Collectors.toList());
		 * System.out.println(employees2);
		 */

		List<Employee> list = employees.stream().sorted((e1, e2) -> (int) e1.getAge() - e2.getAge())
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		System.out.println(list);
	}

}
