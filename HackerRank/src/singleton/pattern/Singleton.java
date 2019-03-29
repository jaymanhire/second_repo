package singleton.pattern;

public class Singleton {

	private Singleton() {

	}

	private static Singleton INSTANCE = null;

	public String str;

	public static Singleton getSingleInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;

	}

}
