package com.comparator.mutablefield;

import java.util.TreeSet;

public class TestMutableComparator {

	public static void main(String[] args) {
		
		Department d1 = new Department("Stat", 10);
		Department d2 = new Department("Maths", 60);
		Department d3 = new Department("Mech", 40);
		School s1 = new School("SSKB", d1);
		School s2 = new School("RAEA", d3);
		School s3 = new School("JBB", d2);
		
		SortDept sd = new SortDept();
		SortName sn = new SortName();
	
		TreeSet t = new TreeSet(sn);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		System.out.println(t);
	}
	
	
}
