package threads;
public class App {

	public static void main(String[] args) {

		/*System.out.println("Starting thread 1: ");
		Task taskRunner = new Task("Thread_1");
		Thread t1 = new Thread(taskRunner);
		t1.start();

		System.out.println("Starting thread 2: ");

		Task taskRunner2 = new Task("Thread_2");
		Thread t2 = new Thread(taskRunner2);
		t2.start();*/
		// OR --
		System.out.println("Starting thread 1: ");		
		Thread t1 = new Thread(new Task("Thread_1"));
		t1.start();

		System.out.println("Starting thread 2: ");		
		Thread t2 = new Thread(new Task("Thread_2"));
		t2.start();
	}
}

class Task implements Runnable {

	String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {

		Thread.currentThread().setName(name);

		for (int i = 0; i < 100; i++) {
			System.out.println("Index: " + i + ": " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Oops!");

			}
		}
	}
}
