package demo1;

class Runner extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println("Hello " + i);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class App {
	public static void main(String[] args) {
		
		//If you call run() it will run in the main method
		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();

	}

}
