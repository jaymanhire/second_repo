import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		File file = new File("/home/jlm/workspace/ProcessingFiles/src/myFile.txt");
		Scanner input;
		try {
			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);

			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, cannot find file: " + file);

		}
		MyFileUtils myUtil = new MyFileUtils();
		try {
			myUtil.subtract(9);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}