import world.Plant;

/*
 * private: Class only
 * public: anywhere
 * protected: same class, subclass, package
 * No modifier: same package only */

public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		//System.out.println(plant.type);
		
		//size is protected; App is not in same package
		//System.out.println(plant.size);
		
		//Different packages
		//System.out.println(plant.height);

	}

}
