package com.comparator.mutablefield;

import java.util.Comparator;

public class SortDept implements Comparator<Department> {

//	public int compare(School o1, School o2) {
//	}

	public int compare(Department o1, Department o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
