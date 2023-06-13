package com.array.exercise;
public class TMF4 {
	int i;
	static int j;
	{
		System.out.println("instance block 1  " + i);
	}
	static {
		System.out.println("static block 1  " + j);
		m2();
	}
	{
		i = 5;
	}
	static {
		j = 10;
	}
	public TMF4() {
		super();
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		TMF4 t = new TMF4();
	}
	public void m1() {
		System.out.println("instance method");
	}
	static {
		System.out.println("static 2 " + j);
	}
	{
		System.out.println("instance 2 " + i);
		m1();
	}
	public static void m2() {
		System.out.println("static method");
	}
}
