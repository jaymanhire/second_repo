class Jay {
	public void printStuff() {
		System.out.println("Printing....");
	}

}

public class Application {

	public static void main(String[] args) {

		Task taskRunner = new Task();
		taskRunner.start();

		System.out.println("hello there...");
		// taskRunner.start(); // Cannot start a thread more than once

		Task taskRunner2 = new Task();
		taskRunner2.start();
		Jay j1 = new Jay();
		j1.printStuff();
	}

}

class Task extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("number: " + i);
		}

	}

}
