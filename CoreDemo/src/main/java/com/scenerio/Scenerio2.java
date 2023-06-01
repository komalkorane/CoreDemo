package com.scenerio;

public class Scenerio2 {

	public static void main(String[] args) {

		Parent p = new Child();
		p.m1();
	}
}

class Parent {

	Parent() {
		m1();
	}
	public void m1() {
		System.out.println("parent");
	}
}

class Child extends Parent {

	int x = 5;
	public void m1() {
		System.out.println(x);
	}
}