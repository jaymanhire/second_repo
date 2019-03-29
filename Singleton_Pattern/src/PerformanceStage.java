
public class PerformanceStage {
	
	// "PerformanceStage" is the Singleton

	private static PerformanceStage INSTANCE = null;
	
	private static int counter;

	// no public constructor in a Singleton
	private PerformanceStage() {
		counter++;
	}

	public synchronized static PerformanceStage getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}
	
	public void turnOnLights() {
		System.out.println("turned on lights...");
	}
	
	public int getCounter() {
		return counter;
		
	}

}
