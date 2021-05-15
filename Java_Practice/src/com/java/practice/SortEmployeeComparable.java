package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeNew {
	private int id;
	private String name;
	private int salary;

	public EmployeeNew(int id, String name, int salary) {
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
	public String toString() {
		return "EmployeeNew [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

class NameComparator implements Comparator<EmployeeNew> {

	
	public int compare(EmployeeNew emp1, EmployeeNew emp2) {

		return emp1.getName().compareTo(emp2.getName());

	}
}

public class SortEmployeeComparable {
	public static void main(String[] args) {
		List<EmployeeNew> list = new ArrayList<>();
		list.add(new EmployeeNew(102, "Test", 1002));
		list.add(new EmployeeNew(101, "Abc", 1001));
		list.add(new EmployeeNew(104, "Bca", 1004));
		list.add(new EmployeeNew(103, "Etx", 1003));
		
		Collections.sort(list, new NameComparator());
		System.out.println(list.toString());
	}

}
