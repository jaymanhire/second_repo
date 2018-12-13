import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Dog d = new Dog();
		// d.play();

		Cat c = new Cat();
		// c.play();

		if (c instanceof Pet) {
			c.play();
		}
		if (d instanceof Pet) {
			d.play();
		}
		
		Pet p;
		Random rand = new Random();
		int n = rand.nextInt(2);	//We know only that the one of the pets is playing until runtime

		if (n == 0) {
			p = new Dog();
		} else {
			p = new Cat();
		}
		p.play();

	}

}
