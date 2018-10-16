import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		/* ArrayLists manage arrays internally.*/

		ArrayList<Integer> arrayList = new ArrayList<>();
		
		/*LinkedLists consist of elements where each element has a reference to the previous and next element*/
		LinkedList<Integer> linkedList = new LinkedList<>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}

	private static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();

		/*// add items to end of list		
		 for (int i = 0; i < 1E5; i++) { 
		 list.add(i); 
		 }
		 */

		// Add items to beginning of list
		/*for (int i = 0; i < 1E5; i++) {
			list.add(0, i); // note the arg list here
		}		*/
		
		// Add items to the end of the list
		/*for (int i = 0; i < 1E5; i++) {
			list.add(list.size(), i); // note the arg list here
		}*/
		
		// Add items elsewhere in the list
		for (int i = 0; i < 1E5; i++) {
			list.add(list.size() - 1000, i); // note the arg list here
		}

		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + " ms. for " + type);

	}

}
