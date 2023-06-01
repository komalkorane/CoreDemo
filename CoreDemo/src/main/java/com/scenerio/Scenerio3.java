package com.scenerio;

public class Scenerio3 {
	int i = 10;

	public Scenerio3() {
		int i = 30;
	}


	public static void main(String[] args) {
		Scenerio3 sc = new Scenerio3();
//		System.out.println(i);         // compile time error coz to call instance variable need object ref.
        System.out.println(sc.i);
	}
/* i=30 is local variable which scope is within that constructor body only 
 *     */
	
}
