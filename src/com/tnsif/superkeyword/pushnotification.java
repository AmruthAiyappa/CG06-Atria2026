package com.tnsif.superkeyword;

class pushnotification extends notification{
	String msg="push notification";
	void display() {
		System.out.println("child "+msg);
		System.out.println("parent "+super.msg);
	}
	public static void main(String[] args) {
		pushnotification p=new pushnotification();
		p.display();
	}
}