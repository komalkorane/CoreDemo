package com.array.exercise;
class Driver {
	int num;
	public Driver(int num) {
//		num = num;
	}
	public Driver() {
		num = 0;
}}
public class TMF3 {
	public static void main(String[] args) {
		Driver t = new Driver(20);
		update(t);
		System.out.println(t.num);
	}
	public static void update(Driver o) {
		o = new Driver();
		o.num = 50;
	}}
