import com.jlm.exceptions.MyRuntimeException;

public class MyFileUtils {

	public int subtract(int number) throws Exception {
		if (number < 10) {
			throw new MyRuntimeException("Number passed is less than 10.");
		}
		return number - 10;
	}

}
