
class Thing {
	public static final int LUCKY_NUMBER = 7;

	public String name;
	public static String description;

	private static int count = 0;
	
	private int id = 0;

	public Thing() {
		id = getCount();
		setCount(getCount() + 1);
	}

	public void showName() {
		System.out.println("Object ID: " + id + ", " + description + ": " + name);
	}

	public static void showInfo() {
		System.out.println(description);
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Thing.count = count;
	}
}

public class App {

	public static void main(String[] args) {

		Thing.description = "I am a thing";
		// System.out.println(Thing.description);

		Thing.showInfo();
		System.out.println("Before creating objects, count is: " + Thing.getCount());

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After creating objects, count is: " + Thing.getCount());

		thing1.name = "Bob";
		thing2.name = "Sue";

		thing1.showName();
		thing2.showName();

		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
		

	}

}
