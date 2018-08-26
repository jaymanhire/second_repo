import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text: ");

		String line = input.nextLine();

		System.out.println("You entered: " + line);

		// input.close();

		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter floating point value: ");

		float floatVal = input2.nextFloat();

		System.out.println("You entered: " + floatVal);

		input.close();
		input2.close();

	}

}
