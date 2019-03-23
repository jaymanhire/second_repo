
public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action...");
	}

	// Doctors
	private void prescribeMedicine() {
		System.out.println("prescribe Medicine");
	}

	private void diagnosePatients() {
		System.out.println("Diagnosing Patients");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatients();
	}
}