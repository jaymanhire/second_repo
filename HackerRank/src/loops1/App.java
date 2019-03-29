package loops1;

import java.util.Scanner;

public class App {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();

		if (2 <= n && n <= 20) {

			for (int i = 1; i < 11; i++) {
				System.out.print(n + " x " + i + " = ");
				System.out.println(n * i);
			}
			// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			scanner.close();

		}
	}
}
