
public class Machine implements Info, IStartable {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started.");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine ID is: " + id);
		
	}

	@Override
	public String machineType(String type) {
		return type;
	}

}
