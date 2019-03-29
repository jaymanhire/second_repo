package strings.introduction;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();

		int sum = A.length() + B.length();
		System.out.println(sum);

		/*int alphOrder = A.compareToIgnoreCase(B);
		// System.out.println(alphOrder);

		if (alphOrder < 0) {
			System.out.println("No");
		} else if (alphOrder == 0) {
			System.out.println("Equal");
		} else {
			System.out.println("Yes");
		}*/
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No"); 

		System.out.println(capitalFirstLetter(A) + " " + capitalFirstLetter(B));

	}

	private static String capitalFirstLetter(String str) {
		if (str == null || str.length() == 0) {
			return "";
		} else
			return str.substring(0, 1).toUpperCase() + str.substring(1);

	}

}
