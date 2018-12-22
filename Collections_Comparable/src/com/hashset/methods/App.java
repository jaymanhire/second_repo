package com.hashset.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Random");
		hashSet.add("Tooth Brush");
		hashSet.add("Computer");
		hashSet.add("Cloths");
		

		// Convert hashset into arraylist
		ArrayList<String> myList = new ArrayList<>(hashSet);
		// Collections.sort(hashSet); //will not work, sort does not accept hashset, only List
		Collections.sort(myList);  // Natural Ordering
		System.out.println(myList);

	}

}
