package com.comparator.mutablefield;

import java.util.Comparator;

public class SortName implements Comparator<School> {

	public int compare(School o1, School o2) {
		return o1.name.compareTo(o2.name);
	}

}
