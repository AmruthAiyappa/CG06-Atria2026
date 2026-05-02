package com.tnsif.scannerclassdemo;

import java.util.Scanner;

public class mainmethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the person name");
	String name=sc.next();
	System.out.println("enter the income");
	int income=sc.nextInt();
	
	person pp=new person();
	pp.setName(name);
	pp.setIncome(income);
	
	taxcalculation t=new taxcalculation();
	t.CalculateTax(pp);
	
	System.out.println("after tax calculation");
	
	System.out.println(pp);
}
}