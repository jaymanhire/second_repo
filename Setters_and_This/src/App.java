class Frog {
	
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}

public class App {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		frog1.setName("Bertie");
		frog1.setAge(1);
		//frog1.age = 1;  no longr possible to access data members
		//frog1.name = "Bertie";
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		frog1.setInfo("Jay", 5);
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());

	}

}
