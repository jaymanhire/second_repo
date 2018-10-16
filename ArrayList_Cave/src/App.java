import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		System.out.println("ArrayList numbers: " + numbers);

		// Retrieving
		System.out.println(numbers.get(1));

		// Index iteration

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("List of Integers, index " + i + ": " + numbers.get(i));
		}
		System.out.println("\n Iteration #2: ");
		for (Integer value : numbers) {
			System.out.println(value);
		}
		// removing items
		
		numbers.remove(numbers.size()-1);
		// This is very slow, removing from the beginning
		numbers.remove(0);
		System.out.println(numbers);
		
		System.out.println("-------------------");
		
	}

}
