
public class App {

	public static void main(String[] args) {

		int month = 2;
		String monthString = null;

		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		default:
			System.out.println("Unknown month.");
			
		} 
		System.out.println(monthString);
		

	}

}
