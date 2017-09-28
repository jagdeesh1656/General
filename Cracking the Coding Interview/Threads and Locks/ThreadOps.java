class ThreadClass implements Runnable 
{
	int counter = 0;
	public synchronized void run()
	{
		System.out.println(counter);
		counter = counter + 1;
	}
}

public class ThreadOps
{
	public static void main(String[] args) {
		
		ThreadClass threadObject = new ThreadClass();
		Thread thread1 = new Thread(threadObject);
		Thread thread2 = new Thread(threadObject);
		Thread thread3 = new Thread(threadObject);
		Thread thread4 = new Thread(threadObject);
		Thread thread5 = new Thread(threadObject);

		thread1.start();
		thread2.start();
		thread3.start();

		new Thread() { public void run() {
				for (;;) System.out.println("Stop!!!");
			} } .start();
	}
}