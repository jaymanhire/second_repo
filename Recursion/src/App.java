
public class App {

	public static void main(String[] args) {
		// e.g. 4! = 4*3*2*1()

		System.out.println(factorial(6));

	}

	private static int factorial(int value) {

		if (value == 1) {
			return 1;
		} else {
			return factorial(value - 1) * value;
		}
	}
}
