public class TestLightBulb {
	public static void main(String[] args) {
		LightBulb smartLight = new LightBulb();
		// Output initial state
		System.out.println(smartLight.toString());
		
		// Turn the intensity dial 29 times
		for (int i = 0; i < 29; i++)
			smartLight.adjustDial();		
		// Check current state
		System.out.println(smartLight.toString());
		
		// Turn the light switch on or off 9 times
		for (int i = 0; i < 9; i++)
			smartLight.useSwitch();		
		// Check current state
		System.out.println(smartLight.toString());
		
		// Try changing the color
		smartLight.changeColor("Pink");
		smartLight.changeColor("Green");		
		// Check current state
		System.out.println(smartLight.toString());

	}
}

// You can define this class as public, but it must be in its own file then
class LightBulb {
	// set the data fields
	
	public LightBulb () {	
		// set up the constructor
	}
	
	// The dial revolves using modulus
	public void adjustDial() {
		// handle the dial
	}
	
	// Turning the light on or off reverses the boolean
	public void useSwitch() {
		// handle the on/off switch
	}
	
	// Only allow the 4 valid colors
	public void changeColor(String newColor) {
		// handle changing colors
	}
	
	// Returns the state of the LightBulb as a string
	public String toString() {
		// Convert the light bulb's state to string for output
		return ""; // placeholder
	}
	
}
