package com.tnsif.polymorphism;
class father {
	int a=9;
	void drink() {
		System.out.println("tea");
	}
}
class son extends father{
	@Override
	void drink() {
		System.out.println("old monk");
	}
}
public class methodoverridingdemo{
	public static void main(String[] args) {
		son s=new son();
		s.drink();
	}
}