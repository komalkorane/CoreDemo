package com.comparable.sort;

public class Student implements Comparable<Student>{

	int roll;
	String name;
	String sub;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String sub) {
		super();
		this.roll = roll;
		this.name = name;
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", sub=" + sub + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (roll == s.roll && name.equals(s.name) && sub.equals(s.sub))
				return true;
			else
				return false;
		}
		return false;
	}

//	public int compareTo(Student o) {
//        Student s = (Student)o;
//        if(this.roll==s.roll)
//        	return 0;
//        else if(this.roll>s.roll)
//        	return 1;
//        else
//        	return -1;
//	}
	public int compareTo(Student i) {
      
            return -this.name.compareTo(i.name);
}
	}
