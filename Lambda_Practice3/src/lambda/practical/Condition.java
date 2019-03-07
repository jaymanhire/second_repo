package lambda.practical;

@FunctionalInterface
public interface Condition {
	
	public boolean test(Car c);
}
