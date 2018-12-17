
public class Chicken extends Bird implements Flyable {

	public Chicken(int age, int weight, String gender, String animalType) {
		super(age, weight, gender, animalType);

	}

	@Override
	public void fly() {
		System.out.println("Chicken unable to fly.");
	}
	

}
