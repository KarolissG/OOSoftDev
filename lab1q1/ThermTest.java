// Student Name 	: Karolis Grigaliunas
// Student Id Number: C00287940
// Date 			: 
// Purpose 			: 

public class ThermTest { // begin class ThermTest
	public static void main(String args[]) { // being main method

		Thermometer thermA = new Thermometer(); // Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius());
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius());

	} // end main
} // end class ThermTest
