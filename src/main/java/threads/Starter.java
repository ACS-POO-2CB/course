package threads;

public class Starter implements Runnable {
	void go(long id) {
		System.out.println(id);
	}

	public static void main(String[] args) {
		System.out.print(Thread.currentThread().getId() + " ");
		Thread t=new Thread(new Starter());
		t.start();
		t.start();
	}

	public void run() {
		go(Thread.currentThread().getId());
	}
}
