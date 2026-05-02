package multithreadingprogram;

public class t extends Thread{
	example e;
	t(example e){
		this.e=e;
	}
	public void run() {
		e.display();
	}

}