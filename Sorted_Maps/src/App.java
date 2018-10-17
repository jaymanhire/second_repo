import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

public class App {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		
		
		testMap(treeMap);  // treeMap, natural ordering
		// System.out.println(new Temp());

	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);

		}

	}

}
