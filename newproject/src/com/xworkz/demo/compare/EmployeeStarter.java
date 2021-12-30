package com.xworkz.demo.compare;

import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeStarter {

	public static void main(String[] args) {
		
		SortedSet<Employee> set = new TreeSet<Employee>();
		
		Employee emp1 = new Employee(1, "Santhosh", "Karnataka", 3f);
		Employee emp2 = new Employee(2, "Praveen", "Tamil Nadu", 5f);
		Employee emp3 = new Employee(3, "Pooja", "Kerala", 8f);
		Employee emp4 = new Employee(4, "Vasanth", "Andrapradesh", 2f);
		Employee emp5 = new Employee(5, "Priya", "Karnataka", 10f);
		

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		
		System.out.println(set);
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(set.first());
		System.out.println("----------------------------------------------------------------");
		System.out.println(set.last());
		System.out.println("----------------------------------------------------------------");
		System.out.println(set.headSet(emp4));
		System.out.println("----------------------------------------------------------------");
		System.out.println(set.tailSet(emp3));
		System.out.println("----------------------------------------------------------------");
		System.out.println(set.subSet(emp2, emp4));
		System.out.println("----------------------------------------------------------------");


	}

}
