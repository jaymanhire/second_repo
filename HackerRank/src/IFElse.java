import java.util.Scanner;

public class IFElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		/* Determine answer */
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n >= 6 && n <= 20) {
				ans = "Weird";
			} else if(n % 2 == 0 && n >= 2 && n <= 5 || n > 20) {
				ans = "Not Weird";
			}
		}

		/* Print output */
		System.out.println(ans);
		

	}

}
