package com.tnsif.accessmodifierdemo2;

import com.tnsif.accessmodifierdemo.publicdemo;

public class demo3 {
	public static void main(String[] args) {
		publicdemo p=new publicdemo();
		System.out.println(p.a);
		System.out.println(p.s);
	p.display();

}
}