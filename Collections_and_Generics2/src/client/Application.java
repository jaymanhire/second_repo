package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

		Container<Integer, String> container = new Container<>(12, "Hello");

		container.getItem1();
		container.getItem2();
		container.printItems();
		System.out.println();

		Container<Double, Integer> container2 = new Container<>(12.25, 100);
		double val3 = container2.getItem1();
		int val4 = container2.getItem2();
		container2.printItems();
		System.out.println();

		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("Computer");

		Set<String> mySet2 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("whatever");

		Set<String> resultSet = union(mySet1, mySet2);

		Iterator<String> itr = resultSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}
}
