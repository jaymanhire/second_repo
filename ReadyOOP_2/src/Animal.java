
public abstract class Animal {

	int age;
	int weightInLbs;
	String gender;
	String animalType;

	public Animal(int age, int weight, String gender, String animalType) {
		this.age = age;
		this.weightInLbs = weight;
		this.gender = gender;
		this.animalType = animalType;
	}

	public Animal() {

	}

	public void eat() {
		System.out.println("The " + animalType + " is eating...");
	}

	public void sleep() {
		System.out.println("The " + animalType + " is sleeping...");
	}

	public void info() {
		System.out.println("Animal type: " + animalType);
		System.out.println("Animal age: " + age);
		System.out.println("Animal weight: " + weightInLbs);
		System.out.println("Gender: " + gender);
	}
	public abstract void move();
		
	

}
