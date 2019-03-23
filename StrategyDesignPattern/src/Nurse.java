
public class Nurse extends Employee {

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in action...");

	}

	// Nurses
	private void checkVitalSigns() {
		System.out.println("Checking Vitals");
	}

	private void drawBlood() {
		System.out.println("Drawing blood");
	}

	private void cleanPatientArea() {
		System.out.println("Cleaning patient area");
	}

	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();

	}

}
