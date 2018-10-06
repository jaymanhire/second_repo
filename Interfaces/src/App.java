
public class App {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		mach1.showInfo();
		person1.showInfo();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		IStartable start = new Machine();
		System.out.printf("%s", start.machineType("Bridgeport"));
		
		
		System.out.println();
		
		outPutInfo(mach1);
		outPutInfo(person1);

	}
	private static void outPutInfo(Info info) {
		info.showInfo();
	}

}
