package com.tnsif.abstractiondemo;

abstract class Demo{
	public void calling() { 
		System.out.println("calling");
	}
	public abstract void AllIntegration(); 
	public abstract void Satelitedemo();
	public abstract void healthmonitoring();	
}

 class Test1 extends Demo{
	@Override
	public void AllIntegration() {
		System.out.println("welcome");		
	}
	@Override
	public void Satelitedemo() {
		System.out.println("welcome to python");	
	}
	@Override
	public void healthmonitoring() {
		System.out.println("welcome to ai");		
	}
}
public class abstractiondemo {
	public static void main(String[] args) {
	Test1 t=new Test1();
	t.AllIntegration();
	t.healthmonitoring();
	t.Satelitedemo();	
	}	
}