package com.copy.constructor;

public class Book {

	String name;
	int page;
	public Book() {
		super();
	}
	
	public Book(Book b) {
		this.name = b.name;
		this.page = b.page;
	}
	
	
	public Book(String name, int page) {
		super();
		this.name = name;
		this.page = page;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", page=" + page + "]";
	}
	
	
}
