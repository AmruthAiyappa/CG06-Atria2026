package com.tnsif.polymorphism;
class person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("name "+name);
	}
}
public class thismain{
	public static void main(String[] args) {
		person p=new person();
		p.setName("amruth");
		p.getName();
		p.display();
		
	}
}

