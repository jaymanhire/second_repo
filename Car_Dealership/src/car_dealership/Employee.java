package car_dealership;

public class Employee {

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle); // customer pays in cash

		} else {
			System.out.println("Customer needs more money to purchase vehicle: " + vehicle);
		}
	}

	private void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved for this vehicle.");

	}

	public void processTransaction(Customer cust, Vehicle vehicle) {

		System.out.println("Customer has purchased the vehicle.\n" + vehicle + "Price: " + vehicle.getPrice());

	}

}
