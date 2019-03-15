package com.stuff;

public class CountEvenNums {

	public static void main(String[] args) {

		int[] numArray = { 2, 5, 6, 9, 8, 7, 44, 66, 55, 35, 98, 6877, 45 };
		int[] numArray2 = { 2, 5, 6, 9, 8, 7, 44, 66, 55, 35, 98, 6877, 45 };

		System.out.print("Quantity of even numbers: ");
		System.out.println(countEvens(numArray));

		System.out.println();

		System.out.print("Index position 4: ");
		System.out.println(getElementFrom(numArray, 4));

		System.out.println();
		
		System.out.print("Number of duplicates: ");
		System.out.println(countDuplicates(numArray, numArray2));

	}

	public static int countEvens(int elements[]) {
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int getElementFrom(int[] a, int index) {
		return a[index];
	}

	public static int countDuplicates(int[] items1, int[] items2) {
		int count = 0;
		for (int i = 0; i < items1.length; i++) {
			for (int j = 0; j < items2.length; j++) {
				if (items1[i] == items2[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
