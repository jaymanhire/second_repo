import java.util.ArrayList;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		words.add("hello");
		words.add("there");
		words.add("10");

		String item1 = words.get(2);
		System.out.println(item1);
		/*
		 * Object item2 = words.get(2); int item3 = (int)words.get(2);
		 */
		System.out.println();

		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(45);
		numbers.add(455);
		numbers.add(415);
		numbers.add(245);
		numbers.add(25);
		numbers.add(155);
		numbers.add(615);
		numbers.add(2545);
		numbers.remove(1);
		numbers.removeFirst();
		
		numbers.sort(null);

		for (int number : numbers) {
			System.out.println(number);
		}

	}
}