
public class Person implements Info, IStartable {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello there.");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is: " + name);
		
	}

	@Override
	public String machineType(String type) {		
		return type;
	}

}
