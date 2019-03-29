package end.of.file;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		

		int lineCount = 1;

		do {
			System.out.println(lineCount + " " + scan.nextLine());
			lineCount++;

		} while (scan.hasNext());
		scan.close();
	}
}
