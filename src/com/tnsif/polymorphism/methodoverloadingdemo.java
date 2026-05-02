package com.tnsif.polymorphism;
class calculator{
	int add (int a, int b) {
		return a+b;
	}
	double add (double a, double b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class methodoverloadingdemo {
	public static void main(String[] args) {
		calculator c=new calculator();
		System.out.println(c.add(3, 5));
		System.out.println(c.add(3.5, 5.8));
		System.out.println(c.add(3, 5, 8));	
	}
}