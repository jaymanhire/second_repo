
public class App {

	public static void main(String[] args) {

		Human tom = new Human();
		// walker(tom);

		Robot wale = new Robot();
		// walker(wale);

		walker(() -> System.out.println("Custom object walking..."));

		Walkable aBlockOfCode = () -> {
			System.out.println("Custom object walking...");
			System.out.println("the object tripped...");
		};
		walker(aBlockOfCode);

		ALambdaInterface helloVar = () -> System.out.println("hello there");
		helloVar.someMethod();
		Calculate sumVar = (a, b) -> a + b;
		System.out.println(sumVar.compute(5, 55));
		
		Calculate nonoZeroDivider  = (a, b) -> {
			if(a == 0) {
				return 0;
			}
			return a/b;
		};
		System.out.println(nonoZeroDivider.compute(10, 2));
	
	
		MyGenericInterface<String> reverser = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.work("Apple"));
		
		MyGenericInterface<Long> compute = (num) -> {
			
				long result = 1;
				for(int i = 1; i <= num; i++) {
					result = i * result;
				}
				return result;
		};
		System.out.println(compute.work((long) 14));
	}

	public void sayHello() {
		System.out.println("hello there");
	}

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	public int nonoZeroDivider(int arg1, int arg2) {
		if(arg1 == 0) {
			return 0;
		}
		return arg1/arg2;
	}

	public String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	
	public int factorial(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result = i * result;
		}
		return result;
	}

	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
}

interface Calculate {
	public int compute(int a, int b);
}
interface MyGenericInterface<T> {
	public T work(T t);
}
interface NumberWorker {
	public long computedFact(long num);
}
