
public class EmergencyRoomProcess {

	public static void main(String[] args) {

		HospitalManagement ERDirector = new HospitalManagement();
		
		Employee peggy = new Nurse(1, "Peggy", "emergency", true);		
		ERDirector.callUpon(peggy);
		
		System.out.println();
		
		Employee jay = new Doctor(2, "Jay", "emergency", true);
		ERDirector.callUpon(jay);

	}

}
