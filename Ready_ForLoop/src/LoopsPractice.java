
public class LoopsPractice {

	public static void main(String[] args) {

		String name = "sdjfskfjsknskjv";

		/*
		 * for (int i = 0; i < name.length(); i++) { // Loops as long as there are
		 * characters System.out.println("char: " + name.charAt(i)); } for (int i = 0; i
		 * <= name.length() - 1; i++) { // Loops as long as there are characters
		 * System.out.println("char: " + name.charAt(i)); }
		 */

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println("chars in reverse: " + name.charAt(i));

		}
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even i: " + i);
			}
		}
		for(int i = 0; i <=100; i += 2) {
			System.out.println("Even i: " + i);
		}
		

			/*
			 * String name5 = "sdjfskfjsknskjv";
			 * 
			 * for(int i = 0; i < name5.length(); i++) { // Loops as long as there are
			 * characters System.out.println("i: " + i); }
			 */

		}

	}

