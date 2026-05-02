package com.tnsif.interfacedemo;
interface Smartdevice{
	void turnON();
	void turnOFF();
	void getStatus();
}
class Smartlight implements Smartdevice{

	@Override
	public void turnON() {
		System.out.println("Smart light on");
		
	}

	@Override
	public void turnOFF() {
		System.out.println("Smart light off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Smart light is on STAND-BY mode");
		
	}
	
}
public interface interfacedemo {
	public static void main(String[] args) {
		Smartlight sl=new Smartlight();
		sl.turnON();
		sl.turnOFF();
		sl.getStatus();
	}
}
