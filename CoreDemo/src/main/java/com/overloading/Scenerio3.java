package com.overloading;

public class Scenerio3 {

	private void disp(Double... i) {
		System.out.println("Double");
	}

	private void disp(double... i) {
		System.out.println("double");
	}

	public static void main(String[] args) {

		Scenerio3 s = new Scenerio3();
		Double d = 10.2;
//		s.disp(d);

	}
	
	
}
