
public class App {

	public static void main(String[] args) {

		for (Season time : Season.values()) {
			System.out.println(time + "\t" + time.getSpan());
		}

	}
}