
public class Dog {

	private String name;
	private int age;
	private String[] fetchedItems = { "bone", "stick", "ball" };
	private int fetchCounter = 0;

	public Dog(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void bark() {
		System.out.println("Bark! Ruff!!");
	}
	
	public int getDogYears() {
		return this.age * 7;
	}
	
	public void fetch() {
		this.fetchCounter = (this.fetchCounter + 1) % 3;
		String item = this.fetchedItems[this.fetchCounter];
		System.out.println(name + " fetched a " + item + ".");
		
		
		
	}


}
