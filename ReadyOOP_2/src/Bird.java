
public class Bird extends Animal {
	
	public Bird(int age, int weight, String gender, String animalType) {
		super(age, weight, gender, animalType);
		
	}

	public Bird() {
		System.out.println("Bird No argument constructor running.");
	}

	public void fly() {
		System.out.println("Bird Flying...");
	}

}
