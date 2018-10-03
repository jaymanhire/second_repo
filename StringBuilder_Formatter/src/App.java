
public class App {

	public static void main(String[]args) {
		
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder();
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb);
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		System.out.println(s.toString());
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was a new line.\n");
		
		System.out.printf("Total cost %10d; quantity: %d", 5, 120);
		
		for(int i = 0; i < 15; i++) {
			System.out.printf("%-2d: Some text\n", i);
		}
		
		System.out.printf("Total Value: %12.5f", 9879.321585);
		
		
		
		
	}

}
