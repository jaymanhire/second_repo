package processes;

public abstract class GeneralManufacturingProcess {

	private String processName;

	public GeneralManufacturingProcess(String name) {
		this.processName = name;
	}

	protected abstract void assembleDevice();

	protected abstract void testDevice();

	protected abstract void packageDevice();

	protected abstract void storeDevice();

	// Template Method
	public void launchProcess() {
		// Validate the process name
		if (processName != null && !processName.isEmpty()) {

			assembleDevice();	// This 'process' can be easilt altered
			testDevice();
			packageDevice();
			storeDevice();

		} else {
			System.out.println("No process name was specified.");
		}
	}
}
