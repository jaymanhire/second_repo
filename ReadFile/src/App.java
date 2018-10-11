import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String fileName = "/home/jlm/Documents/test.txt";

		File textFile = new File(fileName);

		try {
			Scanner in = new Scanner(textFile);
			while (in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(line);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file: " + fileName);
			//e.printStackTrace();
		}

	}

}
