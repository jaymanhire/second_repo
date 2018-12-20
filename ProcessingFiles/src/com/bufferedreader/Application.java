package com.bufferedreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		File file = new File("/home/jlm/git/second_repo/ProcessingFiles/src/com/bufferedreader/myBufferdFile.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please check file name: " + file);
		} catch (IOException e) {
			System.out.println("Problem reading file. Please check file name: " + file.getName());

		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("Unable to close file. Please check file name: " + file.getName());
			} catch (NullPointerException np) {
				System.out.println("File probably never opened. " + file + " " + np + "\nPlease check file name.");
			}
		}

	}

}
