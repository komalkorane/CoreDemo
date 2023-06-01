package com.copy.constructor;

public class Library {

	int id;
	String name;
    Book book;
	public Library() {
		super();
	}
	public Library(int id, String name, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}
	
	public Library(Library l) {
		this.id=l.id;
		this.name = l.name;
		Book b = new Book();
		this.book = l.book;
		
	}
	
	
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
    
    
	
}
