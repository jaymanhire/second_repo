
public class App {

	public static void main(String[] args) {

		System.out.println("Starting thread 1: ");
		Task taskRunner = new Task("Thread_1");
		taskRunner.start();

		System.out.println("Starting thread 2: ");

		Task taskRunner2 = new Task("Thread_2");
		taskRunner2.start();
	}
}

class Task extends Thread {

	String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {

		Thread.currentThread().setName(name);

		for (int i = 0; i < 1000; i++) {
			System.out.println("Index: " + i + ": " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Oops!");

			}
		}
	}
}
