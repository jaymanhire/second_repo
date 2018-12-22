package com.hashset.linkedhashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		//Prevents duplicate values		
		//HashSet doe not maintain order, LinkedHashSet maintains entry order
		//User defined objects: unable to compare accurately
		HashSet<Animal> animals = new HashSet<Animal>();
		
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2= new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		System.out.println(animal1.equals(animal4)); // Yields false if not using hash-equals
		System.out.println(animal1.hashCode());
		System.out.println(animal4.hashCode());
		
		for(Animal value: animals) {
			System.out.println(value);
		}
		
		
	}

}
