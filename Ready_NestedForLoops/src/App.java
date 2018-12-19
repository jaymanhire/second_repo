
public class App {

	public static void main(String[] args) {

		int counter = 0;

		for (int idx = 0; idx < 10; idx++) {

			for (int j = 0; j < 10; j++) { // Inner loop runs, for every iteration of outer loop

				System.out.println("The value of idx was: " + idx + " ---------- " + j);
				counter++;

			}
			System.out.println("Counter: " + counter);
		}

	}

}
