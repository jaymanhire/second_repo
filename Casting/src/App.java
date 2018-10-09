
public class App {

	public static void main(String[] args) {
		byte byteVal = 20;
		short shortVal = 55;
		int intVal = 676;
		long longVal = 98798795;
		float floatVal = 883.45f;
		double doubleVal;
		
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);
		
		intVal = (int)longVal;
		System.out.println("Now holds the longVal: " + intVal);
		
		byteVal = (byte)132;
		System.out.println("Max is 127...Wraps around: " + byteVal);
		

	}

}
