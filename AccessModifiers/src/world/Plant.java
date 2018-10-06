package world;

public class Plant {
	
	//Bad practice
	public String name;
	
	//Acceptable, it's final
	public static final int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Freddy";		
		this.type = "plant";		
		this.size = "medium";
		this.height = 8;
		
	}
}
