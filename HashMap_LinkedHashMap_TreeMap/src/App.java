import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		// LinkedHashMap preserves the order of insertion.

		HashMap<String, String> dictionary = new HashMap<>();

		dictionary.put("Brave", "Ready to face danger.");
		dictionary.put("Billiant", "Exceptionally clever or talented.");
		dictionary.put("Joy", "A feeling of great pleasure and happiness");
		dictionary.put("Confidence", "The state of feeling certain about the truth of something.");

		// for(String word: dictionary.keySet()) {
		// System.out.println(dictionary.get(word));
		// }
		// for(String word: dictionary.keySet()) {
		// System.out.println(word);
		// }
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			System.out.println(entry.getValue());
		}

	}

}
