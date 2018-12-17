
public class Zoo {
	public static void main(String[] args) {
		
		Animal lion = new Animal(5, 550, "M", "Lion");
		lion.eat();
		lion.info();
		System.out.println();
		
		Bird bird1 = new Bird();
		Bird bird2 = new Bird(2, 1, "F", "Eagle");
		
		bird1.fly();
		
		
		bird2.eat();
		bird2.info();
		
		
		
		
		
		
		
		
	}

}
