package multithreadingprogram;

public class workerthread extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"->Step"+i);
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {}
		}
	}
	public static void main(String[] args) {
		workerthread w1 = new workerthread();
		workerthread w2 = new workerthread();
		w1.setName("Thread A");
		w2.setName("Thread B");
		w1.start();
		w2.start();
	}

}
