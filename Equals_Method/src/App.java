class Person {
	private int id;
	private String name;

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class App {

	public static void main(String[] args) {
		
		System.out.println(new Object());

		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");

		System.out.println(person1.equals(person2));

		/*
		 * double value1 = 7.2; double value2 = 7.2;
		 */

		Double value3 = 7.2;
		Double value4 = 7.2;

		// System.out.println(value1 == value2);
		// System.out.println(value3 == value4);
		System.out.println(value3.equals(value4));

		Integer num1 = 5;
		Integer num2 = 5;
		System.out.println(num1.equals(num2));
		// System.out.println(num1 == num2);
		
		String text1 = "Hello";
		String text2 = "Hellohgvh".substring(0, 5);
		System.out.println(text2);
		//System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
		
		
	}

}
