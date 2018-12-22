package com.lesson2.ready;

import java.util.ArrayList;

public class Traversing_CustomTypes {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();

		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");

		/*
		 * for (int i = 0; i < animals.size(); i++) {
		 * System.out.println(animals.get(i)); }
		 * 
		 * for (String anims : animals) { System.out.println(anims); }
		 */

		ArrayList<Vehicle> vehicles = new ArrayList<>(10);

		/*Vehicle vehicle2 = new Vehicle("Honda", "Accord", 12000, false);	// Option 1
		vehicles.add(vehicle2);*/
		
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));		//Option 2
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		vehicles.add(new Vehicle("Chevy", "Malibu", 16500, false));
		
		for(Vehicle car: vehicles) {
			System.out.println(car.toString());
		}

		/*for (Vehicle car : vehicles) {
			System.out.println(car.getMake());
			System.out.println(car.getModel());
		}*/

	}
}
