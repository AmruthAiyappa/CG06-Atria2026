package com.tnsif.superkeyword;

class gpay extends payment{
	void process() {
		System.out.println("Processing via GPay");
	}
	void display() {
		super.process();
		process();
	}
	public static void main(String[] args) {
		gpay g=new gpay();
		g.display();
	}
}
