package cients;
import processes.GeneralManufacturingProcess;
import processes.LaptopManufacturingProcess;
import processes.SmartphoneManufacturinProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		
		GeneralManufacturingProcess manufacturer = new SmartphoneManufacturinProcess("IPhone process");
		manufacturer.launchProcess();
		
		System.out.println();
		
		GeneralManufacturingProcess sp = new LaptopManufacturingProcess("Samsung SmartPhone"); 
		sp.launchProcess();
		
		

	}

}
