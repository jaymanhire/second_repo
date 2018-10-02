class Person {
	String name;
	int age;

	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		}
	}
}

public class App {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 45;
		person1.speak();

		Person person2 = new Person();
		person2.name = "Sara Smith";
		person2.age = 20;
		person2.speak();

		System.out.println(person1.name);

	}

}
