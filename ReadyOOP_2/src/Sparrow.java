
public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, int weight, String gender, String animalType) {
		super(age, weight, gender, animalType);

	}

	@Override
	public void fly() {
		System.out.println("Sparrow flying...");
	}

}
