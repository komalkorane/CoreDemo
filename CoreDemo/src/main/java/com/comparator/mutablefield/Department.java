package com.comparator.mutablefield;

public class Department {

	String name;
	int id;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
