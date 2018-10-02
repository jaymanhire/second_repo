class Machine {

	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("Constructor running.");

	}

	public Machine(String name) {
		this();
		this.name = name;
		System.out.println("2nd Constructor running.");

	}

	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("3rd Constructor running.");
	}
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Jill");
		Machine machine3 = new Machine("Chalky", 7);

	}

}
