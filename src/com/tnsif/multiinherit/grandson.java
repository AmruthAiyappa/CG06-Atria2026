package com.tnsif.multiinherit;

class grandson extends son{
	void display() {
		System.out.println("I am grandson");
	}
	public static void main(String[] args) {
		grandson gs=new grandson();
		System.out.println(gs.age);
		System.out.println(gs.name);
		gs.display();
		
	}

}
