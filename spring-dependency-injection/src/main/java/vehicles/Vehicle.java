package vehicles;
import parts.Engine;

public class Vehicle {

	//Engine racingEngine = new LargeEngine(500);
	
	private Engine myEngine;	
	
	public Vehicle(Engine myEngine) {
		this.myEngine = myEngine;
	}

	public void crankIgnition() {

		myEngine.startEngine();
		System.out.println("Vehicle is running");
	}

}