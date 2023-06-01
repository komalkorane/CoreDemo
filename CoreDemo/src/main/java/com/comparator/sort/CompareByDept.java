package com.comparator.sort;

import java.util.Comparator;

public class CompareByDept implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.dept.compareTo(o2.dept);
	}

}
