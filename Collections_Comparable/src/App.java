import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(10);
		newList.add(67);
		newList.add(15);
		
		//boolean hasValue = list1.contains(67);
		//list1.clear();
		//boolean isEmpty = list1.isEmpty();
		list1.retainAll(newList);
		
		//list1.addAll(newList);
		//list1.removeAll(newList);
		
		System.out.println(list1);
		
		
		

	}

}
