
public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Spot", 5);
		
		dog1.bark();
		
		int dogYears = dog1.getDogYears();
		System.out.println(dogYears + " dog years.");
		
		dog1.fetch();
		dog1.fetch();
		dog1.fetch();
		dog1.fetch();
		
		
		
	}

}
