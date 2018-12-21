package com.bufferedreader;

class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing.");
	}
	
}
public class Application2 {

	public static void main(String[] args) {
		
		try(MyClass var = new MyClass();) {
			
			//var.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} // No need for finally block!

	}

}
