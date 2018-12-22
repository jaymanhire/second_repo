package com.hashset.linkedhashset;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		//Prevents duplicate values		
		//HashSet doe not maintain order, LinkedHashSet maintains entry order
		LinkedHashSet<String> values = new LinkedHashSet<>();
		values.add("right");
		values.add("car");
		values.add("zoo");
		values.add("zoo");
		values.add("car");
		
		
		for(String value: values) {
			System.out.println(value);
		}
		
		
	}

}
