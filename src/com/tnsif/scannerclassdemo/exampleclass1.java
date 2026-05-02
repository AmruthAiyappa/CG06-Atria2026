package com.tnsif.scannerclassdemo;
import java.util.Scanner;
public class exampleclass1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		exampleclass0 ex=new exampleclass0();
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter you age:");
		int age=sc.nextInt();
		System.out.println("Enter your gender:");
		String gender=sc.next();
	}
}
