package com.tnsif.inheritencedemo;

class childclass extends fatherclass{ 
		String cycle="pink";
		void read() {
			System.out.println("Java");
		}
		public static void main(String[] args) {
			childclass c =new childclass();
			System.out.println(c.money);
			c.drink();
			System.out.println(c.car);
			System.out.println(c.cycle);
	}
	}

