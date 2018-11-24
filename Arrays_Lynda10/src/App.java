import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		numbers[0] = 31;
		numbers[1] = 45;
		numbers[2] = 22;
		numbers[3] = 98;
		numbers[4] = 10;
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		for(int nums: numbers) {
			System.out.print(nums + " \n");
		}
		System.out.println(numbers);

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int[] numbers2 = { 31, 45, 22, 98, 10 };
		

		for (int i = 0; i < numbers2.length; i++) {
			if (i < numbers2.length - 1) {
				System.out.print(numbers2[i] + ", ");
			} else {
				System.out.println(numbers2[i]);
			}

		}
		String[] myFavCB = {"Twix","Hershey's","Crunch"};
		System.out.println("Index 1: " + myFavCB[1]);
		myFavCB[2] = "Butterfinger";
		System.out.println("Index 2: "+ myFavCB[2] ) ;
		System.out.println("Length: " + myFavCB.length);
		
		System.out.println(Array.get(myFavCB, 2));

	}

}
