package com.custom.exception;

public class TestException {

	public static void main(String[] args) {

		Voter p1 = new Voter("Shree", 23);
		Voter p2 = new Voter("Komal", 25);
		Voter p3 = new Voter("Swarup", 18);
		Voter p4 = new Voter("Sanskruti", 15);

		String res = (validAge(p4) ? "Valid Voter" : "Invalid voter");
		System.out.println(p1.getName() + " is " + res);

	}

	public static boolean validAge(Voter v) {
		if (v.getAge() >= 18)
			return true;
		else
			throw new InValidAgeException("invalid age exception");

	}

}
