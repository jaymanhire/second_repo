
public class VehicleFactory {

	public Vehicle getVehicle(VehicleType vehicleType) {
		return vehicleType.getVehicle(); 

		/*if (vehicleType.equalsIgnoreCase("TRUCK")) {
			return new Truck();
		} else if (vehicleType.equalsIgnoreCase("CAR")) {
			return new Car();
		} else if (vehicleType.equalsIgnoreCase("ELECTRIC")) {
			return new ElectricCar();
		}
		return null; */
	}

}
