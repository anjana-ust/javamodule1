package MultiThreading;

public class TestRunnable {
	public static void main(String[] args) {
		System.out.println("Main started...");
		System.out.println("Mains priority "+Thread.currentThread().getPriority());
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
	    t1.setDaemon(true);
	    t2.setDaemon(true);
		t1.start();
		t2.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("t1's priority "+t1.getPriority());
		System.out.println("t2's priority "+t2.getPriority());
		System.out.println("Main exited....");
	}

}
