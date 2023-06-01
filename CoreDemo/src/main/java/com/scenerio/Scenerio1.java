package com.scenerio;

public class Scenerio1 {

	public static void main(String[] args) {

		A a = new A();
/*		System.out.println(i);      Compile time error coz i is instance variable only called with reference....
		                            & i=30 is local variale not accessed outside the constructor
		                            */
		System.out.println(a.i);
	}

}

class A {
	int i = 10;

	A() {
		int i = 30;
	}
}
