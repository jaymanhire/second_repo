
public class App {

	public static void main(String[] args) {

		System.out.println("Starting thread 1: ");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100_000; i++) {
					System.out.println("Index: " + i + ": " + Thread.currentThread().getName());
					/*try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						System.out.println("Oops!");

					}*/
				}
			}

		});
		t1.start();

		System.out.println("Starting thread 2: ");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100_000; i++) {
					System.out.println("Index: " + i + ": " + Thread.currentThread().getName());
				/*	try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						System.out.println("Oops!");

					}*/
				}
			}

		});
		t2.start();

		System.out.println("Starting thread 3: ");

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100_000; i++) {
					System.out.println("Index: " + i + ": " + Thread.currentThread().getName());
					/*try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						System.out.println("Oops!");

					}*/
				}
			}

		});
		t3.start();
	}
}

class Task implements Runnable {

	String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {

		/*for (int i = 0; i < 1000; i++) {
			System.out.println("Index: " + i + ": " + Thread.currentThread().getName());
			/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Oops!");

			}*/
		}
	}

