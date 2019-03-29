package initialize.arrays;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int[] myArray = new int[10];

		int z = -1;
		z = 0;

		for (int i = 0; i < myArray.length; i++) {
			z = z + myArray[i];
			z++;
			System.out.println(z);
		}

		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}

		System.out.println("*****Calculate Average*******");
		
		Scanner scan = new Scanner(System.in);
		float b = 0;
		float c = 0;
		float d = 0;
		float e = 0; 
		float f = 0;
		
		System.out.println("Enter 5 numbers: ");
		b = scan.nextFloat();		
		c = scan.nextFloat();
		d= scan.nextFloat();
		e = scan.nextFloat();
		f = scan.nextFloat();
		
		scan.close();

		float[] numrays = { b,c,d,e,f };
		float a = 0;

		for (int i = 0; i < numrays.length; i++) {
			a = a + numrays[i];
			System.out.println(a);			
		}

		System.out.println("Average : " + (a / numrays.length));
	}

}
