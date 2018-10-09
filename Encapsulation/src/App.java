
class Plant {

	public static final int ID = 7;
	private String name;
	
	public String getData() {
		String data = "some stuff " + calculateGrowthForecast();
		return data;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class App {

	public static void main(String[] args) {
		
		Plant p1 = new Plant();
		p1.setName("Jay Manhire");
		System.out.println(p1.getName());
		System.out.println(p1.getData());
		System.out.println(Plant.ID);
		p1.setName("Billy Goodshoes");
		System.out.println(p1.getName());

	}

}
