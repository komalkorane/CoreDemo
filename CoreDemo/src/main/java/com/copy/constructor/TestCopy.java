package com.copy.constructor;

public class TestCopy {

	public static void main(String[] args) {

		Book b1 = new Book("Mrutyunjay", 4000);
		Book b2 = new Book(b1);
		System.out.println(b2);
		
		Library lib = new Library(1, "PRO-WINGS", b1);
		Library library = new Library(lib);
		System.out.println(library);
	}

}
