package world;

public class Oak extends Plant {
	
	public Oak() {
		// private type, will not work
		//type = "tree";
		
		this.size = "large";  // this works, same package
		
		// No access specifier works, package level access
		this.height = 10;
	}
}
