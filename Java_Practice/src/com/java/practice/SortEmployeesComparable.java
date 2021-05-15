package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public int compareTo(Employee emp) {
		if (id == emp.getId()) {
			return 0;
		} else {
			if (id > emp.getId()) {
				return 1;
			}
		}
		return -1;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class SortEmployeesComparable {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(102, "Employee2", 1002));
		list.add(new Employee(101, "Employee1", 1001));
		list.add(new Employee(104, "Employee4", 1004));
		list.add(new Employee(103, "Employee3", 1003));
		System.out.println("List before sorting of elements");
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println("List After sorting of elements");
		System.out.println(list.toString());

	}

}
