import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//String fileName = "/home/jlm/Documents/test.txt";
		String fileName = "test.txt";

		File textFile = new File(fileName);

		try {
			Scanner in = new Scanner(textFile);
			
			int value = in.nextInt();
			System.out.println("Read value: " + value);
			
			in.nextLine();  // this reads my new line character, leaves out blank line
			
			int count = 2;
			
			
			while (in.hasNextLine()) {
				String line = in.nextLine();
				
				System.out.println(count + ": " + line);
				count++;
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file: " + fileName);
			
		}

	}

}
