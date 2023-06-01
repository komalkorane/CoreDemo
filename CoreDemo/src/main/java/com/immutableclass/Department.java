package com.immutableclass;

public class Department {

	String sub;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String sub) {
		super();
		this.sub = sub;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Department [sub=" + sub + "]";
	}
	
	
	
	
}
