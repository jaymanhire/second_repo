import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			
			if(value.equals("cat")) {
				it.remove();
			}
		}

		System.out.println();

		for (String aniString : animals) {
			System.out.println(aniString);
			
			
		}
		System.out.println();
		animals.remove(0);
		for (String aniString : animals) {
			System.out.println(aniString);
			
			
		}
		

	}
	

}
