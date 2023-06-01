package com.comparable.sort;

import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Komal", "Maths");
		Student s2 = new Student(31, "Shree", "Mechanical");
		Student s3 = new Student(76, "Sayli", "Commerce");
		Student s4 = new Student(121, "Arati", "Chemisty");
		Student s5 = new Student(89, "Priyanka", "Electronics");
		Student s6 = new Student(35, "Jyoti", "Computer");
		
		TreeSet t = new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		t.add(s6);
		
		System.out.println(t);
	}
	
	
}
