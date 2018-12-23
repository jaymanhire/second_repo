package customclass.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {

		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));

		// Convert hashset into arraylist
		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);

		Collections.sort(myList);

		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

	}

}
