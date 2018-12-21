package com.bufferedreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		File file = new File("/home/jlm/git/second_repo/ProcessingFiles/src/com/bufferedreader/myBufferdFile.txt");

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please check file name: " + file);
		} catch (IOException e) {
			System.out.println("Problem reading file. Please check file name: " + file.getName());

		}
	}

}
