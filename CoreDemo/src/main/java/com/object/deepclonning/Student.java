package com.object.deepclonning;

public class Student implements Cloneable{

	String name;
	int roll;
	Address addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll, Address addr) {
		super();
		this.name = name;
		this.roll = roll;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", addr=" + addr + "]";
	}
	
	protected Object clone() {
		Address ad = new Address(addr.getCity(),addr.getPin());
		Student s = new Student(name,roll, ad);
		return s;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address("Gargoti", 416209);
		Student s1 = new Student("Komal", 1, addr);
		System.out.println(s1);
		Student s2 = (Student)s1.clone();
		System.out.println("After clone :"+s2);
		s2.getAddr().setCity("Mahalwadi");
		s2.getAddr().setPin(416223);
		System.out.println("After change :"+s1);
		System.out.println("After change :"+s2);
		
	}
}
