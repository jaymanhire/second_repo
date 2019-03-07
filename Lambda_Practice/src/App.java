
public class App {

	public static void main(String[] args) {

		Human tom = new Human();
		//walker(tom);

		Robot wale = new Robot();
		//walker(wale);
		
		walker(() -> System.out.println("Custom object walking..."));
		
		Walkable aBlockOfCode = () -> {
			System.out.println("Custom object walking...");
			System.out.println("the object tripped...");
		};		
		walker(aBlockOfCode);
	}
		
		/*walker(() -> {
			System.out.println("Custom object walking...");
			System.out.println("the object tripped...");

		});
	}*/
	
	
	
	
	
		/*walker(new Walkable() {  
			//This gets converted to a lambda
			@Override
			public void walk() {
				System.out.println("Custom object walking...");
			}
		});
	}*/

	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

	/*
	 * public static void walker(Human human) { human.walk(); }
	 */

}
