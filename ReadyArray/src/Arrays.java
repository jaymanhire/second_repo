
public class Arrays {

	public static void main(String[] args) {

		int[] values = new int[100];

		values[0] = 1000;
		int size = values.length;

		System.out.println("Size of values[]: " + size);
		System.out.println(values[0]);

		String[] words = { "Jay", " is ", "cool." };
		for (String vals : words) {
			System.out.print(vals);
			System.out.println();
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]);
		}
		System.out.println();

		boolean hungry = true;

		if (hungry) {
			System.out.println("I am hungry.");
		} else {
			System.out.println("I am not hungry.");
		}
		System.out.println("---------------------------");

		int hungerRating = 8;
		String ifHungry;
		if (hungerRating > 6) {
			ifHungry = "I am starving!";
		} else {
			ifHungry = "I am hungry...";
		}
		System.out.println(ifHungry);

	}

}
