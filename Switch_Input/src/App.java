import java.util.Scanner;

class Jay {
	public int mathApp(int x) {
		return x;
	}
}

public class App {

	public static void main(String[] args) {
		
		Jay j = new Jay();
		System.out.println(j.mathApp(655));

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a command: ");

		String text = input.nextLine();

		switch (text) {

		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped.");
			break;
		case "up":
			System.out.println("Machine speed increased...");
			break;
		default:
			System.out.println("Invalid input.");

		}
		input.close();

	}

}
