package com.comparator.sort;

import java.util.Objects;

public class Employee {

	int id;
	String name;
	String dept;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			if (id == e.id && name.equals(e.name) && dept.equals(e.dept))
				return true;
			else
				return false;
		} else
			return false;
	}

	public int hashCode() {
		return Objects.hash(id, name, dept);
	}

}
