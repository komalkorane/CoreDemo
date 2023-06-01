package com.comparator.mutablefield;

import java.util.Objects;

public class School {

	String name;
	Department dept;

	public School() {
		super();
	}

	public School(String name, Department dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", dept=" + dept + "]";
	}

	public int hashCode() {
		return Objects.hash(name, dept);
	}

	public boolean equals(Object o) {
		if (o instanceof School) {
			School s = (School) o;
			if (name.equals(s.name) && dept.equals(s.dept))
				return true;
			return false;
		}
		return false;

	}
}
