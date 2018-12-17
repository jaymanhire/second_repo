
public class App {

	public static void main(String[] args) {

		Answerable phone = () -> "Hello";

		System.out.println(phone.answer());

		Predicate isOdd = n -> n % 2 != 0;
		System.out.println(isOdd.test(6));

		Predicate isEven = n -> n % 2 == 0;
		System.out.println(isEven.test(14));
		
		// On the fly exponentiation
		Square s1 = (a) -> a * a;
		System.out.println(s1.powerFunc(5));

		Square s2 = (a) -> a * a * a;

		System.out.println(s2.powerFunc(8));

	}
}
