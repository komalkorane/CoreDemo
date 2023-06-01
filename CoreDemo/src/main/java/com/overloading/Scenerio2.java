package com.overloading;

public class Scenerio2 {

	private void disp(Long... i) {
		System.out.println("Long");
	}

	private void disp(long... i) {
		System.out.println("long");
	}

	public static void main(String[] args) {

		Scenerio2 s = new Scenerio2();
		s.disp((Integer) 10, 20, 30);

	}

}
