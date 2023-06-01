package com.overloading;

public class Scenerio1 {

	
	private void disp(Integer... a) {
		System.out.println("Integer");
	}
	private void disp(Number... a) {
		System.out.println("Number");
	}
	private void disp(Object o) {
		System.out.println("Object");
	}
	private void disp(int... a) {
		System.out.println("int");
	}
	
	public static void main(String[] args) {

		Scenerio1 s = new Scenerio1();
//		int a = 10;
//		s.disp(10, 30, 70);
	}

	
}
