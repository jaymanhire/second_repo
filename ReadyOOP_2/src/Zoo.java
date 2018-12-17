
public class Zoo {
	public static void main(String[] args) {

		/*
		 * Animal sparrow1 = new Sparrow(1, 2, "M", "Sparrow"); sparrow1.move();
		 */

		Sparrow sparrow1 = new Sparrow(1, 2, "M", "Sparrow");
		//sparrow1.move();
		//sparrow1.fly();

		Animal fish1 = new Fish();
		//fish1.move();
		
		moveAnimals(fish1);
		moveAnimals(sparrow1);

	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}

}
