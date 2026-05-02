package com.tnsif.interfacedemo;

import com.tnsif.scannerclassdemo.mainmethod;

interface camera{
	void takephoto();
}
interface musicplayer{
	void playmusic();
}
class smartphone implements camera,musicplayer{

	@Override
	public void playmusic() {
		System.out.println("Taking a photo with the smartphone");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Listening to music on the musicplayer");
		
	}
	
}

public interface multipleinterface {
	public static void main(String[] args) {
		smartphone ph=new smartphone();
		ph.takephoto();
		ph.playmusic();
	}
}
