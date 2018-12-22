package com.hashset.methods;

import java.util.ArrayList;
import java.util.Collections;
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

		// Convert hashset into arraylist
		ArrayList<Integer> myList = new ArrayList<>(hashSet);
		// Collections.sort(hashSet); //will not work, sort does not accept hashset, only List
		Collections.sort(myList);
		System.out.println(myList);

	}

}
