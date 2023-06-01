package com.immutableclass;

public class TestImmutability {

	public static void main(String[] args) {
		
		Department dept = new Department("Maths");
		School s = new School(1214, "SSKB", dept);
		System.out.println(s);
		s.getDept().setSub("Stat");
		System.out.println(s);
		
	}
	
}
