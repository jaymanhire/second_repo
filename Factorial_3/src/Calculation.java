import java.util.Scanner;

public class Calculation {

	static int n;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a non-negative integer: ");

		n = input.nextInt();
		System.out.println(factorial(n));
		
		input.close();			
	}

	public static long factorial(int n) {
		
		long result = 0;
		if (n == 0) { 
			result = 1;

		} else {
			result = factorial(n - 1) * n;
		}
		return result;
	}
}
