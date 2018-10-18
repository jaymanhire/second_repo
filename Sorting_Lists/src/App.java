import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrLenCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else
			return 0;
	}

}

class ReverseAlphaOrder implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}

public class App {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");

		// Collections.sort(animals, new StrLenCompare());
		Collections.sort(animals, new ReverseAlphaOrder());

		for (String anims : animals) {
			System.out.println(anims);
		}

		List<Integer> numbers = new ArrayList<>();

		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		Collections.sort(numbers);

		for (Integer ints : numbers) {
			System.out.println(ints);
		}

	}

}
