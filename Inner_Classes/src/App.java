
public class App {

	public static void main(String[] args) {

		Robot robot = new Robot(7);
		robot.start();

		//Robot.Brain brain = robot.new Brain();  // Will work only if Brain is public
		//brain.think();    
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();

	}

}
