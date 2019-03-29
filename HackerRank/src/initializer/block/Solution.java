package initializer.block;

import java.util.Scanner;

public class Solution {

	private static int B;
	private static int H;
	private static boolean flag;

	private static final Scanner scanner = new Scanner(System.in);

	static {
		B = scanner.nextInt();
		H = scanner.nextInt();

		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		} else {
			flag = true;
		}
	}

	public static void main(String[] args) {

		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
