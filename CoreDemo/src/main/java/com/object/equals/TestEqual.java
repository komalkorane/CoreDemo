package com.object.equals;

public class TestEqual {

	public static void main(String[] args) {

		EqualDemo e1 = new EqualDemo("Komal", 10);
		EqualDemo e2 = new EqualDemo("Shree", 20);
		EqualDemo e3 = new EqualDemo("Komal", 10);
		
		System.out.println(e1 == e2);
		System.out.println(e1 == e3);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}

}
