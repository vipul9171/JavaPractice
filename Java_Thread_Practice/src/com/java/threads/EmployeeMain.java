package com.java.threads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class Employee implements Comparable<Employee> 
{
	String anme;
	int age;
	double ctc;

	public Employee(String anme, int age, double ctc) {
		super();
		this.anme = anme;
		this.age = age;
		this.ctc = ctc;
	}

	public String getAnme() {
		return anme;
	}

	public void setAnme(String anme) {
		this.anme = anme;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	@Override
	public String toString() {
		return "Employee [anme=" + anme + ", age=" + age + ", ctc=" + ctc + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int) (this.getCtc()-this.getCtc());
	}

	
}

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Test1", 20, 22000));
		list.add(new Employee("Test2", 23, 20000));
		list.add(new Employee("Test3", 19, 18000));
		list.add(new Employee("Test4", 54, 32000));
		list.add(new Employee("Test5", 34, 76000));
		List<Employee>emp=list.stream().sorted((o1,o2)->(int)(o2.getCtc()-o1.getCtc())).collect(Collectors.toList());
		System.out.println(emp);     
	}

}
