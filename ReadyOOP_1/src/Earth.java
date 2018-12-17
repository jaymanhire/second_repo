
public class Earth {
	
	public static void main(String[] args) {
		
		Human tom;
		tom = new Human();
		
		tom.name = "Tom Johnson";
		tom.age = 45;
		tom.eyeColor = "blue";
		tom.heightInInches = 70;
		tom.speak();
		tom.eat();
		
		
		System.out.println();
		
		Human joe = new Human();
		joe.age = 65;
		joe.eyeColor = "brown";
		joe.heightInInches = 72;
		joe.name = "Joe Brown";
		joe.speak();
		joe.eat();
		
		
		
		
	}

}
