package com.hashset.methods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		hashSet.add(10);
		hashSet.add(10);
		hashSet.add(10);
		hashSet.add(10);

		List<Integer> li = new ArrayList<Integer>(hashSet);  // pass in another list

		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(10);
		newList.add(67);
		newList.add(15);

		// boolean hasValue = list1.contains(67);
		// list1.clear();
		// boolean isEmpty = list1.isEmpty();
		hashSet.retainAll(newList);

		// list1.addAll(newList);
		// list1.removeAll(newList);

		System.out.println(hashSet);

	}

}
