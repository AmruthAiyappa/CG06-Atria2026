package multithreadingprogram;

public class tsynch {
	public static void main(String[] args) {
		example e=new example();
		
		t t1=new t(e);
		t t2=new t(e);
		t t3=new t(e);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}