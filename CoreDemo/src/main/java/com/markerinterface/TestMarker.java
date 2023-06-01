package com.markerinterface;

public class TestMarker {

	public static void main(String[] args) {

		String s = new String();
		Demo d = new Demo();
		TestMarker t = new TestMarker();
		System.out.println(delete(s));
		System.out.println(delete(d));
		System.out.println(delete(t));
		

	}

	public static boolean delete(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Delatable)
			return true;
		else
			return false;
	}

}
