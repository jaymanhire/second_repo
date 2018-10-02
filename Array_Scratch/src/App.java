
public class App {

	public static void main(String[] args) {

		int[] myArray;
		myArray = new int[3];
		myArray[0] = 12;
		System.out.println("Index 0: " + myArray[0]);

		int[] values = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < 5; i++) {
			System.out.print(values[i] - 1 + " ");
		}

		System.out.println("\n");

		int[] values2 = new int[5];
		values2[0] = 587879;
		values2[1] = 10;
		values2[2] = 56;
		values2[3] = 598;
		values2[4] = 13784;

		System.out.println("Value [0]: " + values2[0]);
		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i] + " ");
		}

		String[] strArray = new String[3];
		// String[] strArray = {"apple","orange","pear"};
		strArray[0] = "apple";
		strArray[1] = "orange";
		strArray[2] = "pear";

		System.out.println(strArray[2]);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println(" ");
		for (String fruit : strArray) {
			System.out.println(fruit);
		}

		int[][] grid = { { 1, 3, 5, 7, 9 }, 
						 { 2, 4, 6, 8, 10 }

		};

		System.out.println("Element 0, 1: " + grid[0][1]);
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");

			}
			System.out.println(" ");
		}

	}

}
