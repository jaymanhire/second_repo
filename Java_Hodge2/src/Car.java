import java.awt.Color;
// abstract window toolkit

public class Car {

	float averageMilesPerGallon;
	String licensePlate;
	Color paintColor;
	boolean areTailightsWorking;

	public Car(float inputMPG, String inputLicensePlate, Color inputPaintColor, boolean inputTaillightsWorking) {

		this.averageMilesPerGallon = inputMPG;
		this.licensePlate = inputLicensePlate;
		this.paintColor = inputPaintColor;
		this.areTailightsWorking = inputTaillightsWorking;

	}

	public void changePaintColor(Color newPaintColor) {
		this.paintColor = newPaintColor;
	}

	public double speedingUp(double currentSpeed) {
		return currentSpeed += 100;
	}

	public String toString() {
		String output = "~~~~~~~~~~~~~~~~" + "\n";
		output += "MPG: " + averageMilesPerGallon + "\n";
		output += "Plate: " + licensePlate + "\n";
		output += "Color: " + paintColor + "\n";
		output += "Tail lights working: " + areTailightsWorking + "\n";

		return output;

	}
}