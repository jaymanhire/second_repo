import world.Plant;

public class Grass extends Plant {
	public Grass() {
		
		//will not work Grass not in same package as Plant even though it's a subclass
		//System.out.println(this.height);
	}
}
