package car_dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cust1 = new Customer("Tom Jones", "123 Lois Lane", 12000);
		/*
		 * cust1.setName("Tom"); cust1.setAddress("123 Lois Lane");
		 * cust1.setCashOnHand(12000);
		 */

		Vehicle vehicle = new Vehicle("Chevy", "Corvette", 7000.99);
		/*
		 * vehicle.setMake("Chevy"); vehicle.setModel("Corvette");
		 * vehicle.setPrice(87000.99);
		 */

		Employee emp = new Employee();

		cust1.purchaseCar(vehicle, emp, false);

		Vehicle car = new Vehicle("Chevy", "Corvette", 7000.99);

		boolean value = car.equals(vehicle);
		System.out.println(value);

	}

}
