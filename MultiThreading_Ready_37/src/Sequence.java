
public class Sequence {

	private int value = 0;
	// value is shared data
	// Again, this is three steps: value = value +1;
	
	
	public synchronized int getNext() {
		value++; 
		return value;
	}

	/*public int getNext() {	// synchronized block style
		synchronized (this) {
			value++; 
			return value;

		}

	}*/

}
