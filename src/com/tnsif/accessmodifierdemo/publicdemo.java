package com.tnsif.accessmodifierdemo;

public class publicdemo {
	public int a =9;
	public String s="Radha";
	public void display() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		publicdemo p=new publicdemo();
		System.out.println(p.a);
		System.out.println(p.s);
	p.display();
	}

}
