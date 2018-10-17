import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		//HashSet does not retain order
		//Set<String> set1 = new HashSet<>();
		
		//LinkedHashSet retains order items were added in
		//Set<String> set1 = new LinkedHashSet<>();
		
		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse"); 
		set1.add("snake");
		set1.add("bear");
		
		// Adding duplicate items does nothing- Set omly contains unique items
		set1.add("mouse");
		
		System.out.println(set1);
		
		// Iterate through
		
		for(String element: set1) {
			System.out.println(element);
		}
		// Does set contain a certain item?
		if(set1.contains("aardvark")) {
			System.out.println("Contains aardvark");
		}
		if(set1.contains("cat")) {
			System.out.println("Contains cat");
		}
		if(set1.isEmpty()) {
			System.out.println("Set is empty.");
		} else {
			System.out.println("Set is not empty");
		}
		
		//////////// Intersection- Only elements common to both sets//////////////
		Set<String> set2 = new TreeSet<String>();

		set2.add("cat");
		set2.add("dog");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		// Difference between 2 sets
		
		Set<String> difference = new LinkedHashSet<String>(set1);
		
		difference.removeAll(set2);   // Or other way around set2 for set1
		System.out.println(difference );
		
		
		
		
		

	}

}
