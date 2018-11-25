import java.awt.Color;

public class Main {

	public static void main(String[] args) {

		System.out.println("Car class:");

		Car car1 = new Car(25.5f, "1BC32E", Color.BLUE, true);

		Car car2 = new Car(13.9f, "3D20BN", Color.BLUE, false);
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());

		System.out.println("car1 license plate: " + car1.licensePlate);
		
		System.out.println("car1 color: " + car1.paintColor.toString());		
		car1.changePaintColor(Color.RED);
		System.out.println("car1 color: " + car1.paintColor);
		
		

	}

}
