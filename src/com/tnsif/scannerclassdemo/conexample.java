package com.tnsif.scannerclassdemo;

public class conexample {
	conexample(){
		System.out.println("default con");
	}
	conexample(int a, String b) {
		System.out.println("1 parameter");
	}
	conexample(int b) {
		System.out.println("2 parameter");
	}
	conexample(int s, int r, int t){
		System.out.println("3 parameter");
	}
	public static void main(String[] args) {
		conexample c=new conexample();
		conexample c1=new conexample(1, "Amruth");
		conexample c2=new conexample(9);
		conexample c3=new conexample(3,5,8);
		
		
		
	}
}
