import java.util.ArrayList;

class Machine {
	@Override
	public String toString() {
		return "I am a machine";
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
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

		showList(list1);
	}

	public static void showList(ArrayList<?> listy) {
		for (Object value : listy) {
			System.out.println(value);
		}
	}
}
