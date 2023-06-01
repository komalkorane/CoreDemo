package com.comparator.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Komal", "Developer");
		Employee e2 = new Employee(77, "Shree", "Manager");
		Employee e3 = new Employee(90, "Anu Vahini", "Tester");
		Employee e4 = new Employee(33, "Arati", "Developer");
		Employee e5 = new Employee(57, "Sayali", "Tester");

		CompareByName cn = new CompareByName();
		CompareByDept cd = new CompareByDept();

		/*
		 * Treeset not allowed duplicate so add the objects into list there is sort
		 * method in collections which accepts comparator obj & list obj
		 */

		List list = new ArrayList();
		list.add(e1);
		list.add(e3);
		list.add(e2);
		list.add(e5);
		list.add(e4);

		Collections.sort(list, cd);
		System.out.println(list);

//		TreeSet t = new TreeSet(cd);
//		t.add(e1);
//		t.add(e2);
//		t.add(e3);
//		t.add(e4);
//		t.add(e5);

//		System.out.println(t);

	}

}
