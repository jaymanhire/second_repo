import java.util.ArrayList;

class Machine {
	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine started.");
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}

	public void snap() {
		System.out.println("snap!");
	}
}

public class App {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());

		showList(list2);
		showList2(list1);
	}

	public static void showList(ArrayList<? extends Machine> listy) {
		for (Machine value : listy) {
			System.out.println(value);
			value.start();
		}
	}

	public static void showList2(ArrayList<? super Camera> listy) {
		for (Object value : listy) {
			System.out.println(value);

		}
	}
}
