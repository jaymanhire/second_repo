package practice.strings;

public class StringsPractice {
	
	public static void main(String[] args) {
		
		
		String a = "hello ";
		String b = "there";
		String ab = "Hello there.";
		System.out.println(a.length());
		
		System.out.println(a.charAt(1));
		String strJay = "Jay";
		System.out.println(a.concat(strJay));
		
		String str = "ABCDEFG";
		String extractedString = str.substring(2);
		System.out.println(extractedString);
		String middle = str.substring(2, 5);
		System.out.println(middle);
		
		System.out.println();
		
		int a2 = ab.indexOf("there");		
		System.out.println("a2: " + a2);
		
		if(a == b) {
			System.out.println("Do not use this.");
		}
		
		if(!a.equals(b)) {
			System.out.println("These are not equal.");
		}
		if(b.equalsIgnoreCase("THerE")) {
			System.out.println("Equal, even though case is unequal.");
		}
		
		
	}

}
