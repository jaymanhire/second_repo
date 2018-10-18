import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}*/

public class App {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		SortedSet<String> set = new TreeSet<String>(); // TreeSets Sorted automatically

		addElements(list);
		addElements(set);

		Collections.sort(list);

		showElements(list);
		System.out.println();
		showElements(set);

	}

	private static void addElements(Collection<String> col) {
		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
		col.add("Mike");
	}

	private static void showElements(Collection<String> col) {
		for (String element : col) {
			System.out.println(element);
		}
	}

}
